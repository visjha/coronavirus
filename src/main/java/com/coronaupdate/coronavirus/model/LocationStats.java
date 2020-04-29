package com.coronaupdate.coronavirus.model;

public class LocationStats {
	
	private String country;
	private String state;
	private int latestResult;
	private int diffFromPrevDay;
	
	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLatestResult() {
		return latestResult;
	}
	public void setLatestResult(int latestResult) {
		this.latestResult = latestResult;
	}
	@Override
	public String toString() {
		return "LocationStats [country=" + country + ", state=" + state + ", latestResult=" + latestResult + "]";
	}
	

}
