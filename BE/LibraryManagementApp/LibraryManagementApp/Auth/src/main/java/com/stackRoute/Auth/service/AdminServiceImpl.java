package com.stackRoute.Auth.service;

import com.stackRoute.Auth.Exception.UserAlreadyExist;
import com.stackRoute.Auth.Exception.UserNotFound;
import com.stackRoute.Auth.domain.Admin;
import com.stackRoute.Auth.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin register(Admin admin) throws UserAlreadyExist {
        if(adminRepository.findById(admin.getEmailId()).isPresent()){
            throw new UserAlreadyExist();
        }
        else {
           return adminRepository.save(admin);
        }
    }

    @Override
    public Admin Login(String username, String password) throws UserNotFound {
        if(adminRepository.findById(username).isPresent()){
            Admin userDetail= adminRepository.findById(username).get();
            if(userDetail.getPassword().equalsIgnoreCase(password)){
                return userDetail;
            }
            else return null;

        }
        else throw new UserNotFound();
    }
}
