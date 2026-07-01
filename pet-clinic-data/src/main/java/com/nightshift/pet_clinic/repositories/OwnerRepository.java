package com.nightshift.pet_clinic.repositories;

import com.nightshift.pet_clinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
