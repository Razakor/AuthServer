package com.razakor.authserver.documents;

import org.springframework.security.core.userdetails.User;

public class CustomUser extends User {

    private String id;
    private String sub;
    private String email;
    private String name;
    private String surname;
    private boolean enabled;

    public CustomUser(UserEntity userEntity) {
        super(userEntity.getUsername(), userEntity.getPassword(), userEntity.getAuthorities());
        this.id = userEntity.getId();
        this.sub = userEntity.getSub();
        this.email = userEntity.getEmail();
        this.name = userEntity.getName();
        this.surname = userEntity.getSurname();
        this.enabled = userEntity.isEnabled();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
