package com.app.backendapp22.function;

import com.app.backendapp22.model.Manager;
import com.app.backendapp22.model.Pet;
import com.app.backendapp22.model.PetCareCenter;
import com.app.backendapp22.model.PetOwner;
import com.app.backendapp22.model.Document;
import com.app.backendapp22.model.PetService;
import com.app.backendapp22.enums.PetServiceType;
import com.app.backendapp22.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.backendapp22.repository.PetServiceRepository;
import com.app.backendapp22.repository.PetOwnerRepository;
import com.app.backendapp22.repository.PetCareCenterRepository;
import com.app.backendapp22.repository.ManagerRepository;
import com.app.backendapp22.repository.DocumentRepository;
import com.app.backendapp22.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
