/**
 * This service class describes all the methods and functionalities of the Car entity.
 * @author Kosuru.Venkata.Sravani,  P.M.Thanusree   
 * @version  1.8.0_311
 **/

package com.ibm.service;

import java.util.List;

import com.ibm.entity.Car;

public interface CarService {

	String add(Car c, int customerId);

	Car fetchById(int c);

	List<Car> fetchAll();

	double getQuotation(String regNo, String coverageType);

	void deleteCarById(int id);

}
