package com.smartmi.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by sunjianfei on 17-1-3.
 */
@WebService
public interface HelloWorldService {
    String sayHi(@WebParam(name="test")  String text);
}
