package com.linkedinlearning.learning_lil;

import com.linkedinlearning.learning_lil.data.entity.Guest;
import com.linkedinlearning.learning_lil.data.entity.Reservation;
import com.linkedinlearning.learning_lil.data.entity.Room;
import com.linkedinlearning.learning_lil.data.repository.GuestRepository;
import com.linkedinlearning.learning_lil.data.repository.ReservationRepository;
import com.linkedinlearning.learning_lil.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningLilApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningLilApplication.class, args);
	}

}
