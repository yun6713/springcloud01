package eurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;

import com.netflix.zuul.context.RequestContext;

@EnableZuulProxy//eureka client
@EnableEurekaClient
@SpringBootApplication
public class EurekaZuul {
	public static void main(String[] args) {
		RequestContext rc = RequestContext.getCurrentContext();
		ZuulHandlerMapping zhm;
		org.springframework.cloud.netflix.zuul.ZuulServerAutoConfiguration a;
		SpringApplication.run(EurekaZuul.class,args);
	}
}
