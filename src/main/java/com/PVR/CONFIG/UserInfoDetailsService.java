package com.PVR.CONFIG;

import com.PVR.ENTITY.authorityEntity;

import com.PVR.REPOSITORY.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoDetailsService implements UserDetailsService {
    @Autowired
    private AuthorityRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Optional<authorityEntity> aEntity= repository.findByName(username);
        return aEntity.map(UserDetailsUserInfo::new).orElseThrow(()->new UsernameNotFoundException("username not found"+username));
    }
}
