package org.example.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
@ComponentScan("org.example.ssm.service, org.example.ssm.dao")
@PropertySource("classpath:jdbc.properties")
@Import({DataSourceConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
