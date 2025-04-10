#  Gestión de una Base de Datos de Personas con MongoDB y Java

## 📋 Enunciado

El objetivo de este ejercicio es desarrollar una aplicación Java que se conecte a una base de datos MongoDB y permita realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar), así como una operación de agregación, sobre una colección de personas.

La aplicación deberá:

1. **Conectarse a MongoDB** usando host, puerto y nombre de la base de datos.
2. **Insertar personas** con los siguientes campos:
   - `name`: nombre de la persona.
   - `email`: correo electrónico (único).
   - `twitter`: cuenta de Twitter.
   - `hobbies`: lista de hobbies.
   - `location`: subdocumento con `city` y `zip`.
3. **Buscar personas**:
   - Por email (y mostrar el nombre).
   - Por ciudad, mostrando nombre y código postal (zip).
4. **Actualizar una persona**:
   - Cambiar el nombre de una persona dado su email.
5. **Eliminar una persona**:
   - Eliminar a alguien dado su email.
6. **Insertar múltiples documentos**:
   - Insertar varios documentos de prueba en una colección genérica con un contador.
7. **Listar personas ordenadas y proyectadas**:
   - Buscar personas que vivan en una ciudad dada, mostrar solo nombre y zip, ordenadas por nombre ascendente, limitando a 5 resultados.
8. **Usar agregación**:
   - Contar cuántas personas hay por cada ciudad.
