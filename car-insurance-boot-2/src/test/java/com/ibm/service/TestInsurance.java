/**
 * This Test Insurance class is used to test all the possible methods from the insurance service class.
 * @author P.Sindhu, B.Sowmya  
 * @version  1.8.0_311
 **/

package com.ibm.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.entity.Insurance;

@SpringBootTest
public class TestInsurance {

	@Autowired
	private InsuranceService service;

	@Test
	public void testSave() {
		Insurance i = new Insurance();
		i.setInsId(2);
		i.setInsuranceNo(123436);
		i.setDateIssued("11/24/2021");
		i.setExpiryDate("11/24/2024");
		i.setAmount(34355);
		i.setDuration(2);
		i.setCoverageType("thirdparty");
		i.setPrevAmntInsured(0);
		service.save(i, 24);

	}

	@Test
	public void testDelete() {
		service.deleteInsById(47);
	}

}
