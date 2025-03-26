# Ejercicio: Validador de Formularios Avanzado

Crea una clase `ValidadorFormulario` que verifique los siguientes campos introducidos por el usuario:

- Nombre completo: debe contener solo letras y espacios, con una longitud entre 5 y 50 caracteres.
- DNI: exactamente 8 dígitos seguidos de una letra mayúscula (excepto I, O, U).
- Correo electrónico: debe cumplir el formato estándar de email (usa una expresión regular precisa).
- Fecha de nacimiento: formato `dd/mm/aaaa`, incluyendo validación de rangos válidos de día y mes.
- Contraseña: debe tener al menos 8 caracteres, incluir mayúsculas, minúsculas, un dígito y un carácter especial.

## Requisitos técnicos
- Usa `Pattern.compile()` para cada validación.
- Usa `matcher.matches()` para comprobar que el campo es válido.
- Imprime un mensaje de "válido" o "no válido" para cada campo.

# Ejercicio: Analizador de Texto y Extractor de Patrones

Crea un programa que analice un texto largo y realice las siguientes tareas:

### Entrada
Un párrafo como el siguiente:

```java
String texto = """
Puedes escribir a info@empresa.com o contactar con juan.gomez@otro.org. También puedes visitar http://www.empresa.com o https://otro.org/contacto. 
Recuerda que la próxima reunión será el 15/04/2024. La anterior fue el 1/1/2023. El NIF del cliente es 45612378X. Su teléfono es +34-612-345-678.
""";

- Extraer y mostrar todos los correos electrónicos.
- Extraer y mostrar todas las URLs.
- Extraer todas las fechas válidas en formato dd/mm/aaaa.
- Buscar si el texto contiene al menos un NIF válido.
- Contar cuántos números de teléfono válidos hay en formato internacional (+34-XXX-XXX-XXX).
