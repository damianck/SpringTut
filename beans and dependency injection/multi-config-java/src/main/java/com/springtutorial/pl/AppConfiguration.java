package com.springtutorial.pl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ LoggersConfiguration.class, RepositoryConfiguration.class })
public class AppConfiguration {

}
