package com.dawitalem.loginhub.controller;

import com.dawitalem.loginhub.io.ProfileRequest;
import com.dawitalem.loginhub.io.ProfileResponse;
import com.dawitalem.loginhub.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1.0")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileResponse register(@RequestBody ProfileRequest request){
        ProfileResponse response = profileService.createProfile(request);

        // TODO: send welcome email

        return response;
    }
}
