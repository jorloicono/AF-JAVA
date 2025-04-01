# Ejercicio 1: Clase genérica para pares de valores

Implementa una clase genérica `Par<K, V>` que represente un par de valores, compuesta por una clave de tipo `K` y un valor de tipo `V`.  
La clase debe incluir:

- Un constructor que reciba los dos valores.  
- Métodos `getClave()` y `getValor()` para acceder a cada uno.  
- Un método `mostrarTipos()` que imprima por consola el tipo de la clave y el valor usando `getClass().getName()`.

En el `main`, crea un objeto `Par<String, Integer>`, imprime los tipos y los valores de clave y valor.

# Ejercicio 2: Comparar listas con un método genérico

Crea un método genérico `compararListas` que reciba dos listas del mismo tipo (por ejemplo, `List<T>`) y devuelva `true` si ambas tienen los mismos elementos en el mismo orden.  
El tipo `T` debe extender de `Comparable<T>`.  
El método debe recorrer las listas y comparar cada elemento usando `equals`.

En el método `main`:

- Crea dos listas iguales y una tercera distinta.  
- Llama a `compararListas` y muestra si las listas son iguales o no.  
- Prueba el método con listas de enteros y listas de cadenas.

# Ejercicio 3: Stack y Heap en Java

**Enunciado:**  
Crea una clase llamada `Persona` con dos atributos: `String nombre` y `int edad`.  
En el constructor, inicializa ambos atributos.

En la clase principal:

- Declara varias variables primitivas (como `int x = 10`) y al menos un objeto de tipo `Persona`.  
- Añade comentarios en el código indicando qué variables y objetos se almacenan en el **stack** y cuáles en el **heap**.  
- Explica brevemente, en comentarios o en consola, cómo funciona la gestión de memoria en Java (stack vs heap).
