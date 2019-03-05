package com.sk.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().denyAll();
		// userDetailsService(new UserDetailsService() {
		//
		// @Override
		// public UserDetails loadUserByUsername(String sk) throws
		// UsernameNotFoundException {
		// return new UserDetails() {
		//
		// @Override
		// public boolean isEnabled() {
		// // TODO Auto-generated method stub
		// return false;
		// }
		//
		// @Override
		// public boolean isCredentialsNonExpired() {
		// // TODO Auto-generated method stub
		// return false;
		// }
		//
		// @Override
		// public boolean isAccountNonLocked() {
		// // TODO Auto-generated method stub
		// return false;
		// }
		//
		// @Override
		// public boolean isAccountNonExpired() {
		// // TODO Auto-generated method stub
		// return false;
		// }
		//
		// @Override
		// public String getUsername() {
		//
		// return "Admin";
		// }
		//
		// @Override
		// public String getPassword() {
		// return "Admin";
		// }
		//
		// @Override
		// public Collection<? extends GrantedAuthority> getAuthorities() {
		// // TODO Auto-generated method stub
		// return null;
		// }
		// };
		// }
		// });
		// super.configure(http);
	}

}
