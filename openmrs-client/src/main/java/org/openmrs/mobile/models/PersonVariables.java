package org.openmrs.mobile.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
/**
 * Created by Adria on 25/03/2017.
 */

public class PersonVariables implements Serializable {

    @SerializedName("water")
    @Expose
    private String water;
    @SerializedName("area")
    @Expose
    private String area;
    @SerializedName("light")
    @Expose
    private String light;
    @SerializedName("energy")
    @Expose
    private String energy;
    @SerializedName("people")
    @Expose
    private String people;
    @SerializedName("sons")
    @Expose
    private String sons;
    @SerializedName("gps")
    @Expose
    private String gps;
    @SerializedName("lenguage")
    @Expose
    private String lenguage;
    @SerializedName("illiterate")
    @Expose
    private String illiterate;
    @SerializedName("job")
    @Expose
    private String job;

    /**
     *
     * @return
     *     The water
     */
    public String getWater() {
        return water;
    }
    /**
     *
     * @param water
     *     The water
     */
    public void setWater(String water) {
        this.water = water;
    }
    /**
     *
     * @return
     *     The area
     */
    public String getArea() {
        return area;
    }
    /**
     *
     * @param area
     *     The area
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     *
     * @return
     *     The light
     */
    public String getLight() {
        return light;
    }
    /**
     *
     * @param light
     *     The light
     */
    public void setLight(String light) {
        this.light = light;
    }
    /**
     *
     * @return
     *     The energy
     */
    public String getEnergy() {
        return energy;
    }
    /**
     *
     * @param energy
     *     The energy
     */
    public void setEnergy(String energy) {
        this.energy = energy;
    }
    /**
     *
     * @return
     *     The people
     */
    public String getPeople() {
        return people;
    }
    /**
     *
     * @param people
     *     The people
     */
    public void setPeople(String people) {
        this.people = people;
    }
    /**
     *
     * @return
     *     The sons
     */
    public String getSons() {
        return sons;
    }
    /**
     *
     * @param sons
     *     The sons
     */
    public void setSons(String sons) {
        this.sons = sons;
    }
    /**
     *
     * @return
     *     The gps
     */
    public String getGps() {
        return gps;
    }
    /**
     *
     * @param gps
     *     The gps
     */
    public void setGps(String gps) {
        this.gps = gps;
    }
    /**
     *
     * @return
     *     The lenguage
     */
    public String getLenguage() {
        return lenguage;
    }
    /**
     *
     * @param lenguage
     *     The lenguage
     */
    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }
    /**
     *
     * @return
     *     The illiterate
     */
    public String getIlliterate() {
        return illiterate;
    }
    /**
     *
     * @param illiterate
     *     The illiterate
     */
    public void setIlliterate(String illiterate) {
        this.illiterate = illiterate;
    }
    /**
     *
     * @return
     *     The job
     */
    public String getJob() {
        return job;
    }
    /**
     *
     * @param job
     *     The job
     */
    public void setJob(String job) {
        this.job = job;
    }
}