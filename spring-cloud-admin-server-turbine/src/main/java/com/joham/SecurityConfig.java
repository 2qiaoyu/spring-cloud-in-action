package com.joham;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author joham
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.formLogin().loginPage("/login.html").loginProcessingUrl("/login").permitAll();
        httpSecurity.logout().logoutUrl("logout");
        httpSecurity.csrf().disable();
        httpSecurity.authorizeRequests().antMatchers("/login.html", "/**/**.css", "./img/**",
                "/third-party/**").permitAll();
        httpSecurity.authorizeRequests().antMatchers("/**").authenticated();
        httpSecurity.httpBasic();
    }
}
