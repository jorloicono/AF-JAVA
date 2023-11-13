package unidad2;

import java.util.Scanner;

public class ejercicios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int peso;
		double altura;
		double imc;

		System.out.println("Dime tu peso");
		peso = Integer.parseInt(entrada.nextLine());
		System.out.println("Dime tu altura");
		altura = Double.parseDouble(entrada.nextLine());

		imc = peso / (altura * altura);

		System.out.println("Indice de masa corporal: " + imc);
		
		if(imc<18.5) {
			System.out.println("poco peso");
		}else if(imc<24.9) {
			System.out.println("saludable");
		}else if(imc<29.9) {
			System.out.println("sobrepeso");
		}else {
			System.out.println("obesidad");
		}
		
		System.out.println("Entre un numero del cual se quiere conocer el numero de digitos");
		int numero=entrada.nextInt();
		System.out.println("Digitos: "+(numero+"").length());
		
	}

}
