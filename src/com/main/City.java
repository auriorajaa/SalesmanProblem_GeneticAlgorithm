package com.main;

public class City {
	
	private static final double EARTH_EQUATORIAL_RADIUS = 6378.1370D;
	private static final double CONVERT_DEGREES_TO_RADIANS = Math.PI/180D;
	private static final double CONVERT_KM_TO_MILES = 0.621371;
	
	private double longitude;
	private double latitude;
	private String name;
	
	public City(double longitude, double latitude, String name) {
		super();
		this.longitude = longitude * CONVERT_DEGREES_TO_RADIANS;
		this.latitude = latitude * CONVERT_DEGREES_TO_RADIANS;
		this.name = name;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public String getName() {
		return name;
	}
	
	
}
