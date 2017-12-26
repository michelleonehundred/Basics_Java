package pack.press;

import java.util.ArrayList;

import pack.olives.Olive;

public class OlivePress {

	private int totalOil=0;
	
	public int getTotalOil() {
		return totalOil;
	}



	private void setTotalOil(int totalOil) {
		this.totalOil += totalOil;
	}



	public void getOil(ArrayList<Olive> olives) {
		int oil=0;
		for (Olive olive : olives) {

			oil+=olive.crush();

		} 
		//System.out.println("You got "+oil+" units of oil");
	
		setTotalOil(oil);
	
	}

}
