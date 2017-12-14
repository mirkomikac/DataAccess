package com.sep.tim2.da;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
  entityManagerFactoryRef = "paymentEntityManager",
  transactionManagerRef = "paymentTransactionManager",
  basePackages = { "com.sep.tim2.da.payment.repository" })
public class PaymentDbConfig {
	
	@Bean
	@ConfigurationProperties(prefix = "spring.payment.datasource")
	public DataSource paymentDataSource() {
		return DataSourceBuilder
					.create()
					.build();
	}

	@Bean(name = "paymentEntityManager")
	public LocalContainerEntityManagerFactoryBean postgresqlEntityManagerFactory(EntityManagerFactoryBuilder builder) {
		return builder
					.dataSource(paymentDataSource())
					.properties(hibernateProperties())
					.packages("com.sep.tim2.da.payment.model")
					.persistenceUnit("paymentPU")
					.build();
	}

	@Bean(name = "paymentTransactionManager")
	public PlatformTransactionManager paymentTransactionManager(@Qualifier("paymentEntityManager") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

	private Map<String, ?> hibernateProperties() {
		Resource resource = new ClassPathResource("payment.properties");
		try {
			Properties properties = PropertiesLoaderUtils.loadProperties(resource);
			return properties.entrySet().stream()
											.collect(Collectors.toMap(
														e -> e.getKey().toString(),
														e -> e.getValue())
													);
		} catch (IOException e) {
			return new HashMap<>();
		}
	}
	
}