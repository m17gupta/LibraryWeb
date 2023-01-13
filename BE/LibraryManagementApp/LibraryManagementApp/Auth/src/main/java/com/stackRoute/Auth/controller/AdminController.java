package com.stackRoute.Auth.controller;

import com.stackRoute.Auth.Exception.UserAlreadyExist;
import com.stackRoute.Auth.Exception.UserNotFound;
import com.stackRoute.Auth.JWTToken.SecurityTokenGenerator;
import com.stackRoute.Auth.domain.Admin;
import com.stackRoute.Auth.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/library-app/v1")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private SecurityTokenGenerator securityTokenGenerator;
  // http://localhost:8881/library-app/v1/register
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Admin admin) throws UserAlreadyExist{
        try{
             return new ResponseEntity<>(adminService.register(admin), HttpStatus.OK);
        }catch (UserAlreadyExist ex){
          throw  new UserAlreadyExist();
        }
    }

  //http://localhost:8881/library-app/v1/login
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Admin admin) throws UserNotFound{
        try{
           Admin userdetail= adminService.Login(admin.getEmailId(),admin.getPassword());

               if (userdetail != null) { //authencation success
//            return new ResponseEntity<>(result,HttpStatus.Ok);
//            get jwt from jwtservice method by passing result oject

                   Map<String, String> Key = securityTokenGenerator.generateToken(userdetail);
                   return new ResponseEntity<>(Key, HttpStatus.OK);
               } else { //if authenication fails
                   return new ResponseEntity<>("Authenication fails", HttpStatus.NOT_FOUND);


               }

        }
        catch (UserNotFound ex){
            throw new UserNotFound();
        }
    }
}
