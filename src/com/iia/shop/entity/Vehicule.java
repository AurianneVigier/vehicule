package com.iia.shop.entity;

import java.io.Console;
import java.util.Scanner;

public class Vehicule {
	
	Console console = System.console();
	Scanner scan = new Scanner(System.in);

	public String brand;
	public int year;
	public int speed;
	public String model;
	public String color;
	public double price;

	public Vehicule(String brand, int year, int speed, String model, String color, double price) {
		super();
		this.brand = brand;
		this.year = year;
		this.speed = speed;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public Vehicule() {
		super();
	}
	
	// faire avancer la voiture si elle est a l'arret
	public void start() {
		speed = 1;
		System.out.println("La voiture avance");
	}

	// arreter la voiture si elle roule
	public void stop() {
		speed = 0;
		System.out.println("La voiture est a l'arret");
	}

	// augmenter la vitesse de la voiture
	public void speedUp() {
		speed = speed + 1; 
	}

	// diminuer la vitesse de la voiture
	public void speedDown() {
		speed = speed - 1;
		if(speed < 0)
        {
            speed = 0;
        }
	}

	// voir une voiture par rapport a son index
	public void read() {
		System.out.println("Voiture marque | annee | vitesse | modele | couleur | prix");
		System.out.println(" ");
		System.out.println("Voiture " + getBrand() + " " + getYear() + " " + getSpeed() + " " + getModel() + " " + getColor() + " " + getPrice());
	}

	// creer une voiture
	public static Vehicule create() {
		Vehicule voiture = new Vehicule();
		Console console = System.console();
		System.out.println("Entrez la marque : ");
		voiture.brand = console.readLine("");
		System.out.println("Entrez l'annee : ");
		voiture.year = Integer.parseInt(console.readLine(""));
		System.out.println("Entrez la vitesse : ");
		voiture.speed = Integer.parseInt(console.readLine(""));
		System.out.println("Entrez le modele : ");
		voiture.model = console.readLine("");
		System.out.println("Entrez la couleur : ");
		voiture.color = console.readLine("");
		System.out.println("Entrez le prix : ");
		voiture.price = Double.parseDouble(console.readLine(""));
		return voiture;
	}

	// modifier une voiture par rapport a son index
	public void update() {
		System.out.println("");
		System.out.println("Que souhaitez-vous modifier ?");
		System.out.println(" ");
		System.out.println("0- La marque");
		System.out.println("1- L'annee");
		System.out.println("2- La vitesse");
		System.out.println("3- Le modele");
		System.out.println("4- La couleur");
		System.out.println("5- Le prix");
		System.out.println(" ");
		int modifier = Integer.parseInt(console.readLine("Saisissez le numero de ce que vous voulez modifier :  "));
		switch (modifier) {
		case 0:
			brand = console.readLine("Entrez la marque : ");
			break;
		case 1:
			year = Integer.parseInt(console.readLine("Entrez l'annee : "));
			break;
		case 2:
			speed = Integer.parseInt(console.readLine("Entrez la vitesse : "));
			break;
		case 3:
			model = console.readLine("Entrez le modele : ");
			break;
		case 4:
			color = console.readLine("Entrez la couleur : ");
			break;
		case 5:
			price = Integer.parseInt(console.readLine("Entrez le prix : "));
			break;
		default:
			System.out.println("Vous allez sortir du menu modification");
			break;
		}
	}

	// getters et setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
