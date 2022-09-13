package com.example.springAWS.config.auth;

import com.example.springAWS.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Service
public class CustomOAuthUserService {

    private final UserRepository userRepository;
    private final HttpSession httpSession;

}
