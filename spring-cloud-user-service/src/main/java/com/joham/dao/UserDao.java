package com.joham.dao;

import com.joham.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author joham
 */

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
