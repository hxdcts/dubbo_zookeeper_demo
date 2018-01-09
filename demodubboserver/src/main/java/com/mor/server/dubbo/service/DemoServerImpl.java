/**
 * 
 */
package com.mor.server.dubbo.service;

import java.util.Date;

public class DemoServerImpl implements DemoServer {

	/**
	 * 返回添加后的语句
	 */
	public String sayHello(String str) {
		str = "Hello " + str + "  2:" + new Date();
		System.err.println("server:" + str);
		return str;
	}
	public String sayMoma(String name){
		name = name + " TMD NND hello world";
		System.out.println("server : "+name);
		return name;
	}
}
