package com.sopovs.moradanen.thrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;

import com.sopovs.moradanen.gen.HelloService;

public class ThriftWebClient {

	public void invoke() throws Exception {

		TTransport client = new THttpClient("http://localhost:8080/thrift-web/helloService");

		TProtocol protocol = new TBinaryProtocol(client);

		HelloService.Client serviceClient = new HelloService.Client(protocol);

		client.open();

		String hello = serviceClient.hello("World");

		System.out.println("Hello result: " + hello);

		client.close();

	}

	public static void main(String[] args) throws Exception {

		ThriftWebClient client = new ThriftWebClient();
		client.invoke();
	}

}
