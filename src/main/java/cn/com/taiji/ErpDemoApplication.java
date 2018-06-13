
package cn.com.taiji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication  
@EnableTransactionManagement 
@ComponentScan("cn.com.taiji")
@MapperScan("cn.com.taiji.dao")
public class ErpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpDemoApplication.class, args);
	}
}

