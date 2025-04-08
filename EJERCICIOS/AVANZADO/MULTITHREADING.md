### Ejercicio 1: Sistema de Restauración con Múltiples Clientes

Imagina un sistema de cafetería donde varios clientes llegan a la vez y deben esperar para ser atendidos. Utiliza el semáforo para controlar el número máximo de clientes que pueden ser atendidos simultáneamente, y emplea hilos para representar a cada cliente. Cuando un cliente termine su servicio, liberará un permiso del semáforo para que otro cliente pueda ser atendido.

#### Requerimientos:
1. **Número de clientes (hilos)**: Crea varios hilos para representar a los clientes.
2. **Semáforo**: Utiliza un semáforo para controlar el acceso al número máximo de asientos en la cafetería (por ejemplo, 10 asientos).
3. **Sincronización**: Cada cliente debe esperar si todos los asientos están ocupados y entrar cuando haya espacio.
4. **Tiempo de servicio**: Cada cliente es atendido por 3 segundos (simulado con `Thread.sleep()`).
5. **Salir**: Después de ser atendido, el cliente debe liberar el semáforo para permitir que otro entre.

#### Instrucciones:
1. Crea un `Semaphore` con 10 permisos (uno por cada asiento disponible).
2. Implementa una clase `Cliente` que extienda `Thread` y represente a un cliente en la cafetería.
3. En el método `run` de la clase `Cliente`, adquiere un permiso del semáforo antes de ser atendido.
4. Al finalizar la atención, libera el semáforo.
5. Crea múltiples instancias de `Cliente` y lánzalas como hilos.

### Ejercicio 2: Procesamiento de Archivos en Paralelo

Simula un proceso donde varios hilos procesan archivos CSV grandes, cada uno analizando una parte del archivo. Utiliza una clase `Runnable` para manejar el procesamiento paralelo de los archivos, sincroniza el acceso a un recurso compartido y usa variables atómicas para contar el número de archivos procesados correctamente.

#### Requerimientos:
1. **Creación de Hilos**: Crea varios hilos, cada uno procesando una sección diferente de un archivo.
2. **Sincronización**: Asegúrate de que el acceso a una variable compartida (como un contador) sea seguro mediante sincronización.
3. **Atomic Variables**: Usa `AtomicInteger` para contar los archivos procesados correctamente.
4. **Intercambio de Datos entre Hilos**: Usa `Exchanger` para que los hilos se comuniquen entre sí una vez que hayan terminado de procesar una parte del archivo.
5. **Tiempos de Ejecución**: Cada hilo debe procesar una parte del archivo en un tiempo simulado de 2 segundos.

#### Instrucciones:
1. Implementa un `Runnable` llamado `ProcesadorArchivo`, que simula el análisis de una sección del archivo CSV.
2. Usa `AtomicInteger` para contar el número de archivos procesados correctamente.
3. Utiliza `Exchanger` para intercambiar información entre hilos (por ejemplo, para reportar si un archivo fue procesado correctamente o no).
4. Los hilos deben esperar a que todos terminen antes de mostrar el resultado final del procesamiento.
