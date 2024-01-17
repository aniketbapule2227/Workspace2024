package com.allOperations.repository;

import com.allOperations.entity.Orgnization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Orgnization, Integer> {
}
