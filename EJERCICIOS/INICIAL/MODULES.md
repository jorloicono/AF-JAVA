
### **Ejercicio: Crear un Módulo Java Básico**

1. Crea el siguiente árbol de carpetas:
   ```
   ejercicio1/
   └── src/
       └── saludador/
           ├── module-info.java
           └── com/
               └── ejemplo/
                   └── Saludador.java
   ```

2. Implementa `Saludador.java` con una clase que contenga un método `saludar(String nombre)` que imprima un saludo personalizado.

3. En `module-info.java`, declara el módulo `saludador` y expón el paquete `com.ejemplo`.

4. En el mismo nivel que `saludador`, crea otro módulo llamado `mainapp`:
   ```
   ejercicio1/
   └── src/
       ├── saludador/
       └── mainapp/
           ├── module-info.java
           └── app/
               └── Principal.java
   ```

5. En `mainapp`, crea una clase `Principal` que importe y use `Saludador` desde el módulo `saludador`.

6. Compila y ejecuta el programa usando el sistema modular (`--module-path`, `--module`, etc.).


### **Ejercicio: Uso de ServiceLoader con Módulos**

1. Crea tres módulos:

   - `ordenamiento` (define la interfaz `Ordenable`)
   - `bubblesortimpl` (implementa la interfaz con ordenamiento burbuja)
   - `aplicacion` (usa el servicio)

2. Estructura sugerida:
   ```
   ejercicio2/
   └── src/
       ├── ordenamiento/
       │   ├── module-info.java
       │   └── orden/
       │       └── Ordenable.java
       ├── bubblesortimpl/
       │   ├── module-info.java
       │   └── orden/
       │       └── BubbleSort.java
       └── aplicacion/
           ├── module-info.java
           └── app/
               └── Main.java
   ```

3. `Ordenable` debe ser una interfaz con el método `void ordenar(int[] valores)`.

4. `BubbleSort` debe implementar `Ordenable`.

5. En `bubblesortimpl/module-info.java`, declara `provides orden.Ordenable with orden.BubbleSort;`

6. En `aplicacion/module-info.java`, declara `uses orden.Ordenable;` y usa `ServiceLoader` para cargar la implementación.

7. Compila y ejecuta la aplicación completa, pasando los directorios de módulos con `--module-path`.
