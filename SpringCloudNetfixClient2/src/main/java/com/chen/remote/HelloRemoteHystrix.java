
package com.chen.remote;

import org.springframework.stereotype.Component;


/**
 * Created by cvter on 2017/6/29.
 */

@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(String name) {
        return "hello hystrix";
    }
}
