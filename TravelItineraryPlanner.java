package com.codealpha.travelplan;

	import java.util.*;

	public class TravelItineraryPlanner {
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        List<Destination> destinations = new ArrayList<>();
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("Travel Itinerary Planner");
	            System.out.println("1. Add Destination");
	            System.out.println("2. View Itinerary");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addDestination(destinations);
	                    break;
	                case 2:
	                    viewItinerary(destinations);
	                    break;
	                case 3:
	                    exit = true;
	                    System.out.println("Exiting Travel Itinerary Planner. Have a great trip!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	        scanner.close();
	    }

	    private static void addDestination(List<Destination> destinations) {
	        scanner.nextLine(); // Consume newline
	        System.out.print("Enter destination: ");
	        String destinationName = scanner.nextLine();
	        System.out.print("Enter date of visit (MM/DD/YYYY): ");
	        String date = scanner.nextLine();
	        System.out.print("Enter budget for the visit: ");
	        double budget = scanner.nextDouble();

	        Destination destination = new Destination(destinationName, date, budget);
	        destinations.add(destination);
	        System.out.println("Destination added successfully!");
	    }

	    private static void viewItinerary(List<Destination> destinations) {
	        if (destinations.isEmpty()) {
	            System.out.println("No destinations added yet.");
	            return;
	        }

	        System.out.println("Travel Itinerary:");
	        for (Destination destination : destinations) {
	            System.out.println(destination);
	        }
	    }

	    static class Destination {
	        private String name;
	        private String date;
	        private double budget;

	        public Destination(String name, String date, double budget) {
	            this.name = name;
	            this.date = date;
	            this.budget = budget;
	        }

	        @Override
	        public String toString() {
	            return "Destination: " + name + ", Date: " + date + ", Budget: $" + budget;
	        }
	    }
	}


