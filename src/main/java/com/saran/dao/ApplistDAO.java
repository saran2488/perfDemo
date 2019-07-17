package com.saran.dao;

import java.util.List;

import com.saran.web.perf_db;

public interface ApplistDAO {
	
	List<perf_db> get();
	List<perf_db> getAppDetails(String appName);
	List<perf_db> gettestrun(String runID);

}
