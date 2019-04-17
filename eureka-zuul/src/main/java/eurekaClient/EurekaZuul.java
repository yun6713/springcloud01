package eurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy//eureka client
@EnableEurekaClient
@SpringBootApplication
public class EurekaZuul {
	public static void main(String[] args) {
		org.springframework.cloud.netflix.zuul.ZuulServerAutoConfiguration a;
		SpringApplication.run(EurekaZuul.class,args);
	}
}
