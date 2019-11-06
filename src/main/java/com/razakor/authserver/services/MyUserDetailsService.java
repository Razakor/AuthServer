package com.razakor.authserver.services;

import com.razakor.authserver.dao.OAuthDAOService;
import com.razakor.authserver.documents.CustomUser;
import com.razakor.authserver.documents.UserEntity;
import com.razakor.authserver.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private final OAuthDAOService oAuthDAOService;

    public MyUserDetailsService(UserRepository userRepository, OAuthDAOService oAuthDAOService) {
        this.userRepository = userRepository;
        this.oAuthDAOService = oAuthDAOService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = oAuthDAOService.getUserDetails(username);
        return new CustomUser(userEntity);
    }

    public void addUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public boolean isAlreadyExists(String sub) {
        return userRepository.existsUserBySub(sub);
    }

}