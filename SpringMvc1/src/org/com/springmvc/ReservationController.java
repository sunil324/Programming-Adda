package org.com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reservation")
@Controller
public class ReservationController {
	@RequestMapping("/bookingform")
	
	public String bookingform(Model model) {
		
		Reservation res=new Reservation();
		model.addAttribute("reservation",res);
		return "reservation-page";
	}
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation")Reservation res) {
		return "confirmation-form";
	}
	

}
