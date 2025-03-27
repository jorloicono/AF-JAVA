## Ejercicio 29: Ejercicio con Set

En una aplicación de gestión de estudiantes, se desea mantener un registro de los cursos en los que están inscritos los estudiantes. Diseña una clase `Estudiante` con atributos como nombre, número de estudiante, y un `Set` que almacene los nombres de los cursos en los que está inscrito el estudiante. 

Implementa métodos para:
1. Agregar un curso.
2. Eliminar un curso.
3. Mostrar la lista de cursos de un estudiante específico.

Asegúrate de manejar posibles duplicados de cursos para un estudiante.

## Ejercicio 30: Ejercicio con Map

En una aplicación de inventario de una tienda, se desea realizar un seguimiento de la cantidad de productos disponibles en el inventario. Diseña una clase `Inventario` que utilice un `Map` para almacenar información sobre los productos. Cada producto está representado por un código único.

Implementa métodos para:
1. Agregar productos al inventario.
2. Actualizar la cantidad de existencias de un producto.
3. Obtener la cantidad de existencias de un producto dado su código.

Además, asegúrate de manejar casos en los que se intenta agregar un producto que ya existe en el inventario.

## Ejercicio– Uso de `TreeMap` con `Comparator` personalizado

### Objetivo:
Crear un `TreeMap` que almacene productos, ordenados por **precio** de menor a mayor. Si dos productos tienen el mismo precio, se ordenarán alfabéticamente por su nombre.

###  Requisitos:
1. Crea una clase `Producto` con los siguientes atributos:
   - `String nombre`
   - `double precio`

2. Implementa un `Comparator<Producto>` que:
   - Compare primero por el atributo `precio`.
   - En caso de igualdad de precios, compare alfabéticamente por `nombre`.

3. Inserta varios objetos `Producto` en un `TreeMap<Producto, Integer>`, donde el valor (`Integer`) puede representar la cantidad en stock.

4. Recorre el mapa e imprime el contenido ordenado según el comparador.


## Ejercicio – Comparar comportamiento de `equals()` y `hashCode()` en `HashSet`

### Objetivo:
Comprobar cómo funciona un `HashSet` al buscar objetos equivalentes y cómo afecta **no sobrescribir** o **sobrescribir correctamente** los métodos `equals()` y `hashCode()`.

### Requisitos:
1. Crea una clase `Libro` con los siguientes atributos:
   - `String titulo`
   - `String autor`

2. Crea un `HashSet<Libro>` e inserta un libro cualquiera (por ejemplo: `"1984", "George Orwell"`).

3. Comprueba si el conjunto contiene **otro libro diferente** con el mismo título y autor usando el método `contains()`.

4. Realiza dos pruebas:
   - Primero, **sin sobrescribir** `equals()` ni `hashCode()`: el resultado debería ser `false`.
   - Luego, sobrescribe correctamente ambos métodos: el resultado ahora debería ser `true`.

5. Reflexiona sobre por qué ocurre este comportamiento y cuál es la relación entre `equals()` y `hashCode()` en estructuras como `HashSet`.
