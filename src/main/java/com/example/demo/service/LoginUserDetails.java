package com.example.demo.service;

import java.util.Collection;

import com.example.demo.entity.LoginUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public class LoginUserDetails implements UserDetails {

    private final LoginUser loginUser;
    
    @Autowired
    public LoginUserDetails(LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    public LoginUser getLoginUser() { // --- (1) Entityである MyUserを返却するメソッド
        return loginUser;
    }

    public String getUserName() { // --- (2) nameを返却するメソッド
        return this.loginUser.getUserName();
    }

    public String getEmailAddress() { 
        return this.loginUser.getEmailAddress();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { // --- (3) ユーザに与えられている権限リストを返却するメソッド
        return null;//AuthorityUtils.createAuthorityList("ROLE_" + this.loginUser.getRoleName());
    }

    @Override
    public String getPassword() { // --- (4) 登録されているパスワードを返却するメソッド
        return this.loginUser.getPassword();
    }

    @Override
    public String getUsername() { // --- (5) ユーザ名を返却するメソッド
        return this.loginUser.getEmailAddress();
    }

    @Override
    public boolean isAccountNonExpired() { // --- (6) アカウントの有効期限の状態を判定するメソッド
        return true;
    }

    @Override
    public boolean isAccountNonLocked() { // --- (7) アカウントのロック状態を判定するメソッド
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { // --- (8) 資格情報の有効期限の状態を判定するメソッド
        return true;
    }

    @Override
    public boolean isEnabled() { // --- (9) 有効なユーザかを判定するメソッド
        return true;
    }
}