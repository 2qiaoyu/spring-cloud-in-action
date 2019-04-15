package com.joham.client;

import com.joham.client.hystrix.UserServiceHystrix;
import com.joham.dto.RespDTO;
import com.joham.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;


/**
 * @author joham
 */

@FeignClient(value = "spring-cloud-user-service", fallback = UserServiceHystrix.class)
public interface UserServiceClient {

    @PostMapping(value = "/user/{username}")
    RespDTO<User> getUser(@RequestHeader(value = "Authorization") String token, @PathVariable("username") String username);
}



