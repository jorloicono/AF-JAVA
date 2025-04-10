# Gestión de Biblioteca Universitaria

Diseña y desarrolla una aplicación Java utilizando Hibernate para gestionar una biblioteca universitaria. El sistema debe permitir registrar y gestionar información relacionada con:

- **Libros**: Cada libro tiene un título, ISBN, y año de publicación.  
- **Autores**: Un autor puede haber escrito varios libros (*OneToMany*), y cada libro tiene un solo autor (*ManyToOne*).  
- **Estudiantes**: Pueden tomar prestados varios libros al mismo tiempo (*ManyToMany*), y un libro puede estar prestado a varios estudiantes a lo largo del tiempo (historial).  
- **Préstamos**: Relación entre estudiantes y libros, con fecha de inicio y fecha de devolución.

## Requisitos

- Implementar las clases de entidad con las anotaciones de Hibernate.
- Configurar correctamente `hibernate.cfg.xml`.
- Crear operaciones CRUD para cada entidad.
- Incluir una clase principal (`App.java`) que simule:
  - Alta de autores, libros y estudiantes.
  - Préstamo de libros a estudiantes.
  - Consulta de libros prestados por un estudiante específico.
  - Historial de préstamos de un libro específico.

> Bonus: Implementa lógica para evitar prestar el mismo libro dos veces al mismo tiempo sin devolución.

