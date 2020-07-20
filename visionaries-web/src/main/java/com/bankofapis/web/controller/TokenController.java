package com.bankofapis.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankofapis.core.model.token.TokenRequest;
import com.bankofapis.core.model.token.TokenResponse;
import com.bankofapis.web.service.TokenService;

@RestController
public class TokenController {

    private TokenService tokenService;
    
    private TokenResponse tokenResponse;

    @Autowired
    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
        
    }

    @PostMapping(value = "/open-banking/v3/token")
    public TokenResponse generateToken(@RequestBody TokenRequest tokenRequest) {
    	tokenResponse=tokenService.getTokenResponse(tokenRequest);
    	System.out.println("Token set as - "+tokenResponse);
        return tokenResponse;
    }
    
    @GetMapping(value = "/open-banking/v3/passToken")
    public TokenResponse passToken() {
        return tokenResponse;
    }
    
}