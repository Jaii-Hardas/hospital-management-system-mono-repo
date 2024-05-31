package org.dnyanyog.repo;

import org.dnyanyog.entity.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface AppointmentRepository extends JpaRepository<Appointments, Long> {}
