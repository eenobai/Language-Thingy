class Language{

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;


  public Language(String myName, int myNumSpeakers, String myRegionsSpoken, String myWordOrder){
    this.name = myName;
    this.numSpeakers = myNumSpeakers;
    this.regionsSpoken = myRegionsSpoken;
    this.wordOrder = myWordOrder;
  }

  public void getInfo(){
    
	  System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + wordOrder);
	  
  }

  public static void main(String[] args){
	  	Language kekw = new Language("gay", 1337, "pepelaff", "HE DOESNT KNOW LULW");
	  	kekw.getInfo();
	  	Mayan peepothink = new Mayan("I wonder what", 1337);
	  	
	  	peepothink.getInfo();

      SinoTibetan hmm = new SinoTibetan("Chinese name", 1448);
      SinoTibetan mhh = new SinoTibetan("weeb name", 69);

      hmm.getInfo();
      mhh.getInfo();

  }
}