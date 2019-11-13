package com.razakor.authserver.config;

import com.razakor.authserver.documents.CustomUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomTokenEnhancer extends JwtAccessTokenConverter {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        Map<String, Object> info = new LinkedHashMap<>(accessToken.getAdditionalInformation());
        if (customUser.getId() != null)
            info.put("id", customUser.getId());
        if (customUser.getSub() != null)
            info.put("sub", customUser.getSub());
        if (customUser.getUsername() != null)
            info.put("username", customUser.getUsername());
        if (customUser.getEmail() != null)
            info.put("email", customUser.getEmail());
        if (customUser.getName() != null)
            info.put("name", customUser.getName());
        if (customUser.getSurname() != null)
            info.put("surname", customUser.getSurname());
        DefaultOAuth2AccessToken customAccessToken = new DefaultOAuth2AccessToken(accessToken);
        customAccessToken.setAdditionalInformation(info);
        return super.enhance(customAccessToken, authentication);
    }
}