/**
 * This Test Car class is used to test all the possible methods from the car service class.
 * @author P.Sindhu, B.Sowmya
 * @version  1.8.0_311
 **/

package com.ibm.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.entity.Car;

@SpringBootTest
public class TestCar {

	@Autowired
	private CarService service;

	@Test
	public void testAdd() {
		Car c = new Car();
		c.setCarId(19);
		c.setRegNo("GHT67ED");
		c.setModelName("BMW Audi3");
		c.setPurchYear(2019);
		c.setManufctYear(2017);
		c.setPrice(1400000);
		service.add(c, 32);
	}

	@Test
	public void testFetchById() {
		Car c1 = service.fetchById(19);
		System.out.println(c1.getRegNo() + ", " + c1.getModelName() + "," + c1.getManufctYear() + ","
				+ c1.getPurchYear() + "," + c1.getPrice() + "," + c1.getCustomer());

	}

	@Test
	public void testFetchAll() {
		List<Car> list = service.fetchAll();
		for (Car car : list) {
			System.out.println(car.getCarId() + "," + car.getRegNo() + "," + car.getModelName() + ","
					+ car.getPurchYear() + "," + car.getManufctYear() + "," + car.getPrice() + "," + car.getCustomer());
		}
	}

	@Test
	public void delCarById() {
		service.deleteCarById(18);

	}

	@Test
	public void getQuotation() {
		service.getQuotation("TS02AI8900", "thirdparty");
	}
}
