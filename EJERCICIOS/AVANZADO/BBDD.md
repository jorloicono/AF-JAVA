# Ejercicios de Java con base de datos

Utilizar para todos los ejercicios que vienen a continuación el script `demodb.SQL` 

## Ejercicio 1: Visualizar número y nombre de todos los departamentos.
Realiza una clase Java que se conecte a la base de datos y recupere el número y nombre de todos los departamentos.

## Ejercicio 2: Modificar el nombre de un departamento.
Realiza una clase Java que modifique el nombre de un departamento dado su número y nombre. No utilices sentencias preparadas. La clase debe visualizar el número de filas afectadas.

## Ejercicio 3: Realizar el ejercicio anterior con sentencias preparadas.
Realiza una clase Java que modifique el nombre de un departamento utilizando sentencias preparadas. La clase debe visualizar el número de filas afectadas.

## Ejercicio 4: Realizar el ejercicio anterior utilizando transacciones.
Realiza una clase Java que modifique el nombre de un departamento utilizando transacciones. Asegúrate de desactivar el autocommit y utilizar `commit()` y `rollback()` en caso de error.

## Ejercicio 5: Acceso a la base de datos con múltiples métodos.
Crea una clase Java que contenga métodos para conectar a la base de datos, insertar un departamento, listar todos los departamentos, actualizar un departamento, y borrar un departamento. Utiliza sentencias preparadas y controla los errores de conexión y ejecución.

## demodb.sql

-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS demodb;

-- Usar la base de datos
USE demodb;

-- Crear la tabla de departamentos
CREATE TABLE IF NOT EXISTS dept (
    deptno INT PRIMARY KEY,
    dname VARCHAR(50),
    loc VARCHAR(50)
);

-- Insertar algunos registros en la tabla de departamentos
INSERT INTO dept (deptno, dname, loc) VALUES (10, 'Contabilidad', 'Madrid');
INSERT INTO dept (deptno, dname, loc) VALUES (20, 'Ventas', 'Barcelona');
INSERT INTO dept (deptno, dname, loc) VALUES (30, 'Recursos Humanos', 'Valencia');
INSERT INTO dept (deptno, dname, loc) VALUES (40, 'IT', 'Sevilla');

-- Consultar todos los departamentos
SELECT * FROM dept;
