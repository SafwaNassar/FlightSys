package io.FlightsBookingSystem.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import io.FlightsBookingSystem.Service.PassengerService;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	PassengerService passengerService;
		
/** LOGIN form
 * Default user name and password
 * Default admin name and password
 */
	@Override
	protected void configure(AuthenticationManagerBuilder  auth) throws Exception{
		auth.inMemoryAuthentication()
		.withUser("user")
		.password("{noop}user")
		.roles("USER")
		.and()
		.withUser("admin")
		.password("{noop}admin")
		.roles("ADMIN");
	}
	
//	Method to encrypt the passwords
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();	
	}
	
/**
 * Access privilege to URL
 * any URL start with admin keyword only admins can access otherwise no access
 */
	@Override	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
				.antMatchers("/login").permitAll()
				.antMatchers("/logout").permitAll()
				.antMatchers("/admin/**").hasRole("ADMIN")
				.anyRequest().authenticated()
				.and().formLogin();
	}

	
}
