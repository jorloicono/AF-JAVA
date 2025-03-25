## Ejercicio 24: Cálculos numéricos

Se requiere definir una clase denominada `CalculosNumericos` que realice las siguientes operaciones:

1. Calcular el logaritmo neperiano recibiendo un valor `double` como parámetro. Este método debe ser estático. Si el valor no es positivo, se genera una excepción aritmética.
2. Calcular la raíz cuadrada recibiendo un valor `double` como parámetro. Este método debe ser estático. Si el valor no es positivo, se genera una excepción aritmética.
3. Se debe crear un método `main` que utilice dichos métodos ingresando un valor por teclado.
4. Se deben capturar las excepciones.

## Ejercicio 25: Sistema de Manejo de Cuentas Bancarias

Crea un programa que simule un sistema de cuentas bancarias. Cada cuenta bancaria tiene un saldo inicial y permite realizar operaciones como depósitos y retiros. Sin embargo, debes manejar adecuadamente las excepciones que puedan surgir durante estas operaciones.

Crea una clase `CuentaBancaria` con los siguientes atributos:
- `saldo` (double) para almacenar el saldo de la cuenta.

Implementa un método en la clase `CuentaBancaria` llamado `realizarDeposito` que acepte un parámetro `monto` (double) y aumente el saldo de la cuenta en esa cantidad. Si el monto es negativo, lanza una excepción `IllegalArgumentException` con el mensaje "No se permiten depósitos negativos".

Implementa otro método llamado `realizarRetiro` que acepte un parámetro `monto` (double) y disminuya el saldo de la cuenta en esa cantidad. Si el monto es negativo o mayor que el saldo actual, lanza una excepción `IllegalArgumentException` con el mensaje correspondiente.

En el programa principal, crea una instancia de `CuentaBancaria`, solicita al usuario que realice un depósito y un retiro, y muestra el saldo resultante después de cada operación. Maneja las excepciones de manera adecuada para garantizar que el programa no se bloquee debido a entradas incorrectas del usuario.
