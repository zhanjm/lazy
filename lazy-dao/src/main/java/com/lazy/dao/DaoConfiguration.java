package com.lazy.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories("com.lazy.dao")
public class DaoConfiguration {
}
