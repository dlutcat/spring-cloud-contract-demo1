package com.importsource.springcloud;

import com.importsource.springcloud.common.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hezhuofan
 */
@RestController
public class CustomerRestController {

	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping(path = "/api/customers")
	public Page getCustomers() {
		Page page = new Page();
		page.setData(customerRepository.findAll());
		return page;
	}

	@RequestMapping(path = "/api/hello")
	public Map<String, String> hello() {
		Map map = new HashMap(1);
		map.put("resp", "hello");
		return map;
	}
}
