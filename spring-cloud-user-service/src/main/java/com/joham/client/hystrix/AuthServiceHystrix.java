package com.joham.client.hystrix;

import com.joham.client.AuthServiceClient;
import com.joham.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * @author joham
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {

    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        System.out.println("--------opps getToken hystrix---------");
        return null;
    }
}
