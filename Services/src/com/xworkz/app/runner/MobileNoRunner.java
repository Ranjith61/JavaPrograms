package com.xworkz.app.runner;

import com.xworkz.app.repository.*;
import com.xworkz.app.service.*;
	public class MobileNoRunner {
	    public static void main(String[] args) {
	        System.out.println("Invoking main in MobileNoRunner");
	        MobileNoRepository mobileNoRepository = new MobileNoRepositoryImpl();

	        MobileNoService mobileNoService = (MobileNoService) new MobileNoServiceImpl(mobileNoRepository);
	        boolean ref = mobileNoService.validateAndSave(1234567890L);
	        System.out.println(ref);

	        boolean ref1 = mobileNoService.validateAndSave(1234567890L);
	        System.out.println(ref1);
	    }
	}


