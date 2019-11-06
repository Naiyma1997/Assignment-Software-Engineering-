public class food {
	 private String foodName;
	 private int foodID;
	 private double price;
	 private String type;
	 public food () { }
	 public food (String name, int id, int p, String t) {
		 foodName = name;
		 foodID = id;
		 price = p;
		 type = t;
	 }
	 public void setName (String name) {
		 foodName = name;
	 }
	 public String getName () {
		 return foodName;
	 }
	 public void setID (int id) {
		 foodID = id;
	 }
	 public  int  getID () {
		 return foodID;
	 }
	 public void setPrice (double p) {
		 price = p;
	 }
	 public double getPrice () {
		 return price;
	 }
	 public void setType (String type) {
		 this.type = type;
	 }
	 public  String getType () {
		 return type;
	 }
}