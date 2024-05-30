package org.dnyanyog.repo;


import java.util.List;

import org.dnyanyog.entity.Cases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
@Component
public interface CaseServiceRepository extends JpaRepository<Cases, Long> {
	List<Cases> findByPatientId(long patientId);
}