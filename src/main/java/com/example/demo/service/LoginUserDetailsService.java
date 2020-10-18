package com.example.demo.service;

import com.example.demo.dao.LoginUserDao;
import com.example.demo.entity.LoginUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class LoginUserDetailsService implements UserDetailsService {

    private final LoginUserDao loginUserDao;

    @Autowired
    public LoginUserDetailsService(LoginUserDao loginUserDao) {
        this.loginUserDao = loginUserDao;
    }

    @Override
    public UserDetails loadUserByUsername(String emailAddress) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(emailAddress)) {
            throw new UsernameNotFoundException(emailAddress + "is not found");
        }
        try {
            LoginUser loginUser = loginUserDao.selectByEmailAddress(emailAddress);
            if (loginUser != null) {
                return new LoginUserDetails(loginUser);
            } else {
                throw new UsernameNotFoundException(emailAddress + "is not found");
            }
        } catch (EmptyResultDataAccessException e) {
            throw new UsernameNotFoundException(emailAddress + "is not found");
        }
    }
}
