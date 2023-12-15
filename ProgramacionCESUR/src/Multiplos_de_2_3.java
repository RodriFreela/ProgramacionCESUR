
public class Multiplos_de_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Contador para llevar la cuenta de los números encontrados
		        int contador = 0;

		        // Iterar a través del rango de 1 a 100
		        for (int i = 1; i <= 100; i++) {
		            // Verificar si el número es múltiplo de 2 o de 3
		            if (i % 2 == 0 || i % 3 == 0) {
		                // Mostrar el número
		                System.out.println(i);
		                
		                // Incrementar el contador
		                contador++;
		            }
		        }

		        // Mostrar el total de números encontrados
		        System.out.println("Total de números encontrados: " + contador);
		    }
		}

		
		

	
