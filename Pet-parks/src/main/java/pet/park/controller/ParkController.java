package pet.park.controller;


import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotationRestController;
import pet.park.controller.model.ContributorData;
import pet.park.service.ParkService; 

@RestController
@RequestMapping("/pet_park")
@Slf4j
public class ParkController 
  @Autowired
    private ParkService parkService
{

@PostMapping("/contributor")
public ContributorData insertContributor(
		@RequestBody ContributorData contributorData) {
      log.info("Creating contributor {}, contributorData"); 
      return parkService.insertContributor (contributorData); 
