package com.example.HealthTrioExercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class HealthTrioExerciseApplication {

	//Logger to send the out put to the console
	private static final Logger log = LoggerFactory.getLogger(HealthTrioExerciseApplication.class);

	public static void main(String[] args) {
		//Running the Spring Application
		ConfigurableApplicationContext context = SpringApplication.run(HealthTrioExerciseApplication.class, args);
		context.close();
	}

	//RestTemplate to process the incoming data.
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	//CommandLineRunner is used to fetch the data on startup
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Cmsehr cmsehr[] = restTemplate.getForObject(
					"https://www.healthit.gov/data/open-api?source=Meaningful-Use-Acceleration-Scorecard.csv", Cmsehr[].class);

			List<Cmsehr> filteredList;
			List<Cmsehr> originalList = Arrays.asList(cmsehr);
			//Using this set of filters to reduce the time complexity to O(n);
			Integer years[] = {2014};
			Set<Integer> nameFilterSet = yearFilter(years).stream().collect(Collectors.toSet());

			//Filter the list by year 2014
			filteredList = originalList.stream()
					.filter(cms -> nameFilterSet.contains(cms.getPeriod()))
					.collect(Collectors.toList());

			//Sort the filtered list by Pct_hospitals_mu percentage
			Collections.sort(filteredList);
			for(Cmsehr c : filteredList) {
				log.info(c.getRegion() + " : " + c.getPct_hospitals_mu());

			}
		};
	}
	//Method to filter the year
	private List<Integer> yearFilter(Integer[] years) {
		return Arrays.asList(years);
	}
}
