package com.joham.service;

import com.joham.client.AuthServiceClient;
import com.joham.dao.UserDao;
import com.joham.dto.LoginDTO;
import com.joham.dto.RespDTO;
import com.joham.entity.JWT;
import com.joham.entity.User;
import com.joham.exception.CommonException;
import com.joham.exception.ErrorCode;
import com.joham.util.BPwdEncoderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author joham
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    AuthServiceClient authServiceClient;

    public User createUser(User user) {
        return userDao.save(user);
    }

    public User getUserInfo(String username) {
        return userDao.findByUsername(username);
    }

    public RespDTO login(String username, String password) {
        User user = userDao.findByUsername(username);
        if (null == user) {
            throw new CommonException(ErrorCode.USER_NOT_FOUND);
        }
        if (!BPwdEncoderUtils.matches(password, user.getPassword())) {
            throw new CommonException(ErrorCode.USER_PASSWORD_ERROR);
        }

        //spring-cloud-uaa-service:123456通过base64加密得到c3ByaW5nLWNsb3VkLXVhYS1zZXJ2aWNlOjEyMzQ1Ng==
        JWT jwt = authServiceClient.getToken("Basic c3ByaW5nLWNsb3VkLXVhYS1zZXJ2aWNlOjEyMzQ1Ng==", "password", username, password);
        // 获得用户菜单
        if (null == jwt) {
            throw new CommonException(ErrorCode.GET_TOKEN_FAIL);
        }
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUser(user);
        loginDTO.setToken(jwt.getAccess_token());
        return RespDTO.onSuc(loginDTO);
    }
}
