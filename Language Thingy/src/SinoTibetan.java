class SinoTibetan extends Language{
	SinoTibetan(String myName, int myNumSpeakers){
		super(myName, myNumSpeakers, "Asia", "subject-object-verb");
		if(myName.contains("Chinese")){
			this.wordOrder = "subject-verb-object";
		}
		
	}
	
	/* @Override
	  public void getInfo() {

	    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
	    System.out.println("The language follows the word order: " + this.wordOrder);
	    System.out.println("Fun fact: " + this.name + " is an ergative language.");

	  }*/
	 
}
