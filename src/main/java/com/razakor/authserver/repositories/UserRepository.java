package com.razakor.authserver.repositories;

import com.razakor.authserver.documents.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UserEntity, String> {

    Optional<UserEntity> findByUsername(String username);

    boolean existsUserBySub(String sub);

}