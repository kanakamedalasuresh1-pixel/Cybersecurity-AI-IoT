package com.vcube.cybersecurity_aiot.model;


	

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	@Entity
	public class Device {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String deviceName;
	    private double temperature;

	    private double humidity;

	    private String status;

	    public Device() {

	    }

	    public Long getId() {
	        return id;
	    }

	    public String getDeviceName() {
	        return deviceName;
	    }

	    public void setDeviceName(String deviceName) {
	        this.deviceName = deviceName;
	    }

	    public double getTemperature() {
	        return temperature;
	    }

	    public void setTemperature(double temperature) {
	        this.temperature = temperature;
	    }

	    public double getHumidity() {
	        return humidity;
	    }

	    public void setHumidity(double humidity) {
	        this.humidity = humidity;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }
	}


