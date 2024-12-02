package pet.park.controller.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import pet.park.entity.Amenity;
import pet.park.entity.Contributor;
import pet.park.entity.Geolocation;
import pet.park.entity.PetPark;
@Data

public class ContributorData {

	private Long contributorId;
	private String contributorName;
	private string contributorEmail;
	private Set<PetPark> Petparks = new  HashSet<>(); 
	
	@Value
public class PetParkResponse

    private Long PetparkId;
    private String parkName;
    private String directions;
    private String stateOrProvince;
    private String country;
    private Geolocation geolocation;
    private Set<String> amenities = new HashSet<>(); 
}

}	
	}


