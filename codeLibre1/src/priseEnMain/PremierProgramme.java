package priseEnMain;

public class PremierProgramme {
     String prenom;
	public String getPrenom() {
		return prenom; // prenom mean first name in french 
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	//Constructor class
	
	public PremierProgramme(String prenom) {
		super();
		this.prenom = prenom;
	}

	public static void main(String[] args) {
		
		PremierProgramme test = new PremierProgramme ("Gess"); 
		System.out.println(test.getPrenom()
			+", que penser vous de java ?");
		System.out.print("Java, is Extra !");
		// TODO Auto-generated method stub
		
	/* C'est mon permier code 
	 * programme java 
	 */
      
		
	}

}
