//package com.trueway.mobile.website.test;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(
//  classes = ResourceServerApplication.class, 
//  webEnvironment = WebEnvironment.RANDOM_PORT)
//public class AuthenticationClaimsIntegrationTest {
// 
//    @Autowired
//    private JwtTokenStore tokenStore;
// 
//    @Test
//    public void whenTokenDoesNotContainIssuer_thenSuccess() {
//        String tokenValue = obtainAccessToken("fooClientIdPassword", "john", "123");
//        OAuth2Authentication auth = tokenStore.readAuthentication(tokenValue);
//        Map<String, Object> details = (Map<String, Object>) auth.getDetails();
//  
//        assertTrue(details.containsKey("organization"));
//    }
// 
//    private String obtainAccessToken(
//      String clientId, String username, String password) {
//  
//        Map<String, String> params = new HashMap<>();
//        params.put("grant_type", "password");
//        params.put("client_id", clientId);
//        params.put("username", username);
//        params.put("password", password);
//        Response response = RestAssured.given()
//          .auth().preemptive().basic(clientId, "secret")
//          .and().with().params(params).when()
//          .post("http://localhost:8081/spring-security-oauth-server/oauth/token");
//        return response.jsonPath().getString("access_token");
//    }
//}