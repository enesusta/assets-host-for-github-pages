package com.enesusta.jwt.springsecurityjwt.models;

public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(final String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
