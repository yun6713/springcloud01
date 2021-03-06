package eurekaClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feign.Logger;

@EnableEurekaClient//eureka client
@SpringBootApplication
@RestController
public class EurekaProvider01 {
	@Value("${server.port}")
	String port;
	/*@Value("${info}")
	String info;*/
	@RequestMapping("/")
	public String getInfo() {
		return String.format("My port is %1s,config info is %2s", port,""); 
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaProvider01.class,args);
	}
}
