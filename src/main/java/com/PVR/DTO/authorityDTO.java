package com.PVR.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class authorityDTO {
    int id;
    String username;
    String password;
    String authority;
    String name;
    String DOB;
    String email;
    String mobile;


}
