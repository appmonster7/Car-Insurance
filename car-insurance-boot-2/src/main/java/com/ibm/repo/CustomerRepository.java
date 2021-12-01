/**
 * This interface describes a repository of a Customer entity.
 * This repository class is used to access the data sources.
 * @author Kosuru.Venkata.Sravani  
 * @version  1.8.0_311
 **/

package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
