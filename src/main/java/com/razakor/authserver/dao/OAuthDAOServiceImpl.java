package com.razakor.authserver.dao;

import com.razakor.authserver.documents.UserEntity;
import com.razakor.authserver.services.UserService;
import org.springframework.stereotype.Repository;

@Repository
public class OAuthDAOServiceImpl implements OAuthDAOService {

    private final UserService userService;

    public OAuthDAOServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserEntity getUserDetails(String username) {
        return userService.findByUsername(username);
    }
}
