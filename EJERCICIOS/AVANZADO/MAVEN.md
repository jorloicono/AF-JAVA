# Proyecto Maven Complejo con Múltiples Módulos y Spring Boot

Este es un ejercicio para crear un proyecto Maven en Eclipse con múltiples módulos y Spring Boot, incluyendo la integración con una base de datos usando Spring Data JPA.

## Paso 1: Crear el Proyecto Principal

1. **Crear un nuevo proyecto Maven**:
    - Abre Eclipse y ve a **File** -> **New** -> **Maven Project**.
    - Selecciona el arquetipo `maven-archetype-aggregator` para crear un proyecto multimódulo.
    - Introduce un `Group Id` (por ejemplo, `com.ejemplo`) y un `Artifact Id` (por ejemplo, `mi-proyecto`).
    - Haz clic en **Finish**.

2. **Estructura del Proyecto**:
    El proyecto tendrá la siguiente estructura:
    ```
    mi-proyecto
    ├── pom.xml
    ├── modulo-web
    │   └── pom.xml
    └── modulo-servicio
        └── pom.xml
    ```

## Paso 2: Configurar el `pom.xml` del Proyecto Principal

En el archivo `pom.xml` del proyecto principal (`mi-proyecto/pom.xml`), configura los módulos que se incluirán en este proyecto multimódulo.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.ejemplo</groupId>
    <artifactId>mi-proyecto</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>pom</packaging>
    
    <modules>
        <module>modulo-web</module>
        <module>modulo-servicio</module>
    </modules>
    
    <dependencyManagement>
        <dependencies>
            <!-- Dependencias comunes entre los módulos -->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
                <version>2.6.4</version>
            </dependency>
        </dependencies>
    </dependencyManagement>
</project>
```

## Paso 3: Configurar el `pom.xml` de los Módulos

### `modulo-web/pom.xml`

Este módulo contendrá la configuración para un servidor web con Spring Boot.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>com.ejemplo</groupId>
        <artifactId>mi-proyecto</artifactId>
        <version>1.0-SNAPSHOT</version>
        <relativePath>../pom.xml</relativePath>
    </parent>
    
    <artifactId>modulo-web</artifactId>
    
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
    
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

### `modulo-servicio/pom.xml`

Este módulo contendrá la lógica del servicio, con soporte para acceso a bases de datos usando Spring Data JPA.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>com.ejemplo</groupId>
        <artifactId>mi-proyecto</artifactId>
        <version>1.0-SNAPSHOT</version>
        <relativePath>../pom.xml</relativePath>
    </parent>
    
    <artifactId>modulo-servicio</artifactId>
    
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
    </dependencies>
</project>
```

## Paso 4: Escribir el Código

### Clase Principal del Módulo Web (`modulo-web`)

En `modulo-web/src/main/java/com/ejemplo/web/`, crea la clase principal de Spring Boot que inicializa el servidor web.

```java
package com.ejemplo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
```

### Clase de Servicio del Módulo Servicio (`modulo-servicio`)

En `modulo-servicio/src/main/java/com/ejemplo/servicio/`, crea una clase de servicio que se conecte a una base de datos en memoria.

```java
package com.ejemplo.servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    private Long id;
    private String nombre;

    // Getters y setters
}

interface UsuarioRepository extends JpaRepository<Usuario, Long> {}

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario crearUsuario(Long id, String nombre) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre(nombre);
        return repository.save(usuario);
    }
}
```

## Paso 5: Ejecutar el Proyecto

1. **Compilar y Ejecutar**:
    - Haz clic derecho en el proyecto principal (`mi-proyecto`) en Eclipse y selecciona **Run As** -> **Maven build...**.
    - En la ventana de ejecución, escribe `clean install` y haz clic en **Run**.
    - Luego, haz clic derecho en `modulo-web` y selecciona **Run As** -> **Spring Boot App**.

2. **Acceder al Servicio**:
    - El servidor Spring Boot se ejecutará en `http://localhost:8080`. Puedes realizar peticiones HTTP a tu aplicación o agregar controladores para manejar rutas específicas.

