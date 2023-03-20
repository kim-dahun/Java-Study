package repeat0320;

public class Location {
	// field
	private String location;
	private int detailsX;
	private int detailsY;

	// Constructor
	public Location() {

	}

	public Location(String location, int detailsX, int detailsY) {
		super();
		this.location = location;
		this.detailsX = detailsX;
		this.detailsY = detailsY;
	}

	// method

	public void printNowInfo() {
		System.out.printf("현재 위치 : %s, 상세 위치 : ( %d , %d )", location, detailsX, detailsY);

	}
	
	public String viewNowdetail() {
		return "( " + detailsX + " , " + detailsY + " ) ";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getDetailsX() {
		return detailsX;
	}

	public void setDetailsX(int detailsX) {
		this.detailsX = detailsX;
	}

	public int getDetailsY() {
		return detailsY;
	}

	public void setDetailsY(int detailsY) {
		this.detailsY = detailsY;
	}

}
