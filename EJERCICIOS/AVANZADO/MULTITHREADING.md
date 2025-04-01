# Ejercicio 1: Creación y ejecución de hilos con `Runnable`
 
Crea una clase que implemente la interfaz `Runnable`. En el método `run()`, muestra un mensaje con el nombre del hilo actual y repítelo 5 veces usando un bucle `for`, haciendo que el hilo duerma 500 ms entre cada iteración.

Desde el `main`, crea y arranca al menos **dos hilos distintos** con nombres personalizados.  
Observa el comportamiento concurrente de los mensajes en la consola.

# Ejercicio 2: Ciclo de vida de un hilo**

Implementa un programa donde:

1. Crees un hilo utilizando la clase `Thread`, sobrescribiendo el método `run()`.
2. Dentro de `run()`, imprime un mensaje, duerme el hilo 2 segundos y vuelve a imprimir otro mensaje indicando que finalizó.
3. En el `main`, crea el hilo, imprime su estado antes y después de llamar a `start()`, y después de que termine usando `getState()`.

Tu objetivo es **visualizar los cambios de estado del hilo**: `NEW`, `RUNNABLE`, `TERMINATED`.

# Ejercicio 3: Sincronización de métodos
  
Crea una clase `Contador` con un atributo entero `valor` inicializado a 0 y un método sincronizado `incrementar()` que aumente el valor en 1 y lo imprima por consola.

Luego, crea una clase `HiloContador` que implemente `Runnable` y reciba una instancia de `Contador`.  
Dentro del `run()`, ejecuta `incrementar()` 5 veces con una pausa de 100 ms.

Desde el `main`, crea dos hilos que trabajen con el mismo objeto `Contador`.  
**Sin la sincronización, deberían observarse errores de concurrencia.** Con `synchronized`, no deberían repetirse ni saltarse números.
