package unidad2;

import java.util.Scanner;

public class unidad2 {

	public static void main(String[] args) {
		// Tipos de datos
		int numero = 14; //entero
		long grande = 123l;// entero largo(tener en cuenta que debe terminar con l)
		double a = 12.56;// real largo
		float b = 23.45f;// real corto(tener en cuenta que debe terminar con f)
		char letra = 'a';//un caracter
		char salto = '\n';//caracteres especiales
		char letraM = 25;// los caracteres son numeros que se sustituyen en la tabla ASCII
		boolean x = true;// logico
		boolean y;
		y = false;
		System.out.print(numero);
		System.out.print(salto);
		System.out.println(letra);
		System.out.println(letraM);
		System.out.println(grande);

		//operaciones matematicas
		long r1 = numero + grande;
		double r2 = numero * a;
		int r3 = 19 / 5;
		int r4 = 19 % 5;// resto de la divicion
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

		//operaciones de ioncrementos
		numero++;
		++numero;
		System.out.println(numero);
		numero--;
		System.out.println(numero);
		int dato = 0;
		System.out.println(dato++);
		System.out.println(++dato);
		//operaciones concatenadas
		dato += 5 * 3;
		System.out.println(dato);

		//evaluiacion de condiciones
		boolean logico = (5 >= 4) && (4 <= 3);
		System.out.println(logico);
		
		System.out.println("hola el numero es " + dato + " otro numero " + numero);
		System.out.println("la suma de 17 + 15 es " + (dato + numero));

		//tipos de datos complejos
		String texto="hola ";
		Integer numint=10;
		Double numdouble=10.4;
		Character letrachar='l';
		texto+= "mundo";
		System.out.println(texto);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre un numero:");
		int num= entrada.nextInt();
		entrada.nextLine();
		System.out.println("Entre un texto:");
		String texto2=entrada.nextLine();
		System.out.println("El numero es "+ num+ " el texto es "+ texto2);
		
		
		
		
	}

}
