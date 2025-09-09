package com.dawitalem.loginhub.service;

import com.dawitalem.loginhub.io.ProfileRequest;
import com.dawitalem.loginhub.io.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);

    ProfileResponse getProfile(String email);

    void sendResetOtp(String email);

}
