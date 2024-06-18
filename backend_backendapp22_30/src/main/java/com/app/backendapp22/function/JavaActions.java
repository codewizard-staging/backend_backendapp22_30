package com.app.backendapp22.function;

import com.app.backendapp22.model.Manager;
import com.app.backendapp22.model.Pet;
import com.app.backendapp22.model.PetCareCenter;
import com.app.backendapp22.model.PetOwner;
import com.app.backendapp22.model.Document;
import com.app.backendapp22.model.PetService;




import com.app.backendapp22.enums.PetServiceType;
import com.app.backendapp22.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  