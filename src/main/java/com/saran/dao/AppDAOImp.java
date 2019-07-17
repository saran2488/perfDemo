package com.saran.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.saran.DBConn.DBConnectionUtil;
import com.saran.web.perf_db;

public class AppDAOImp implements ApplistDAO {

	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	
	public List<perf_db> get() {
	
		List<perf_db> list = null;
		perf_db applications = null;
		
		try {
			
			list = new ArrayList<perf_db>();
			
			String sql = "select DISTINCT ApplicationName from perf_db";
			
			conn = DBConnectionUtil.openConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			
			System.out.println("case1");
			
			while(rs.next()) {
			
				applications = new perf_db();
				applications.setApplicationName(rs.getString("ApplicationName"));
	
				list.add(applications);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		} 
		return list;
	}

	public List<perf_db> getAppDetails(String appName) {
		
		List<perf_db> apps = null;
		perf_db applications = null;
		
		try {
			apps = new ArrayList<perf_db>();
			
//			String sql = "select DISTINCT ApplicationName from perf_db";
			
			String sql = "select * from perf_db where ApplicationName='"+appName+"'";
			
			conn = DBConnectionUtil.openConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			
			System.out.println("case2");
			
			while(rs.next()) {
			
				applications = new perf_db();
				applications.setRefID(rs.getInt("RefID"));
				applications.setDate_Time(rs.getString("Date_Time"));
				applications.setTestname(rs.getString("Testname"));
				applications.setTestrunID(rs.getString("TestrunID"));
				applications.setSteadystateDuration(rs.getString("SteadystateDuration"));
				applications.setApplicationName(rs.getString("ApplicationName"));
	
				apps.add(applications);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		} 
//			finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				System.out.println("Exception while closing connection.");
//				e.printStackTrace();
//			}
//		}
		return apps;
	}


	public List<perf_db> gettestrun(String runID) {
		
		List<perf_db> list = null;
		perf_db applications = null;
		
		try {
			list = new ArrayList<perf_db>();
			
//			String sql = "select DISTINCT ApplicationName from perf_db";
			
			String sql = "select * from perf_db where RefID='"+runID+"'";
			
			conn = DBConnectionUtil.openConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			
			System.out.println("gettestrun");
			
			while(rs.next()) {
			
				applications = new perf_db();
				applications.setRefID(rs.getInt("RefID"));
				applications.setDate_Time(rs.getString("Date_Time"));
				applications.setTestname(rs.getString("Testname"));
				applications.setTestrunID(rs.getString("TestrunID"));
				applications.setSteadystateDuration(rs.getString("SteadystateDuration"));
				applications.setApplicationName(rs.getString("ApplicationName"));
	
				list.add(applications);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		} 
//			finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				System.out.println("Exception while closing connection.");
//				e.printStackTrace();
//			}
//		}
		return list;
	}

}
