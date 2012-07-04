package com.sopovs.moradanen.thrift;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;

public class HelloServlet extends TServlet implements HttpRequestHandler {
	private static final long serialVersionUID = 1L;

	@Autowired
	public HelloServlet(TProcessor processor, TProtocolFactory protocolFactory) {
		super(processor, protocolFactory);
	}

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		doPost(request, response);
	}
}
