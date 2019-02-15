/*
Create a class to represent the concept of a city. Each city object must have the following properties:
-	a name
-	a population
-	the area of the city in square miles

Each city object shall have the following behaviors
-	a version of toString
-	an instance method that returns true if it is a big city. Big cities have a population of more than 250,000
-	an instance method that returns the population density of the city in people per square mile, rounded to the nearest int
-	an instance method that returns the difference in population density between a calling City object 
    and another City object sent as an explicit parameter.
-	an instance method that creates a new city by "merging" two cities (the calling object and a parameter). The new cities name is the name of the two original cities separated with a hyphen. The name of the city with the highest population density is first in the new name. The new cities area and population are the sum of the original cities.
-	the constructor should throw an IllegalArgumentException (you may check the Java Docs for how to do that, or ask  your TA) if the population is negative.

The city class shall have 1 constructor with 3 parameters for the required instance variables. 
 */

package city;

public class City {
	// Final variables in CAPS and with underscore
	public static final int BIG_CITY_POP = 250000;
	private String name;
	private int population;
	private double area;
	
	public City(String name, int population, double area) throws IllegalArgumentException {
		if (population < 0)
			throw new IllegalArgumentException("negative popula-tion!");
		// Difference between local variables and instance variables
		// Same name, distinguished by "this"
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public String toString() {
		return this.name + " , population: " + this.population + ", area: " + this.area + " square miles";
	}

}


// threuioasdflkhjsldks
//thus cjsdaf
