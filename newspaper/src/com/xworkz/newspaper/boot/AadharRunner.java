package com.xworkz.newspaper.boot;
import com.xworkz.newspaper.dto.AadharDTO;
import com.xworkz.newspaper.repository.AadharRepository;
import com.xworkz.newspaper.repository.AadharRepositoryImpl;
import com.xworkz.newspaper.service.AadharService;
import com.xworkz.newspaper.service.AadharServiceImpl;


public class AadharRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in AadharRunner...");
		AadharRepository aadharRepository = new AadharRepositoryImpl();
		AadharService aadharService = new AadharServiceImpl(aadharRepository);
		AadharDTO dto = new AadharDTO("Ranjith Kumar E", 10 , 12 , "white colour");
		boolean persisted = aadharService.validateAndSave(dto);
		System.out.println("persisted:" + persisted);

	}

}
