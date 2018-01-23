package com.sp.log4j;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




/**
 * Servlet implementation class Log4jDemoServlet
 */
@WebServlet("/Log4jDemoServlet")
public class Log4jDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = LogManager.getLogger(Log4jDemoServlet.class.getName());
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LOG.debug("This Will Be Printed On Debug");
		LOG.info("This Will Be Printed On Info");
		LOG.warn("This Will Be Printed On Warn");
		LOG.error("This Will Be Printed On Error");
		LOG.fatal("This Will Be Printed On Fatal");

		
		// LOGGER.debug("Debug Message Logged !!!");
	     //   LOGGER.info("Info Message Logged !!!");
	       // LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
		
	}

}
