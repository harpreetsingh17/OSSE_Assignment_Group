package com.linkedinlearning.learning_lil.data.repository;

import com.linkedinlearning.learning_lil.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
