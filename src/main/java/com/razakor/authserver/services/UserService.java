package com.razakor.authserver.services;

import com.razakor.authserver.documents.UserEntity;
import org.bson.types.ObjectId;

import java.util.List;

public interface UserService {

    List<UserEntity> findAll();

    UserEntity findById(String id);

    UserEntity findByUsername(String username);

    void save(UserEntity userEntity);

    void saveAll(List<UserEntity> userEntities);

}
