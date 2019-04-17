package eurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy//eureka client
@SpringBootApplication
public class EurekaZuul {
	public static void main(String[] args) {
		SpringApplication.run(EurekaZuul.class,args);
	}
}
