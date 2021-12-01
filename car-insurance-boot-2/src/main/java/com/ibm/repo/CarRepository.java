/**
 * This interface describes a repository of a Car entity.
 * This repository class is used to access the data sources.
 * @author Kosuru.Venkata.Sravani  
 * @version  1.8.0_311
 **/

package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

	Car findByRegNo(String r);

	List<Car> findAllByCustomer(int c);
}
