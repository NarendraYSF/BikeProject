package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {

		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
		MountainBike bike3 = new MountainBike();

		System.out.println(bike1);
		System.out.println(bike2);
		System.out.println(bike3);

		// Update post height for bike1 to 20 instead of 22
		bike1.setPostHeight("20");
		System.out.println("\nAfter updating bike1's post height:");
		System.out.println(bike1);
	}//end method main

}//end class BikeDriver