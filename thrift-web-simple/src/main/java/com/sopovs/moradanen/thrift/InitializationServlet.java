package com.sopovs.moradanen.thrift;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServlet;

import com.sopovs.moradanen.gen.HelloService;
import com.sopovs.moradanen.gen.HelloService.Iface;

public class InitializationServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException
	{

		HelloService.Processor<Iface> processor = new HelloService.Processor<Iface>(new HelloServiceImpl());

		TServlet tServlet = new TServlet(processor, new TBinaryProtocol.Factory());

		getServletContext().setAttribute("thriftServlet", tServlet);
	}
}