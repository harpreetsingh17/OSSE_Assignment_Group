package com.linkedinlearning.learning_lil.data.repository;

import com.linkedinlearning.learning_lil.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
