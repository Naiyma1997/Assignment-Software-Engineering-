public class Main {
	
	    public static void main (String arg[]) {
			  
			  customer c1 = new customer ("Nayma","0183764657","Bashundhara","Dhaka");
			  customer c2 = new customer ("Ava","01837646498","Pathapath","Dhaka");
			  food f1 = new food ("Soup", 1827, 200, "Liquid");
			  food f2 = new food ("Ice cream", 2471, 150, "desert");
			  restaurant r1 = new restaurant ("River cafe", 276354);
			  hotel h1 = new hotel ("Grand Park", 1762534, "Dhaka", r1);
			  r1.addFood (f1);
			  r1.addFood (f2);
			  System.out.println("Customer : "+c1.getName()+" orders "+f1.getName()+" in restaurant "+r1.name);
		}
}