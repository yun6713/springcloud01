package eurekaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient//eureka client
@EnableHystrix//启动断路器
@EnableHystrixDashboard
@SpringBootApplication
@RibbonClient(name="eureka-provider",configuration=EurekaProviderBalanceConfig.class)
@ComponentScan(excludeFilters= {@ComponentScan.Filter(
		type=FilterType.ANNOTATION,value=AvoidScan.class
		)})
public class EurekaConsumer01 {
	
	@LoadBalanced//负载均衡
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer01.class,args);
	}
}
