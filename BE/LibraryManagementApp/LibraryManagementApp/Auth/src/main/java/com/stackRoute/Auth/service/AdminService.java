package com.stackRoute.Auth.service;

import com.stackRoute.Auth.Exception.UserAlreadyExist;
import com.stackRoute.Auth.Exception.UserNotFound;
import com.stackRoute.Auth.domain.Admin;

public interface AdminService {

    public  abstract Admin register(Admin admin) throws UserAlreadyExist;

    public abstract  Admin Login(String username, String password) throws UserNotFound;
}
