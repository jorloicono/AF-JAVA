# 💻 Ejercicio: Conexión a Azure SQL Database con JDBC en Java

## 🎯 Objetivo

Desarrollar una aplicación Java que se conecte a una base de datos en **Azure SQL Database** usando **JDBC**. La aplicación deberá realizar operaciones de creación de tablas, inserción de datos, consultas, procedimientos almacenados y manejo de transacciones (`commit` y `rollback`).

## 🔧 Requisitos

1. ### Conexión a Azure SQL Database
   - Crea una base de datos en Azure SQL Database.
   - Configura el firewall para permitir conexiones desde tu IP.
   - Obtén la cadena de conexión JDBC necesaria:

     ```
     jdbc:sqlserver://<tu_servidor>.database.windows.net:1433;database=<tu_base>;user=<usuario>@<tu_servidor>;password=<tu_contraseña>;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;
     ```

2. ### Crear la tabla `Productos`
   Ejecuta desde Java la siguiente sentencia SQL para crear la tabla:

   ```sql
   CREATE TABLE Productos (
       id INT PRIMARY KEY IDENTITY(1,1),
       nombre NVARCHAR(100),
       precio DECIMAL(10, 2),
       stock INT
   );
   ```

3. ### Insertar datos con `PreparedStatement`
   Inserta al menos **3 productos** utilizando `PreparedStatement`.

4. ### Consulta con `PreparedStatement`
   Realiza una consulta que devuelva los productos cuyo **precio sea mayor** a un valor proporcionado como parámetro.

5. ### Procedimiento almacenado con `CallableStatement`
   Crea un procedimiento almacenado en la base de datos llamado `ActualizarStock`:

   ```sql
   CREATE PROCEDURE ActualizarStock
       @id INT,
       @cantidad INT
   AS
   BEGIN
       UPDATE Productos
       SET stock = stock + @cantidad
       WHERE id = @id;
   END;
   ```

   Luego, invócalo desde Java usando `CallableStatement`.

6. ### Transacciones: Commit y Rollback
   - Implementa una transacción que:
     - Inserte un nuevo producto.
     - Actualice el stock de otro producto.
   - Si alguna operación falla, realiza `rollback`.
   - Si todo funciona correctamente, ejecuta `commit`.


## ✅ Criterios de Evaluación

- Conexión correcta con Azure SQL Database.
- Uso correcto de `PreparedStatement` y `CallableStatement`.
- Implementación de `commit` y `rollback`.
- Código limpio, bien estructurado y con manejo de errores adecuado.
