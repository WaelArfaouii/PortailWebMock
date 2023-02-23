package com.arfaoui.PortailWeb.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name ;
    private String title ;
    private String firstName ;
    private String middleName ;
    private String lastName ;
    private String degree ;
    private String phoneNumber ;
    private String email ;


}
