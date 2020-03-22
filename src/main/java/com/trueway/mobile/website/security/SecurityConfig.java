package com.trueway.mobile.website.security;

//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired 
//	private UserDetailsService  userDetailsService;
//	
	@Override
    protected void configure(HttpSecurity http) throws Exception { 
        http
        .authorizeRequests()
        .antMatchers("/health", "/oauth/token").permitAll()
        .anyRequest().authenticated();
    } 
	
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
	return super.authenticationManagerBean();
	}

//	@Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
//        auth.inMemoryAuthentication()
//            .withUser("john")
//            .password(passwordEncoder().encode("123"))
//            .roles("USER");
//    } 
//
	
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
//		
//	public UserDetailsService getUserDetailsService() {
//		return userDetailsService;
//	}
//	public void setUserDetailsService(UserDetailsService userDetailsService) {
//		this.userDetailsService = userDetailsService;               
//	}
//	

}
