package com.joham.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author joham
 */

@Entity
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column
    private String password;
}
