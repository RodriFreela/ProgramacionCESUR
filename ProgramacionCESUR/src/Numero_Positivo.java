import java.util.*;

public class Numero_Positivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		do {
			System.out.print("Introduce un numero que sea positivo:");
			num = sc.nextInt();
			
		} while (num <=0);
		
		System.out.println("Los 20 numeros sucesivos a " + num + " son:");
		
		for (int num2 = 1; num2 <= 20; num2++) {
            System.out.println(num + num2);
        }
				

	}

}
