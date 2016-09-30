package com.iia.shop.entity;

import java.io.Console;

public class Vehicule {

	
	
	public String brand;
	public int year;
	public int speed;
	public String model;
	public String color;
	public double price;

	public static void start() {
		System.out.println("La voiture avance");
	}

	public static void stop() {
		System.out.println("La voiture est a l'arret");
	}

	public static void speedUp(int speed) {
		Console console = System.console();
		speed = Integer.parseInt(console.readLine("Augmenter la vitesse de la voiture : "));
	}
	
	public static void speedDown(int speed) {
		Console console = System.console();
		speed = Integer.parseInt(console.readLine("Diminuer la vitesse de la voiture : "));
	}
	
	public static void read (int saisie){
		Console console = System.console();
		saisie = Integer.parseInt(console.readLine("Quelle voiture voulez-vous voir ?"));
	}

}
