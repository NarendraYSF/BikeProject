package bikeproject;

public class RoadBike extends Bike implements RoadParts {

	private int tyreWidth, postHeight;

	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor

	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor

	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
					int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor

	@Override
	public String toString()
	{
		return super.toString() +
				"\nThis Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".";
	}//end method toString

	// Implementing methods from RoadParts interface
	@Override
	public String getTyreWidth() {
		return Integer.toString(this.tyreWidth);
	}//end method getTyreWidth

	@Override
	public void setTyreWidth(String newValue) {
		try {
			this.tyreWidth = Integer.parseInt(newValue);
		} catch (NumberFormatException e) {
			System.out.println("Error: Tyre width must be a valid integer.");
		}
	}//end method setTyreWidth

	@Override
	public String getPostHeight() {
		return Integer.toString(this.postHeight);
	}//end method getPostHeight

	@Override
	public void setPostHeight(String newValue) {
		try {
			this.postHeight = Integer.parseInt(newValue);
		} catch (NumberFormatException e) {
			System.out.println("Error: Post height must be a valid integer.");
		}
	}//end method setPostHeight

}//end class RoadBike