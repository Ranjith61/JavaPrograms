package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.dto.NewsPaperDTO;
import com.xworkz.newspaper.repository.*;
import com.xworkz.newspaper.service.*;

public class NewsPaperRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in newspaper runner...");
		NewsPaperRepository repo = new NewsPaperRepositoryImpl();
		NewsPaperService service = new NewsPaperServiceImpl(repo);
		NewsPaperDTO dto = new NewsPaperDTO("times of india", 0, 12, "Kuvempuii");
		service.validation(dto);
		boolean persisted = service.validation(dto);
		System.out.println("persisted:" + persisted);

	}

}