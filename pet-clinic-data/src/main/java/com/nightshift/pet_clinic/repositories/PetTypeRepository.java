package com.nightshift.pet_clinic.repositories;

import com.nightshift.pet_clinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
