package com.mpesa_daraja_api.Payment.Service.service;

import com.mpesa_daraja_api.Payment.Service.dto.AccessTokenResponse;

public interface DarajaApi {
    /**
     * @return Returns Daraja API Access Token Response
     */
    AccessTokenResponse getAccessToken();
}
