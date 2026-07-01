package com.nightshift.pet_clinic.repositories;

import com.nightshift.pet_clinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
