package eurekaConsumer;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class TemplateInterfaceFallback implements FallbackFactory{

	@Override
	public TemplateInterface create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new TemplateInterface() {

			@Override
			public String getInfo() {
				arg0.printStackTrace();
				return "feign，provider挂了\n"+arg0.getMessage();
			}
			
		};
	}
	

}
