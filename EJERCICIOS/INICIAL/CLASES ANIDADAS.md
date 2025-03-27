# Ejercicio : Gestión de Productos con Clases Anidadas Estáticas e Internas

Desarrolla una clase llamada `Almacen` que contenga:

1. Una clase anidada **estática** llamada `ContadorProductos` que lleve la cuenta total de productos en el sistema.
   - Debe tener una variable estática `total` y un método `incrementar()` para aumentarla.
   - Solo debe acceder a miembros estáticos de `Almacen`.

2. Una clase **interna no estática** llamada `Producto` con los siguientes campos:
   - `String nombre`, `double precio`, `int stock`.
   - Un método `mostrarDetalles()` que muestre la información del producto y acceda al contador global.

3. Un método en `Almacen` llamado `registrarProducto()` que cree una instancia de `Producto` y aumente el contador global.

- Desde el `main()`, crea un `Almacen`, registra 3 productos e imprime el total desde `ContadorProductos`.

# Ejercicio 2: Gestor de Eventos con Clases Locales y Anónimas


Crea una clase `AgendaEventos` con un método `gestionarEvento(String tipo)` que:

1. Defina una **clase interna local** llamada `EventoEspecial` dentro del método `gestionarEvento`.
   - Esta clase tendrá un atributo `String descripcion` y métodos `mostrar()` y `urgente()`.
   - El método `urgente()` devolverá `true` si la descripción contiene "urgente" (usa `contains()`).

2. Si el tipo es `"especial"`, se crea un `EventoEspecial` con la descripción `"Reunión urgente con dirección"` y se llama a sus métodos.

3. Si el tipo es `"normal"`, usa una **clase anónima** que implemente la interfaz `Runnable`, y dentro de su `run()` imprima `"Ejecutando evento normal..."`.

- El `main()` debe probar ambos casos: `"especial"` y `"normal"`.
