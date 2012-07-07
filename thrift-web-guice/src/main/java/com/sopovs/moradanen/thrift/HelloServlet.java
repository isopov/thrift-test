package com.sopovs.moradanen.thrift;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;

@Singleton
public class HelloServlet extends TServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	public HelloServlet(TProcessor processor, TProtocolFactory protocolFactory) {
		super(processor, protocolFactory);
	}
}
