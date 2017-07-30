// package org.spring.module.security;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import
// org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import
// org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import
// org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import
// org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
// @Configuration
// @EnableWebSecurity
// public class SpringWebSecurityConfig extends WebSecurityConfigurerAdapter {
//
// @Autowired
// private UserDetailsService userDetailsService;
//
// @Value("${logout.success.url}")
// private String logoutSuccessUrl;
//
// @Override
// protected void configure(HttpSecurity http) throws Exception {
//
// // @formatter:off
//
// http.csrf().ignoringAntMatchers("/v1.0/**",
// "/logout").and().authorizeRequests()
//
// .antMatchers("/oauth/authorize").authenticated()
// // Anyone can access the urls
// .antMatchers("/signin/**").permitAll().antMatchers("/v1.0/**").permitAll().antMatchers("/auth/**")
// .permitAll().antMatchers("/actuator/health").permitAll().antMatchers("/actuator/**").hasAuthority("R_0")
// .antMatchers("/login").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login")
// .loginProcessingUrl("/login").failureUrl("/login?error=true").usernameParameter("username")
// .passwordParameter("password").permitAll().and().logout().logoutUrl("/logout")
// .logoutSuccessUrl(logoutSuccessUrl).permitAll();
// // @formatter:on
// }
//
// /**
// * Configures the authentication manager bean which processes authentication
// * requests.
// */
// @Override
// protected void configure(AuthenticationManagerBuilder auth) throws Exception
// {
// auth.userDetailsService(userDetailsService).passwordEncoder(new
// BCryptPasswordEncoder());
// }
//
// @Override
// @Bean
// public AuthenticationManager authenticationManagerBean() throws Exception {
// return super.authenticationManagerBean();
// }
//
// }