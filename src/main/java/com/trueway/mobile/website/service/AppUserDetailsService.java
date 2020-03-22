package com.trueway.mobile.website.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.AppUser;
import com.trueway.mobile.website.repo.UserDetailsRepository;

@Service
public class AppUserDetailsService  implements UserDetailsService {
	
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

		AppUser user = userDetailsRepository.findByLogin(login);
		if(user == null) {
			throw new UsernameNotFoundException("404");
		
		}
		return new UserDetails() {

			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				// TODO Auto-generated method stub
				return Collections.singleton(new SimpleGrantedAuthority("USER"));
			}

			@Override
			public String getPassword() {
				// TODO Auto-generated method stub
				return user.getPassword();
			}

			@Override
			public String getUsername() {
				// TODO Auto-generated method stub
				return user.getLogin();
			}

			@Override
			public boolean isAccountNonExpired() {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public boolean isAccountNonLocked() {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public boolean isCredentialsNonExpired() {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return true;
			}
			
		};
	}

}
