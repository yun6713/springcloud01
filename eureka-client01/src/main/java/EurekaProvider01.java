import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//eureka client
@SpringBootApplication
public class EurekaProvider01 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProvider01.class,args);
	}
}
