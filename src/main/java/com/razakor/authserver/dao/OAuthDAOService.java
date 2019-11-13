package com.razakor.authserver.dao;

import com.razakor.authserver.documents.UserEntity;

public interface OAuthDAOService {

    UserEntity getUserDetails(String username);
}