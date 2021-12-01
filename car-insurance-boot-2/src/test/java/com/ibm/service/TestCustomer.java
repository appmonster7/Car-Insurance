/**
 * This Test Customer class is used to test all the possible methods from the customer service class.
 * @author P.Sindhu, B.Sowmya  
 * @version  1.8.0_311
 **/

package com.ibm.service;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.ibm.entity.Customer;

@SpringBootTest
public class TestCustomer {

	@Autowired
	private CustomerService service;

	@Test
	public void testSave() {
		Customer c = new Customer();
		c.setCustomerId(3);
		c.setName("dhara");
		c.setPhoneNumber(8911775589l);
		c.setCity("Prakasam");
		c.setEmail("sindhu2269@gmail.com");
		c.setPassword("fedcba");
		service.save(c);
	}

	@Test
	public void testFetchById() {
		Customer c = service.fetchById(26);
		System.out.println("Name " + c.getName() + " " + "Phone Number " + c.getPhoneNumber() + " " + "City "
				+ c.getCity() + " " + "Email " + c.getEmail());
	}

	@Test
	public void testFetchAll() {
		List<Customer> list = service.fetchAll();
		for (Customer customer : list) {
			System.out.println(customer.getCustomerId() + "," + customer.getName() + "," + customer.getCity() + ","
					+ customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getPassword());
		}

	}
}
