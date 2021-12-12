package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.JOptionPane;


@SpringBootApplication
public class Aplication1SpringApplication {

	public static void main(String[] args) {
		
		
		String msg = JOptionPane.showInputDialog(null, "Introduce un nombre"); //pide al usuario ingresar su nombre
		System.out.println("Bienvenid@ a Spring Framewrok" + " " + msg); //Retorna un mensaje de bienvenida al usuario
		
		//Retorna la página de bienvenida en html
		HomeController obj = new HomeController();
		obj.mostrarHome();
	}
	
	

}

