package com.javier.display_model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/date")
    public String date(Model model) {
    	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE', the 'd ' of ' MMMM ',' uuuu ");
    	LocalDate ld = LocalDate.of(2014, Month.JUNE, 30);
	    String date = fmt.format(ld);
    	model.addAttribute("date", date); 
        return "date.jsp";
    }
    @RequestMapping("/time")
    public String time(Model model) {
    	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("h':'mm a");
    	LocalTime lt = LocalTime.of(17, 30, 12);
    	String time = fmt.format(lt);
    	model.addAttribute("time", time); 
        return "time.jsp";
    }
}
