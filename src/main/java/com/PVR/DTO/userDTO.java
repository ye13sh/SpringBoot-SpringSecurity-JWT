package com.PVR.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class userDTO {
    int id;
    String username;
    String password;
    String name;
    String dob;
    String email;
    String mobile;


}
