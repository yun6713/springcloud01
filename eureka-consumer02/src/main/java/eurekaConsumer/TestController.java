package eurekaConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	TemplateInterface ti;
	
	@RequestMapping("/test")
	public String test01() {
		return ti.getInfo()+",and my port is lalala";
	}
}
