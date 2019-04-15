package com.joham.client.hystrix;

import com.joham.client.UserServiceClient;
import com.joham.dto.RespDTO;
import com.joham.entity.User;
import org.springframework.stereotype.Component;


/**
 * @author joham
 */
@Component
public class UserServiceHystrix implements UserServiceClient {

    @Override
    public RespDTO<User> getUser(String token, String username) {
        System.out.println(token);
        System.out.println(username);
        return null;
    }
}
