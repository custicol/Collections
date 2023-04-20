package ArCL;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ArrayList <String> colors = new ArrayList<String>();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Digite a cor de numero"+(i+1)+" : ");
			String color = sc.nextLine();
			colors.add(color);
		}
		
		Iterator<String> iterator = colors.iterator();
		
		System.out.println("Cores listadas: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Collections.sort(colors);
		System.out.println("\nCores em ordem:");
		System.out.println(""+colors);
	}

}
