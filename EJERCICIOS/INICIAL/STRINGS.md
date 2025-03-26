# Ejercicio: Analizador de Texto Literario Avanzado

Dado un párrafo de texto extraído de una obra literaria, realiza las siguientes acciones:

### Paso 1: Limpieza del texto
- Elimina los espacios al principio y al final del texto con `trim()`.
- Convierte todo el texto a minúsculas con `toLowerCase()`.

### Paso 2: Análisis de contenido
- Muestra cuántos caracteres tiene el texto usando `length()`.
- Muestra el índice de la primera aparición de la palabra `"mancha"` (usa `indexOf()`).
- Muestra el índice de la última aparición de la letra `'a'` (usa `lastIndexOf()`).
- Extrae la palabra `"quijote"` si existe (usando `indexOf()` + `substring()`).
- Comprueba si el texto contiene la palabra `"caballero"` sin importar mayúsculas (usa `toLowerCase()` + `indexOf()` o `contains()` si se enseña también).

### Paso 3: Transformación
- Reemplaza todas las letras `'e'` por `'3'` (usa `replace()`).
- Concatena al final del texto: `" — Cervantes."`
- Muestra el texto resultante en mayúsculas.

# Ejercicio : Comparador Inteligente de Frases del Usuario


Solicita al usuario que introduzca dos frases distintas. A partir de ahí, haz lo siguiente:

### Paso 1: Igualdad y análisis
- Compara si las frases son exactamente iguales con `equals()` y luego con `equalsIgnoreCase()`.
- Indica cuál de las dos es lexicográficamente mayor (`compareTo()` y `compareToIgnoreCase()`).
- Muestra el número total de caracteres de cada frase (`length()`).

### Paso 2: Extracción e indexación
- Muestra los 5 primeros caracteres de cada frase (`substring()`).
- Muestra los 5 últimos caracteres de cada frase (`substring()` con `length()`).
- Busca la posición de la palabra `"java"` en cada frase (`indexOf()`), comenzando en la mitad de la cadena (`indexOf("java", frase.length()/2)`).

### Paso 3: Fusión y transformación
- Crea una nueva frase concatenando ambas cadenas (`concat()`).
- Reemplaza todas las letras `'a'` por `'@'` en la nueva frase (`replace()`).
- Elimina espacios iniciales y finales y convierte el resultado a minúsculas (`trim()` y `toLowerCase()`).

# Ejercicio 3: Editor de Texto con StringBuilder y StringBuffer

### Paso 1: Inicialización
- Crea un `StringBuilder` con el texto:  
  `"La inteligencia artificial está transformando el mundo."`

- Crea un `StringBuffer` con el mismo texto para pruebas posteriores.

### Paso 2: Operaciones de edición con StringBuilder
1. Añade al final la frase: `" Y apenas estamos empezando."`
2. Inserta la palabra `"moderna "` justo antes de `"inteligencia"`.
3. Reemplaza la palabra `"transformando"` por `"revolucionando"` (utiliza `indexOf()` + `replace()`).
4. Elimina la palabra `"el"` y el espacio posterior.
5. Invierte todo el contenido del `StringBuilder` con `.reverse()` y muestra el resultado.

### Paso 3: Rendimiento (opcional, más avanzado)
- Escribe un bucle que concatene 1000 veces la palabra `"dato "` usando:
  - Un `String` (+=),
  - Un `StringBuilder`,
  - Un `StringBuffer`.
- Mide el tiempo de ejecución de cada uno con `System.nanoTime()` o `System.currentTimeMillis()` y compáralos.

### Paso 4: Conversión y comparación
- Convierte el resultado final del `StringBuilder` a `String` con `.toString()`.
- Compara si el contenido del `StringBuilder` y del `StringBuffer` (tras realizar en este las mismas ediciones) son iguales.
