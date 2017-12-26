package pack;

import java.util.ArrayList;

import pack.olives.Olive;
import pack.press.OlivePress;

public class Main {

	public static void main(String[] args) {

		// Olive ol = new Olive();
		// ol.crush();
		ArrayList<Olive> olives = new ArrayList<Olive>();
		Olive olive;

		olive = new Olive(2);
		System.out.println(olive.name);
		olives.add(olive);

		olive = new Olive(2);
		System.out.println(olive.name);
		olives.add(olive);

		olive = new Olive(3);
		System.out.println(olive.name);
		olives.add(olive);

		// Olive[]olivez= {new Olive(),new Olive(),new Olive()};
		OlivePress press = new OlivePress();
		press.getOil(olives);

		System.out.println("You got " + press.getTotalOil() + " units of oil ");

		press.getOil(olives);

		System.out.println("You got " + press.getTotalOil() + " units of oil ");

	}

}
