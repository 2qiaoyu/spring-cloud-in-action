package com.joham.dto;


import com.joham.entity.User;
import lombok.Data;

/**
 * @author joham
 */
@Data
public class LoginDTO {

    private User user;

    private String token;
}
