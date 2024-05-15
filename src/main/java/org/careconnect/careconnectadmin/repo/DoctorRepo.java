package org.careconnect.careconnectadmin.repo;

import org.careconnect.careconnectcommon.entity.DoctorEntity;
import org.careconnect.careconnectcommon.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepo extends JpaRepository<DoctorEntity,Long> {
    boolean existsByEmail(String email);
    boolean existsByAdharNo(long adharNo);

    Optional<DoctorEntity> findBySpecialization(Specialization specialization);
}
