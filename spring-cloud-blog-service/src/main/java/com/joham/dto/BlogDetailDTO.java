package com.joham.dto;

import com.joham.entity.Blog;
import com.joham.entity.User;
import lombok.Data;

/**
 * @author joham
 */
@Data
public class BlogDetailDTO {

    private Blog blog;

    private User user;

}
