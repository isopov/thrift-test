package com.sopovs.moradanen.thrift;

import javax.inject.Singleton;

import com.sopovs.moradanen.gen.HelloService.Iface;

@Singleton
public class HelloServiceImpl implements Iface {

	@Override
	public String hello(String name) throws org.apache.thrift.TException {
		return "Hello, " + name + "!";
	}

}
