package com.stackRoute.Auth.repository;

import com.stackRoute.Auth.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,String> {
}
