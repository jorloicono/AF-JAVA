package unidad2;

import java.util.Scanner;

public class unidad2 {

	public static void main(String[] args) {
		// Principales tipos de datos
		int a = 10;// int acepta numeros enteros positivos y negativos
		long b = 1000000000000000l; // long acepta numeros enteros pero muy grandes al inicializarlo hay que colocar
									// la letra l al final
		float c = 1.02f;// numeros reales cortos, al inicializarlo hay que colocar una f al final
		double d = 1.1234567890; // numeros reales largos.
		char e = 'a';// Caracteres de cualquier tipo siempre deben estar entre comillas simples
		boolean f = true; // Valores logicos unicamente true o false
		String texto = "hola";// Tipo textos deben inciar los datos entre comillas dobles

		// Operadores matematicos
		// los estandar + - *(multiplicacion) y /
		// simbolo % realiza la operacion resta
		int g = 10 % 4;// el resto seria 2
		// Operadpres matematicos complejos
		// += -= *= /= %=
		// toman el valor anterior y hacen la operacion correspondiente con el siguiente
		a += 5; // ahora a va a valer 15, 10 que tenia antes 5 que se le suma
		// ++ -- aumentan o disminuyen 1
		a++; // ahhora vale 16 tenia 15 y se le agrega 1

		// Operadores logicos
		// los estadar < > <= >= ==(igualdad) !=(diferente)
		// Operaadores de conjuncion
		// && || Buscar en internet tablas de verdad de and y or
		// estos operadores siempre devuelven un valor boolean
		boolean h = 15 < 10;// la variable h va a almacenar true

		// Ejemplo basico de operaciones
		Scanner entrada = new Scanner(System.in);// Herramienta que nos permite entrar datos por consola
		System.out.println("Introducir un numero");// Mostrar mensajes
		int n1 = Integer.parseInt(entrada.nextLine());
		// entrada tiene la funcion nextline que nos permite entrar toda la linea
		// escrita
		// es recomendable utilizar nexline y no otra como nextint o next double por
		// problemas con el buffer de consola
		// Integer.partseInt permite combertir el texto al tipo de dato necesario en
		// caso de double utilziar Double, en caso de float Float y normalmente
		// continuan este mismo patron
		System.out.println("Introduce otro numero");
		int n2 = Integer.parseInt(entrada.nextLine());
		System.out.println("Sumando ambos numeros " + (n1 + n2));// si utilizas el operador + puedes concatenar textos
																	// pero debes tener cuidado al realizar operaciones
																	// y concatenar
		n1 *= n2;
		System.out.println("Multiplicacion y asignacion " + n1);
		n2++;
		System.out.println("Incrementando n2 = " + n2);
		System.out.println("N1>N2? " + (n1 > n2));
		
		System.out.println("Introduce un texto");
		String text=entrada.nextLine();//nextLine devuelve directamente un String
		
		System.out.println("Tamaño del texto "+text.length());//funciones que tiene String
		System.out.println("Primera letra "+text.charAt(0));
		System.out.println("Todo en mayuscula "+text.toUpperCase());
		System.out.println("Tu texto es Hola "+text.equals("Hola"));
		//Aconsejo ver resto de funciones utilizados para String mostrados en las video clases.

	}

}
