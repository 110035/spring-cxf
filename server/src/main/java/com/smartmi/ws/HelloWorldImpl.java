package com.smartmi.ws;

import javax.jws.WebService;

/**
 * Created by sunjianfei on 17-1-3.
 */
@WebService(endpointInterface = "com.smartmi.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
}