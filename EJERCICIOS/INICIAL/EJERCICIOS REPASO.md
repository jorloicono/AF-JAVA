### Sistema de gestión de pedidos

Imagina que estás desarrollando un sistema para gestionar pedidos de productos en una tienda online. El sistema debe ser capaz de realizar varias tareas como el registro de productos, creación de pedidos, asignación de descuentos y validación de datos.

#### Requisitos del ejercicio:

1. **Productos:**
   - Crea una clase `Producto` con los atributos `id`, `nombre`, `precio` y `descripción`.
   - Crea una lista de productos utilizando un `ArrayList` y llena la lista con al menos 5 productos.

2. **Pedido:**
   - Crea una clase `Pedido` que contenga los siguientes atributos:
     - `id`: un identificador único para cada pedido.
     - `fecha`: la fecha en la que se realiza el pedido (puedes usar la clase `LocalDate`).
     - `productos`: una lista de productos seleccionados para ese pedido.
     - `descuento`: un porcentaje de descuento aplicado al pedido (puedes usar un `double`).
   - Implementa un método en `Pedido` para calcular el precio total del pedido con descuento.

3. **Condicionales y Bucles:**
   - Implementa un método en la clase `Pedido` que recorra la lista de productos y verifique si alguno de los productos tiene un precio mayor a 100 (debe dar un mensaje de alerta en consola si es así).
   - Usa un bucle `for` o `foreach` para imprimir los productos de cada pedido en la consola.

4. **Clases Anidadas:**
   - Dentro de la clase `Pedido`, crea una clase anidada llamada `Descuento` que tenga un método para calcular el descuento total basado en la cantidad de productos y el precio total del pedido.

5. **Excepciones:**
   - Si se intenta agregar un producto con un precio negativo o igual a 0 al pedido, lanza una excepción personalizada `PrecioInvalidoException` y maneja la excepción en el método que agrega productos al pedido.

6. **Herencia:**
   - Crea una clase `ProductoDescuento` que herede de `Producto` y agregue un nuevo atributo `descuentoProducto` para representar un descuento individual en el producto.
   - Modifica el cálculo del precio total en el pedido para tener en cuenta este nuevo descuento.

7. **Interfaces:**
   - Crea una interfaz `Validable` con un método `validarDatos()` que valide si los datos de un producto (precio, nombre) son correctos. Implementa esta interfaz en la clase `Producto`.

8. **Lambdas:**
   - Utiliza una expresión lambda para ordenar la lista de productos por precio de menor a mayor.

9. **Sets y Maps:**
   - Crea un `Set` para almacenar los productos que han sido agregados a un pedido. Usa el `Set` para evitar duplicados de productos.
   - Crea un `Map` para asociar cada pedido con el cliente que lo realiza. La clave del `Map` será el `id` del pedido y el valor será el nombre del cliente.

10. **Regex:**
    - Usa una expresión regular para validar que el nombre de los productos contiene al menos una letra mayúscula y no tiene caracteres especiales.

11. **Módulos y POO:**
    - Separa la implementación en varios módulos: uno para productos, otro para pedidos, y otro para excepciones.
    - Utiliza principios de Programación Orientada a Objetos (POO) como encapsulación, herencia y polimorfismo en la implementación.

12. **Strings:**
    - En la clase `Producto`, implementa un método que devuelva una descripción detallada del producto con su nombre y precio, utilizando la clase `String.format()`.

13. **Tipos de datos y Operadores:**
    - Utiliza operadores aritméticos para calcular el precio con descuento y el total del pedido.
    - Usa `double` para los precios y `int` para las cantidades de productos.

#### Ejercicio avanzado: 

Además de los requisitos mencionados, realiza lo siguiente:

- Utiliza flujos (`Streams`) para obtener la lista de productos que tienen un precio mayor a 50 y crea una lista nueva con estos productos.
- Implementa un sistema de gestión de usuarios para que cada cliente pueda realizar múltiples pedidos. Cada usuario debe tener un nombre, un correo electrónico y un identificador único.

