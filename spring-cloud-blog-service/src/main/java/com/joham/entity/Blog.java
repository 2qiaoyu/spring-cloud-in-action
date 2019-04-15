package com.joham.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author joham
 */

@Entity
@Data
public class Blog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column
    private String title;

    @Column
    private String subject;
}
