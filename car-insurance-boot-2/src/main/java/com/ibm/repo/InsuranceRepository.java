/**
 * This interface describes a repository of an Insurance entity.
 * This repository class is used to access the data sources.
 * @author Kosuru.Venkata.Sravani  
 * @version  1.8.0_311
 **/

package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {

	Insurance findByCoverageType(String s);

}
