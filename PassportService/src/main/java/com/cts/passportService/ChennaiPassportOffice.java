package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

// Type your code here
@Component
public class ChennaiPassportOffice implements HeadPassportOffice {

	private Document chennaiDocument;
	

	@Autowired
	public ChennaiPassportOffice(Document chennaiDocument) {
		super();
		this.chennaiDocument = chennaiDocument;
	}

	@Override
	public void doPhotoVerification() {
		System.out.println("Photo verification done using " + chennaiDocument.getIdProof());

	}

	@Override
	public void issuePassport() {

		System.out.println("Passport issue is in progress for "+chennaiDocument.getName()+" from "+chennaiDocument.getCity()+" office");
	}

	// Type your code here

}
