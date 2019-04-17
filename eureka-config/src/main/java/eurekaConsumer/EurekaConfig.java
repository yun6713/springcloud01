package eurekaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EurekaConfig {
	
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaConfig.class,args);
	}
}
