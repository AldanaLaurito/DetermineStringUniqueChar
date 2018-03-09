import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese palabra: / Write word here: ");
		String str = sc.nextLine();
		int LongS = str.length();
		HashMap<String, Integer> NroOccur = new HashMap<String, Integer>();
		
		for (int i=0; i<(LongS-1); i++) {
			String St = Character.toString(str.charAt(i));
			if (NroOccur.containsKey(St)) {
				System.out.println("No tiene caracteres �nicos / The string doesn't have unique characters");
				System.exit(0);
			}
			else {
				
				NroOccur.put(St, 1);
			}
			
		}
		
		System.out.println("Todos sus caracteres son �nicos / The string has all unique characters");

	}
}