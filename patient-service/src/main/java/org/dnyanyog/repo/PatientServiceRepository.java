package org.dnyanyog.repo;

import org.dnyanyog.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientServiceRepository extends JpaRepository<Patients, Long> {
	
}

