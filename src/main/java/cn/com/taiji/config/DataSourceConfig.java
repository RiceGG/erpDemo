package cn.com.taiji.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*配置数据源*/
@Configuration
public class DataSourceConfig {
	 @Value("${spring.datasource.driverClassName}")
	  private String driver ;

	  @Value("${spring.datasource.url}")
	  private String url ;

	  @Value("${spring.datasource.username}")
	  private String username ;

	  @Value("${spring.datasource.password}")
	  private String password ;

	  @Bean(destroyMethod = "close",name="dateSource")
	  public DataSource dataSource() {
		  BasicDataSource bs = new BasicDataSource();
		   bs.setUrl(url);
		   bs.setUsername(username);
		   bs.setPassword(password);
		   bs.setDriverClassName(driver);
	     
		   return bs;
	  }

	}