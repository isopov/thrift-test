package com.sopovs.moradanen.thrift;
import com.sopovs.moradanen.gen.HelloService.Iface;

public class HelloServiceImpl implements Iface {

	@Override
	public String hello(String name) throws org.apache.thrift.TException {
		return "Hello, " + name + "!";
	}

}
