## Ejercicio 13: Sistema de Gestión de Animales

Crea un sistema de gestión de animales utilizando herencia en Java. Define una clase base llamada `Animal` con los siguientes atributos: nombre y edad. Implementa un constructor y métodos de acceso para estos atributos.

Luego, crea dos clases derivadas: `Perro` y `Gato`. Ambas clases deben heredar de la clase base `Animal`. La clase `Perro` debe incluir un atributo adicional para representar la raza del perro, y la clase `Gato` debe incluir un atributo para representar el color del pelaje.

En el programa principal, crea instancias de ambas clases, establece valores para sus atributos y muestra la información básica de cada animal, incluyendo su nombre, edad y características específicas de la especie.

## Ejercicio 14: Figuras geométricas

Crea una jerarquía de clases para representar figuras geométricas. La clase base debe ser `Figura` y debe contener métodos para calcular el área y el perímetro. Luego, implementa subclases para representar diferentes tipos de figuras como `Círculo`, `Rectángulo` y `Triángulo`. Cada subclase debe heredar de la clase `Figura` y proporcionar implementaciones específicas para los cálculos de área y perímetro.

En el programa principal, crea instancias de estas clases y muestra los resultados de los cálculos.

## Ejercicio 15: Sistema de Gestión de Empleados

Crea un sistema de gestión de empleados utilizando herencia en Java. Define una clase base llamada `Empleado` con los siguientes atributos: nombre, edad y salario. Implementa un constructor y métodos de acceso para estos atributos.

Luego, crea dos clases derivadas: `EmpleadoTiempoCompleto` y `EmpleadoTiempoParcial`. La clase `EmpleadoTiempoCompleto` debe incluir un atributo adicional para representar el cargo (por ejemplo, "Desarrollador" o "Gerente"). La clase `EmpleadoTiempoParcial` debe incluir un atributo para representar las horas trabajadas por semana.

Ambas clases derivadas deben heredar de la clase base `Empleado`. Implementa métodos específicos en cada clase derivada para calcular el salario total de un empleado. Para `EmpleadoTiempoCompleto`, el salario total se calcula sumando el salario base más un bono (por ejemplo, 10% del salario base). Para `EmpleadoTiempoParcial`, el salario total se calcula multiplicando las horas trabajadas por una tarifa por hora.

En el programa principal, crea instancias de ambas clases, establece valores para sus atributos y muestra la información detallada de cada empleado, incluyendo su salario total.

## Ejercicio 16: Sistema de Biblioteca

Diseña un sistema de gestión para una biblioteca utilizando principios de Programación Orientada a Objetos (POO) en Java. Debes implementar al menos las siguientes clases:

- **Libro**: Representa un libro con atributos como título, autor, año de publicación, y disponibilidad (si está prestado o no).
- **Lector**: Representa a una persona que puede tomar libros prestados de la biblioteca. Debe tener atributos como nombre, número de identificación, y una lista de libros prestados.
- **Biblioteca**: Representa la biblioteca en sí. Debe contener una lista de libros disponibles, una lista de libros prestados y una lista de lectores registrados. Implementa métodos para prestar un libro a un lector, devolver un libro, mostrar información sobre los libros disponibles y los lectores registrados.
- **Programa Principal**: En el programa principal, crea instancias de libros, lectores y la biblioteca. Realiza algunas operaciones como registrar un lector, agregar libros a la biblioteca, prestar libros a los lectores y mostrar información relevante.

Este ejercicio te permitirá aplicar conceptos de POO como encapsulamiento, herencia y polimorfismo. Además, deberías considerar la relación entre las clases (por ejemplo, un lector puede tener varios libros prestados, un libro puede estar en la biblioteca o prestado a un lector).
