package com.sep.tim2.da;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
  entityManagerFactoryRef = "paymentEntityManagerFactory",
  basePackages = { "com.sep.tim2.da.payment.repository" }
)

public class PaymentDbConfig {
	
	  @Bean(name = "paymentDataSource")
	  @ConfigurationProperties(prefix = "payment.datasource")
	  public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	  }
	  
	  @Bean(name = "paymentEntityManagerFactory")
	  public LocalContainerEntityManagerFactoryBean 
	  entityManagerFactory(
	    EntityManagerFactoryBuilder builder,
	    @Qualifier("paymentDataSource") DataSource dataSource
	  ) {
	    return builder
	      .dataSource(dataSource)
	      .packages("com.sep.tim2.da.payment.model")
	      .persistenceUnit("payment")
	      .build();
	  }
	    
	  @Bean(name = "paymentTransactionManager")
	  public PlatformTransactionManager transactionManager(
	    @Qualifier("paymentEntityManagerFactory") EntityManagerFactory 
	    entityManagerFactory
	  ) {
	    return new JpaTransactionManager(entityManagerFactory);
	  }
}
