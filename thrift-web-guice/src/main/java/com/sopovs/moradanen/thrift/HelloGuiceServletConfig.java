package com.sopovs.moradanen.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Scopes;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.sopovs.moradanen.gen.HelloService;
import com.sopovs.moradanen.gen.HelloService.Iface;

public class HelloGuiceServletConfig extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {
			@Override
			protected void configureServlets() {
				bind(TProcessor.class).toInstance(
						new HelloService.Processor<Iface>(
								new HelloServiceImpl()));
				bind(TProtocolFactory.class).to(TBinaryProtocol.Factory.class)
						.in(Scopes.SINGLETON);

				serve("*").with(HelloServlet.class);
			}
		});
	}
}