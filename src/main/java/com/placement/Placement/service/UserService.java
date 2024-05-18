package com.placement.Placement.service;

import com.placement.Placement.model.entity.auth.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    AppUser loadUserByUserId(String id);
}