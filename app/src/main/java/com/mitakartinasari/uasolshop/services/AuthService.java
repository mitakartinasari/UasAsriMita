package com.mitakartinasari.uasolshop.services;


import com.mitakartinasari.uasolshop.models.Envelope;
import com.mitakartinasari.uasolshop.models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AuthService {

	@POST("/v1/auth/token")
	@Headers("No-Authentication: true")
	Call<Envelope<String>> getToken(@Body User user);

}
