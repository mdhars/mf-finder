package com.mymf.base;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gmail.SendGmail;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
			SendGmail.send();
			resp.getWriter().write("Email Send: Done");
		}catch(Exception e){
			resp.getWriter().write("Email Send: Failed");
		}
		
	}

	
}
