package pet.park.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pet.park.controller.model.ContributorData;
import pet.park.entity.Contributor;

@Service

public class ParkService  

@Autowired
private ContributorDao contributorDao 

@Transactional(readonly = false)
public ContributorData insertContributor(ContributorData contributorData){
   Long contributorId = contributorData.getContributorId();
   Contributor contributor; 

  if (Objects.isNull(contributorId)) {
	  contributor = new Contributor(); }
  
  else {
	  
    contributor = findContributorById(contributorId);
    { 
  }
    
private Contributor findContributorById (Long contributorId) {
	return null; 
}
