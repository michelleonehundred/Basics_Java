package pack.olives;

public class Olive {


	public static final long BLACK=0x000000; //the value cannot be 
	                                         //changed once it was created
	//all in upper case
	public static final long GREEN=0x00FF00;
	
	public String name = "Katlatama";
	public String flavor = "Grassy";
	public long color = Olive.BLACK;
	private int oil = 3;

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public Olive() {
		System.out.println("Contrucor of " + this.name);
	}

	public Olive(int oil) {
		//this.oil = oil;
		
		setOil(oil);
	}

	public int crush() {
		System.out.println("ouch!");
		return oil;
	}

}
