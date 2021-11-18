package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}
