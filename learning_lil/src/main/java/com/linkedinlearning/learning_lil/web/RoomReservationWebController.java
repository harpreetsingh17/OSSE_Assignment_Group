package com.linkedinlearning.learning_lil.web;

import com.linkedinlearning.learning_lil.business.domain.RoomReservation;
import com.linkedinlearning.learning_lil.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationWebController {
    private final ReservationService reservationService;

    @Autowired
    public RoomReservationWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReservations(@RequestParam(value = "date", required = false)String dateString, Model model){
        List<RoomReservation> roomReservationList = this.reservationService.getRoomReservationList(DateUtils.createDateFromDateString(dateString));
        model.addAttribute(roomReservationList);
        return "reservations";
    }
    
   @PostMapping("/addreservation")
    public String addReservations(@RequestParam(value = "date", required = false)String dateString, Model model){
        List<RoomReservation> roomReservationList = this.reservationService.getRoomReservationList(DateUtils.createDateFromDateString(dateString));
        model.addAttribute(roomReservationList);
        return "reservations";
    }
}
