package app;

import java.util.Scanner;
import app.service.VeterinaryService;
import app.controller.VeterinaryController;

public class app {

	public app() {
	}

	public static void main(String[] args) {
		VeterinaryController veterinaryController = new VeterinaryController();
		while (true) {
		try {
			veterinaryController.createUser();
			break;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	  }
	}
}
