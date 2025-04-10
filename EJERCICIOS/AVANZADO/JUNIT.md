# Parking

En esta práctica, vamos a partir de un proyecto Java ya creado (parking) que simula el software de un parking de coches. En vez de guardar registros en una base de datos, lo simularemos por medio de un `Map`.

## Clase App

La clase `App` contiene el método `main` y se encarga de mostrar el menú e interactuar con el usuario. El menú será el siguiente:

- Registrar entrada de coche
- Registrar salida de coche
- Imprimir coches en el parking
- Imprimir coches en el sistema
- Salir

## Clase Parking

La clase `Parking` contiene todos los coches registrados en el sistema. Nos ofrece los siguientes métodos:

- `existeCoche()`: Comprueba si existe un coche en el sistema buscando la matrícula.
- `getCoche()`: Obtiene un coche del sistema buscando la matrícula.
- `putCoche()`: Añade un coche al sistema por matrícula.
- `imprimirCochesSistema()`: Imprime todos los coches del sistema, tanto los que están dentro del parking como los que ya no están.
- `imprimirCochesParking()`: Imprime los coches que están dentro del parking.
- `cantidadAPagar()`: Calcula la cantidad a pagar por un coche según el tiempo que ha estado dentro del parking.

## Clase Coche

La clase `Coche` almacena los datos de un coche. Los atributos que tiene son:

- `marca`
- `modelo`
- `horaEntrada`
- `horaSalida`

Esta clase contendrá los métodos `get/set` de los anteriores atributos y el siguiente método:

- `cantidadAPagar()`: Calcula la cantidad a pagar, obteniendo los minutos que hay entre la fecha de entrada y la de salida.

## Requisitos

Para la correcta resolución de la práctica, se pide a través de JUnit crear los test necesarios para probar el método descrito de la clase `Coche` (los métodos `get/set` no son necesarios) y algunos de los métodos de la clase `Parking`.
