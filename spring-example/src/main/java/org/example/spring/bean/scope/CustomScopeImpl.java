package org.example.spring.bean.scope;

import org.example.spring.service.HelloWorld;

/**
 * @author chenlixin at 2017年1月4日 下午4:05:13
 */
public class CustomScopeImpl implements HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("Hello,Custom scope!");
	}

}