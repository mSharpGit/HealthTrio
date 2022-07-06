package com.example.HealthTrioExercise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * This class is annotated with @JsonIgnoreProperties to indicate
 * that any properties not bound in this type should be ignored.
 *
 * It implements comparable to sort the object by Pct_hospitals_mu percentage.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cmsehr implements Comparable<Cmsehr>{

    private String region;
    private String region_code;
    private int period;
    private double pct_md_pa_np_mu_aiu;
    private double pct_md_pa_np_mu;
    private double pct_md_mu_aiu;
    private double pct_md_mu;
    private double pct_np_mu_aiu;
    private double pct_np_mu;
    private double pct_pa_mu_aiu;
    private double pct_pa_mu;
    private double pct_hospitals_mu_aiu;
    private double pct_hospitals_mu;
    private double pct_cah_small_rural_mu_aiu;


    public Cmsehr() {
    }

    @Override
    public String toString() {
        return "region='" + region + '\'' +
                ", pct_hospitals_mu=" + pct_hospitals_mu;
    }

    public String getRegion() {
        return region;
    }

    public String getRegion_code() {
        return region_code;
    }

    public int getPeriod() {
        return period;
    }

    public double getPct_md_pa_np_mu_aiu() {
        return pct_md_pa_np_mu_aiu;
    }

    public double getPct_md_pa_np_mu() {
        return pct_md_pa_np_mu;
    }

    public double getPct_md_mu_aiu() {
        return pct_md_mu_aiu;
    }

    public double getPct_md_mu() {
        return pct_md_mu;
    }

    public double getPct_np_mu_aiu() {
        return pct_np_mu_aiu;
    }

    public double getPct_np_mu() {
        return pct_np_mu;
    }

    public double getPct_pa_mu_aiu() {
        return pct_pa_mu_aiu;
    }

    public double getPct_pa_mu() {
        return pct_pa_mu;
    }

    public double getPct_hospitals_mu_aiu() {
        return pct_hospitals_mu_aiu;
    }

    public double getPct_hospitals_mu() {
        return pct_hospitals_mu;
    }

    public double getPct_cah_small_rural_mu_aiu() {
        return pct_cah_small_rural_mu_aiu;
    }

    public double getPct_cah_small_rural_mu() {
        return pct_cah_small_rural_mu;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setPct_md_pa_np_mu_aiu(double pct_md_pa_np_mu_aiu) {
        this.pct_md_pa_np_mu_aiu = pct_md_pa_np_mu_aiu;
    }

    public void setPct_md_pa_np_mu(double pct_md_pa_np_mu) {
        this.pct_md_pa_np_mu = pct_md_pa_np_mu;
    }

    public void setPct_md_mu_aiu(double pct_md_mu_aiu) {
        this.pct_md_mu_aiu = pct_md_mu_aiu;
    }

    public void setPct_md_mu(double pct_md_mu) {
        this.pct_md_mu = pct_md_mu;
    }

    public void setPct_np_mu_aiu(double pct_np_mu_aiu) {
        this.pct_np_mu_aiu = pct_np_mu_aiu;
    }

    public void setPct_np_mu(double pct_np_mu) {
        this.pct_np_mu = pct_np_mu;
    }

    public void setPct_pa_mu_aiu(double pct_pa_mu_aiu) {
        this.pct_pa_mu_aiu = pct_pa_mu_aiu;
    }

    public void setPct_pa_mu(double pct_pa_mu) {
        this.pct_pa_mu = pct_pa_mu;
    }

    public void setPct_hospitals_mu_aiu(double pct_hospitals_mu_aiu) {
        this.pct_hospitals_mu_aiu = pct_hospitals_mu_aiu;
    }

    public void setPct_hospitals_mu(double pct_hospitals_mu) {
        this.pct_hospitals_mu = pct_hospitals_mu;
    }

    public void setPct_cah_small_rural_mu_aiu(double pct_cah_small_rural_mu_aiu) {
        this.pct_cah_small_rural_mu_aiu = pct_cah_small_rural_mu_aiu;
    }

    public void setPct_cah_small_rural_mu(double pct_cah_small_rural_mu) {
        this.pct_cah_small_rural_mu = pct_cah_small_rural_mu;
    }

    private double pct_cah_small_rural_mu;


    //CompareTo method to sort the Cmsehr data by Pct_hospitals_mu percentage
    @Override
    public int compareTo(Cmsehr cms) {
        if(this.getPct_hospitals_mu() > cms.getPct_hospitals_mu()) {
            return -1;
        }else if(this.getPct_hospitals_mu() < cms.getPct_hospitals_mu()){
            return 1;
        }else{
            return 0;
        }
    }
}
