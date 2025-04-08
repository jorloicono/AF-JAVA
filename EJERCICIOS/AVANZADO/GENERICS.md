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

# Ejercicio 3: Implementación de Pila en Java

## Objetivo
Crear y comparar varias implementaciones de una **Pila** en Java, y poner a prueba su rendimiento y eficiencia.

## Parte 1: Implementación de la Pila

### 1. **Pila Básica con Nodos**
Implementa la pila utilizando nodos donde cada nodo tiene un valor y referencia al siguiente nodo.

- **Métodos principales**:
  - `apilar()`
  - `desapilar()`
  - `peek()`
  - `isEmpty()`
  - `size()`

### 2. **Pila Genérica**
Crea una versión genérica de la pila utilizando **Generics** en Java para almacenar cualquier tipo de objeto.

- **Métodos**:
  - `apilar()`
  - `desapilar()`
  - `peek()`
  - `isEmpty()`

### 3. **Pila con `ArrayList`**
Utiliza un **ArrayList** para almacenar los elementos de la pila.

- **Métodos**:
  - `apilar()`
  - `desapilar()`
  - `peek()`
  - `isEmpty()`

## Parte 2: Prueba de Rendimiento

1. Apila y desapila **10 millones de elementos** con las tres implementaciones.
2. Mide el tiempo de ejecución de cada operación utilizando `System.currentTimeMillis()`.

## Parte 3: Evaluación

- **Comparar Resultados**:
  - ¿Cuál es la implementación más rápida?
  - ¿Cuál tiene el mejor uso de memoria?
  - ¿Cómo afectan las operaciones cuando el número de elementos es muy grande?
