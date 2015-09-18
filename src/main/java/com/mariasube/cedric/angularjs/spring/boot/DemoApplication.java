package com.mariasube.cedric.angularjs.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

import com.mariasube.cedric.angularjs.spring.boot.security.CsrfHeaderFilter;

/**
 * Main application class that enables it to run as a JAR or a WAR.
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Configuration
	@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
	protected static class SecurityConfiguration extends
			WebSecurityConfigurerAdapter {

		public static final String X_XSRF_TOKEN = "X-XSRF-TOKEN";

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.httpBasic()
					.and()
					.authorizeRequests()
					.antMatchers("/index.html", "/template/ticketList.html", "/template/login.html", 
							"/template/testList.html", "/template/maquette.html", "/template/ui/headerBar.html", "/").permitAll().anyRequest().authenticated().and()
					.addFilterAfter(new CsrfHeaderFilter(), CsrfFilter.class)
					.csrf().csrfTokenRepository(csrfTokenRepository());
		}

		private CsrfTokenRepository csrfTokenRepository() {
			HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
			repository.setHeaderName(X_XSRF_TOKEN);
			return repository;
		}
	}
}
