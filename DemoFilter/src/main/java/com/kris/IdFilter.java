package com.kris;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


public class IdFilter implements Filter {

    public IdFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request; // type casting the object
		int stuID = Integer.parseInt(request.getParameter("Sid"));
		PrintWriter out = response.getWriter();
		
		if(stuID>5) {
		  	chain.doFilter(request, response);
            out.println("response back ");
		}
		else
		{
			out.println("Invalid input");
		}	
			
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
