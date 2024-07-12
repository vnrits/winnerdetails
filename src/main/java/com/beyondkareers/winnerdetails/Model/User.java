package com.beyondkareers.winnerdetails.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    
    private String name;
    private String email;

}
