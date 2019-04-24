package eurekaConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class TestController {

	@Autowired
	RestTemplate rt;
	@Value("${info}")
	private String state;
	
	@HystrixCommand(fallbackMethod ="defaultFallback")
	@RequestMapping("/test")
	public String test01() {
		return rt.getForEntity("http://eureka-provider/", String.class).getBody();
	}
	
	public String defaultFallback() {
		return "ribbon，provider挂了";
	}
	@RequestMapping("/test")
	public String testConfig() {
		return state;
	}
}
