package eurekaConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
@AvoidScan
public class EurekaProviderBalanceConfig {
	@Autowired
	IClientConfig config;
	
	@Bean
	public IRule getIRule() {
		return new RoundRobinRule();
	}
}
