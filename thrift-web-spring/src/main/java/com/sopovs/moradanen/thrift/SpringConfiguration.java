package com.sopovs.moradanen.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sopovs.moradanen.gen.HelloService;
import com.sopovs.moradanen.gen.HelloService.Iface;

@Configuration
public class SpringConfiguration {

	@Bean
	public TProcessor createProcessor() {
		return new HelloService.Processor<Iface>(new HelloServiceImpl());
	}

	@Bean
	public TProtocolFactory createProtocolFactory() {
		return new TBinaryProtocol.Factory();
	}

}
