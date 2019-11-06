public class hotel{
	public String hotelName;
	private int hotelId;
	public String hotelLocation;
	private restaurant grandS;
public hotel(){}
public hotel(String hotelName, int hotelId, String hotelLocation, restaurant grandS){
	this.hotelName = hotelName;
	this.hotelId = hotelId;
	this.hotelLocation = hotelLocation;
	this.grandS = grandS;
}
public void setID(int h){
	this.hotelId= h;
}
public int getID(){
	return hotelId;
}
public void setRes(restaurant r){
   this.grandS = r;	
}
public restaurant getRes(){
	return grandS;
}

	
	
	
	
	
	
	
	
	
}