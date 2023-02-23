package com.arfaoui.PortailWeb.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class AuthorDTO {
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
