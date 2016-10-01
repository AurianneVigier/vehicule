package com.iia.shop.entity;

import java.io.Console;

public class Vehicule {

	public static String brand;
	public static int year;
	public static int speed;
	public static String model;
	public static String color;
	public static double price;

	public Vehicule(String brand, int year, int speed, String model, String color, double price) {
		super();
		this.brand = brand;
		this.year = year;
		this.speed = speed;
		this.model = model;
		this.color = color;
		this.price = price;
	}

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

	public static void read(int saisie) {
		Console console = System.console();
		saisie = Integer.parseInt(console.readLine("Quelle voiture voulez-vous voir ?"));
	}

	public static void readAll() {
		// TODO Auto-generated method stub

	}

	public static void readSingle() {
		// TODO Auto-generated method stub

	}

	public static void create(String[] Voiture) {
		Voiture = new String[10];
		Console console = System.console();
		System.out.println("Entrez la marque : ");
		brand = console.readLine("");
		System.out.println("Entrez l'annee : ");
		year = Integer.parseInt(console.readLine(""));
		System.out.println("Entrez la vitesse : ");
		speed = Integer.parseInt(console.readLine(""));
		System.out.println("Entrez le modele : ");
		model = console.readLine("");
		System.out.println("Entrez la couleur : ");
		color = console.readLine("");
		System.out.println("Entrez le prix : ");
		price = Double.parseDouble(console.readLine(""));

	}

	public static void update() {
		// TODO Auto-generated method stub

	}

	public static void delete() {
		// TODO Auto-generated method stub

	}

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
