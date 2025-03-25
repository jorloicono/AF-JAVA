## Ejercicio 10: Persona

Se requiere un programa que modele el concepto de una persona. Una persona posee nombre, apellido, número de documento de identidad y año de nacimiento. La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.

La clase debe incluir los siguientes métodos:

1. Definir un método que imprima por pantalla los valores de los atributos del objeto.
2. En el método `main`, se deben crear dos personas y mostrar los valores de sus atributos por pantalla.

## Ejercicio 11: Calculadora Básica

Crea una clase en Java llamada `Calculadora` que implemente una calculadora básica con las siguientes funcionalidades:

- **Suma**: Un método que toma dos números como parámetros y devuelve la suma de ambos.
- **Resta**: Un método que toma dos números como parámetros y devuelve la resta del primero menos el segundo.
- **Multiplicación**: Un método que toma dos números como parámetros y devuelve su producto.
- **División**: Un método que toma dos números como parámetros y devuelve el cociente resultante de la división del primero entre el segundo. Si el segundo número es cero, debe mostrar un mensaje indicando que la división por cero no está permitida.

En el programa principal, crea una instancia de la clase `Calculadora`, realiza varias operaciones y muestra los resultados.

## Ejercicio 12: Rectángulo

Crea una clase `Rectángulo` con las siguientes características:

- Incluye un constructor al que se le pasan los datos de base y altura. Si se intenta dar valor negativo a alguna de las dimensiones, lo corrige al valor positivo usando `Math.abs(int a)`.
- Un constructor sin parámetros que inicializa un nuevo rectángulo con base 2 y altura 1.
- Un método `esCuadrado` que indica si el rectángulo actual es un cuadrado.
- Un método `area` que calcula el área del rectángulo actual.
- Un método `perimetro` que calcula el perímetro del rectángulo actual.
- Un método `gira` que gira 90 grados el rectángulo actual (intercambiando la base por la altura).
