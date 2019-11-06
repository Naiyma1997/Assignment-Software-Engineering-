public class customer {
	 private String name,phone,address,location;
	 public customer () {  }
	 public customer (String name, String phone, String address, String location) {
		   this.name = name;
		   this.phone = phone;
		   this.address =  address;
		   this.location = location;
	 }
	 public void setName (String name) {
		 this.name = name;
	 }
	 public String getName () {
		 return name;
	 } 
	 public void setPhone (String phone) {
		 this.phone = phone;
	 }
	 public String getPhone () {
		  return phone;
	 }
	 public void setAddress (String address) {
		  this.address = address;
	 }
	 public String getAddress () {
		   return address;
	 }
	 public void setLocation (String location) {
		   this.location = location;
	 }
	 public String getLocation () {
		   return location;
	 }
}