package eurekaConsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import feign.hystrix.FallbackFactory;

@FeignClient(value="eureka-provider",fallbackFactory=TemplateInterfaceFallback.class)
public interface TemplateInterface {

	@RequestMapping("/")
	String getInfo();
}
