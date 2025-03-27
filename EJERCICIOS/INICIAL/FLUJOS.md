## Ejercicio – Lectura de un archivo de texto con `BufferedReader`

1. Comprobar si el archivo `"entrada.txt"` existe en el sistema de archivos.
2. Si no existe, imprimir por consola: `"No se encontró entrada.txt"`.
3. Si existe, abrirlo con `BufferedReader` apoyado en un `FileReader`.
4. Leer el contenido del archivo línea a línea usando el método `readLine()`.
5. Imprimir cada línea por consola.
6. Manejar adecuadamente excepciones de tipo `IOException`.


## Ejercicio – Escritura en un archivo de texto con `BufferedWriter`

1. Crear un archivo llamado `"salida.txt"` en el que se escribirán varias líneas de texto.
2. Usar `BufferedWriter` apoyado en `FileWriter` y `File`.
3. Escribir las siguientes líneas en el archivo, cada una en una línea diferente:
   - "Este es un ejemplo de escritura"
   - "Usando BufferedWriter"
   - "En un fichero de texto"
4. Asegurarse de cerrar correctamente el flujo con `close()`.
5. Controlar posibles errores con un bloque `try-catch` para capturar `IOException`.
