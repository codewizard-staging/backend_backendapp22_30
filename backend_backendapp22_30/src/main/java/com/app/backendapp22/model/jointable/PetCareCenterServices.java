package com.app.backendapp22.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.backendapp22.model.Manager;
import com.app.backendapp22.model.Pet;
import com.app.backendapp22.model.PetCareCenter;
import com.app.backendapp22.model.PetOwner;
import com.app.backendapp22.model.Document;
import com.app.backendapp22.model.PetService;
import com.app.backendapp22.enums.PetServiceType;
import com.app.backendapp22.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterServices")
@Table(schema = "\"backendapp22\"", name = "\"PetCareCenterServices\"")
@Data
public class PetCareCenterServices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"ServiceId\"")
    private Integer serviceId;
 
}