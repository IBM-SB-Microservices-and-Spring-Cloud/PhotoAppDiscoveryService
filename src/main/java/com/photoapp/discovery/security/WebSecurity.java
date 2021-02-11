package com.photoapp.discovery.security;

import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Profile("prod")
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("\n\nIn PhotoAppDiscoveryService WebSecurity::configure Profile is Prod\n\n");
		http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
	}
}
