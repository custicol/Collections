package ArCL;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Set <Integer> numbers = new HashSet<Integer>();
		
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		numbers.add(6);
		
		System.out.println("Digite o numero que voce deseja encontrar: ");
		int n = sc.nextInt();
		
		boolean verife;
		verife = numbers.contains(n);
		
		if(verife  == true) {
			System.out.println("O numero " +n+ " foi encontrado" );
		}else {
			System.out.println("o numero " +n+" não foi encontrado");
		}
			

	}

}
