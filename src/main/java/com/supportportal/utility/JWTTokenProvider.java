package com.supportportal.utility;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.supportportal.constant.SecurityConstant;
import static com.supportportal.constant.SecurityConstant.*;
import com.supportportal.domain.UserPrincipal;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class JWTTokenProvider {
    @Value("jwt.secret")
    private String secret; // very secure

    public String generateJwtToken(UserPrincipal userPrincipal){
        String[] claims = getClaimsFromUSer(userPrincipal);
        return JWT.create()
                .withIssuer(GET_ARRAYS_LLC)
                .withAudience(GET_ARRAYS_ADMINISTRATION)
                .withIssuedAt(new Date())
                .withSubject(userPrincipal.getUsername())
                .withArrayClaim(AUTHORITIES,claims)
                .withExpiresAt(new Date(System.currentTimeMillis()+EXPIRATION_TIME))
                .sign(Algorithm.HMAC512(secret.getBytes()))
                ;
    }

    private String[] getClaimsFromUSer(UserPrincipal userPrincipal) {

        return null;
    }

}
