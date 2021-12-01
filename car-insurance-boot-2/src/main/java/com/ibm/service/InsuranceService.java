/**
 * This service class describes all the methods and functionalities of the Insurance entity.
 * @author Kosuru.Venkata.Sravani  
 * @version  1.8.0_311
 **/

package com.ibm.service;

import com.ibm.entity.Insurance;

public interface InsuranceService {

	String save(Insurance i, int carId);

	void deleteInsById(int id);

}
