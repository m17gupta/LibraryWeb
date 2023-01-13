package com.stackRoute.Auth.JWTToken;

import com.stackRoute.Auth.domain.Admin;


import java.util.Map;

public interface SecurityTokenGenerator {
    public abstract Map<String, String> generateToken(Admin admin);
}
