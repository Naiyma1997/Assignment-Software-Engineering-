public class restaurant {
	 public String name;
	 private int id;
	 public food f[]= new food [100];
	 public restaurant () {
		 for (int i=0;i<100;i++) {
			 f[i] = null;
		 }
	 }
	 public restaurant (String name, int id) {
		 this.name = name;
		 this.id = id;
	 }
	 public void addFood (food newF) {
		 for (int i=0;i<100;++i) {
			 if (f[i]==null) {
				 f[i] = newF;
			 }
		 }
	 }
	 public void deleteFood (int i) {
		 f[i] = null;
	 }
	 
}