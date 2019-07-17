package com.saran.web;

public class perf_db {

	private int RefID;
	private String Date_Time;
	private String Testname;
	private String TestrunID;
	private String SteadystateDuration;
	private String ApplicationName;
	
	

	public int getRefID() {
		return RefID;
	}
	public void setRefID(int refID) {
		RefID = refID;
	}
	public String getDate_Time() {
		return Date_Time;
	}
	public void setDate_Time(String date_Time) {
		Date_Time = date_Time;
	}
	public String getTestname() {
		return Testname;
	}
	public void setTestname(String testname) {
		Testname = testname;
	}
	public String getTestrunID() {
		return TestrunID;
	}
	public void setTestrunID(String testrunID) {
		TestrunID = testrunID;
	}
	public String getSteadystateDuration() {
		return SteadystateDuration;
	}
	public void setSteadystateDuration(String steadystateDuration) {
		SteadystateDuration = steadystateDuration;
	}
	public String getApplicationName() {
		return ApplicationName;
	}
	public void setApplicationName(String applicationName) {
		ApplicationName = applicationName;
	}
	
	@Override
	public String toString() {
		return "perf_db [RefID=" + RefID + ", Date_Time=" + Date_Time + ", Testname=" + Testname + ", TestrunID="
				+ TestrunID + ", SteadystateDuration=" + SteadystateDuration + ", ApplicationName=" + ApplicationName
				+ "]";
	}

	
}
