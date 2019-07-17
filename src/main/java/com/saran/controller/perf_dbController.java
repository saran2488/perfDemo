package com.saran.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saran.dao.AppDAOImp;
import com.saran.dao.ApplistDAO;
import com.saran.web.perf_db;

public class perf_dbController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ApplistDAO applistdao = null;

    public perf_dbController() {
    	applistdao = new AppDAOImp();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<perf_db> list = new ArrayList<perf_db>();
		List<perf_db> apps = new ArrayList<perf_db>();
		
			String caseStr = (String)req.getParameter("case");
			String appName = (String)req.getParameter("AppName");
			String runID= (String)req.getParameter("RefID");
			
		if(caseStr.equals("1")) {
			
		list = applistdao.get();
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/application-list.jsp");
		dispatcher.forward(req, res);
		} else if(caseStr.equals("2")){
			
		apps = applistdao.getAppDetails(appName);
		req.setAttribute("apps", apps);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view-appDetails.jsp");
		dispatcher.forward(req, res);
		
		} else if(caseStr.equals("3")){
			
		list = applistdao.gettestrun(runID);
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/run-details.jsp");
		dispatcher.forward(req, res);
		}
			/*	
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/application-list.jsp");
		
		dispatcher.forward(req, res);
		*/
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		List<perf_db> list = new ArrayList<perf_db>();
		List<perf_db> apps = new ArrayList<perf_db>();
		
			String caseStr = (String)req.getParameter("case");
			String appName = (String)req.getParameter("AppName");
			String runID= (String)req.getParameter("RefID");
			
		if(caseStr.equals("1")) {
			
		list = applistdao.get();
		req.setAttribute("list", list);
		System.out.println("Inside DoPost");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/application-list.jsp");
		dispatcher.forward(req, res);
		} else if(caseStr.equals("2")){
			
		apps = applistdao.getAppDetails(appName);
		req.setAttribute("apps", apps);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view-appDetails.jsp");
		dispatcher.forward(req, res);
		
		} else if(caseStr.equals("3")){
			
		list = applistdao.gettestrun(runID);
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/run-details.jsp");
		dispatcher.forward(req, res);
		}
			/*	
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/application-list.jsp");
		
		dispatcher.forward(req, res);
		*/
	}

}
