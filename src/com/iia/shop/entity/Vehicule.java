package com.iia.shop.entity;

import java.io.Console;
import java.util.Scanner;

public class Vehicule {
	
	Console console = System.console();
	Scanner scan = new Scanner(System.in);

	public  String brand;
	public  int year;
	public  int speed;
	public  String model;
	public  String color;
	public  double price;

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

	public  void start() {
		speed = 1;
		System.out.println("La voiture avance");
	}

	public  void stop() {
		speed = 0;
		System.out.println("La voiture est a l'arret");
	}

	public  void speedUp() {
		speed = speed + 1; 
	}

	public  void speedDown() {
		speed = speed - 1;
		if(speed < 0)
        {
            speed = 0;
        }
	}

	public  void read() {
		System.out.println("Voiture " + getBrand() + " " + getYear() + " " + getSpeed() + " " + getModel() + " " + getColor() + " " + getPrice());
	}

	public  void readAll(int j, String brand, int year, int speed, String model, String color, double price) {
		//System.out.println("Voiture " + getBrand() + " " + getYear() + " " + getSpeed() + " " + getModel() + " " + getColor() + " " + getPrice());

	}

	//public  void readSingle() {
		//System.out.println("Voiture " + getBrand() + " " + getYear() + " " + getSpeed() + " " + getModel() + " " + getColor() + " " + getPrice());

	//}

	public static Vehicule create(int add) {
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

	public static void update() {
		// TODO Auto-generated method stub

	}

	public static void delete() {
		// TODO Auto-generated method stub

	}

	public  String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public  int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public  int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public  String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public  String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public  double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
