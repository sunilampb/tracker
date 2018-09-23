package com.ade.Entity;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "Vehicle.getAll", query = "Select vl from Vehicle vl"),
                @NamedQuery(name = "Vehicle.getOne", query = "Select vl from Vehicle vl WHERE vl.id= :id")
        }
)
public class Vehicle {

    @Id
    private String vin;
    private float latitude;
    private float longitude;
    private String timestamp;
    private float fuelVolume;
    private int speed;
    private int engineHp;
    private String checkEngineLightOn;
    private String engineCoolantLow;
    private String cruiseControlOn;
    private int engineRpm;

    @OneToOne(cascade = CascadeType.ALL)
    private Tires tires;

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setFuelVolume(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngineHp(int engineHp) {
        this.engineHp = engineHp;
    }

    public void setCheckEngineLightOn(String checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public void setEngineCoolantLow(String engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public void setCruiseControlOn(String cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public void setEngineRpm(int engineRpm) {
        this.engineRpm = engineRpm;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String getVin() {
        return vin;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public float getFuelVolume() {
        return fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEngineHp() {
        return engineHp;
    }

    public String isCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public String isEngineCoolantLow() {
        return engineCoolantLow;
    }

    public String isCruiseControlOn() {
        return cruiseControlOn;
    }

    public int getEngineRpm() {
        return engineRpm;
    }

    public Tires getTires() {
        return tires;
    }

    @Override
    public String toString() {
        return "Vehicle_New{" +
                "vin='" + vin + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timestamp='" + timestamp + '\'' +
                ", fuelVolume=" + fuelVolume +
                ", speed=" + speed +
                ", engineHp=" + engineHp +
                ", checkEngineLightOn=" + checkEngineLightOn +
                ", engineCoolantLow=" + engineCoolantLow +
                ", cruiseControlOn=" + cruiseControlOn +
                ", engineRpm=" + engineRpm +
                ", tires=" + tires +
                '}';
    }
}
