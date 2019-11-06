package com.razakor.authserver.dao;

import com.razakor.authserver.documents.UserEntity;

public interface OAuthDAOService {

    public UserEntity getUserDetails(String username);
}