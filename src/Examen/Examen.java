package Examen;

import java.util.Scanner;

public class Examen {
	
	public static void main(String[]arg) {
		

		Scanner ent=new Scanner(System.in);
		int numero=0;
		System.out.println("Hola");
		System.out.println("Dame un numero");
		numero=Integer.parseInt(ent.nextLine());
		 if (esPrimo(numero)) {
	            System.out.println(numero + " es un número primo.");
	        } else {
	            System.out.println(numero + " no es un número primo.");
	        }
	    }

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        if (numero == 2) {
	            return true;
	        }
	        if (numero % 2 == 0) {
	            return false;
	        }
	        int limite = (int) Math.sqrt(numero);
	        for (int i = 3; i <= limite; i += 2) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	
			
			
		
		
	}


