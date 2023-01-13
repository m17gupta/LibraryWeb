package com.stackRoute.studentDetail.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND ,reason = "Student Not Found")
public class StudentNotFound extends Exception{
}
