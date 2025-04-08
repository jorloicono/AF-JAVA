# 🧪 Ejercicio práctico: Desarrollo de una Aplicación Web con Spring Boot – "BookStore"

## 📘 Contexto

Estás desarrollando una aplicación web para una librería online llamada **BookStore**, que debe permitir a los usuarios visualizar el catálogo de libros disponibles. Este ejercicio tiene como objetivo ayudarte a poner en práctica todo lo aprendido sobre el desarrollo de aplicaciones web con Spring Boot, desde la configuración del entorno hasta la realización de pruebas unitarias.

## 🎯 Objetivos

- Crear un proyecto Spring Boot usando Spring Initializr.
- Configurar la conexión a una base de datos MySQL.
- Diseñar el modelo de datos utilizando JPA y Lombok.
- Implementar un repositorio con Spring Data.
- Aplicar la lógica de negocio a través de una capa de servicios.
- Crear vistas con Thymeleaf para renderizar contenido dinámico.
- Implementar pruebas unitarias con JUnit para verificar el correcto funcionamiento del servicio.

---

## 🧱 Instrucciones

1. Crea un nuevo proyecto Spring Boot incluyendo las dependencias necesarias:
   - Spring Web
   - Spring Data JPA
   - MySQL Driver
   - Thymeleaf
   - Lombok
   - Spring Boot DevTools (opcional)
   - Spring Boot Test

2. Configura el acceso a una base de datos MySQL local, creando la base de datos `bookstoredb` y un usuario específico.

3. Diseña una entidad `Book` con los siguientes atributos:
   - id (clave primaria, auto-generada)
   - title
   - author
   - genre
   - price

4. Crea el repositorio `BookRepository` extendiendo `CrudRepository` y añadiendo métodos para:
   - Obtener todos los libros
   - Buscar libros por género

5. Implementa una capa de servicios (`BookService`) que contenga la lógica de negocio.

6. Crea un controlador web que gestione las siguientes rutas:
   - `/` para la página de inicio.
   - `/catalog` para mostrar el listado de libros.

7. Diseña las plantillas HTML `index.html` y `catalog.html` en la carpeta `templates`.

8. Implementa pruebas unitarias con JUnit para el servicio `BookService`.


