package app;

import java.util.Scanner;
import app.service.VeterinaryService;
import app.controller.veterinaryController;

public class app {

	public app() {
	}

	public static void main(String[] args) {
	
		veterinaryController veterinaryController = new veterinaryController();
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
