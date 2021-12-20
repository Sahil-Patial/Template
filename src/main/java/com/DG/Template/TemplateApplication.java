package com.DG.Template;

//import com.DG.Template.master.MasterService;
//import com.DG.Template.routing.CustomRoutingDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class})
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.DG.Template")
public class TemplateApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(TemplateApplication.class, args);
	}

//	@Bean
//	public DataSource dataSource(){
//		CustomRoutingDataSource customDataSource = new CustomRoutingDataSource();
//		customDataSource.setTargetDataSources(MasterService.getDataSourceHashMap());
//		return customDataSource;
//	}

}
