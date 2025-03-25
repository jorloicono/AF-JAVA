## Ejercicio 26: Ejercicio de ArrayList

Crea un programa en Java que gestione una lista de nombres mediante un `ArrayList`. El programa debe ofrecer las siguientes opciones:

1. Agregar un nombre a la lista.
2. Eliminar un nombre de la lista.
3. Imprimir la lista de nombres.
4. Buscar un nombre en la lista.
5. Salir del programa.

Implementa un menú que permita al usuario seleccionar una de las opciones mencionadas. Asegúrate de manejar adecuadamente la entrada del usuario y de proporcionar mensajes claros en cada operación. El programa debe continuar ejecutándose hasta que el usuario elija salir.

## Ejercicio 27: Ordenar Lista de Objetos

Crea una clase `Persona` con campos como nombre, edad, etc. Crea un programa que tenga una lista de objetos de tipo `Persona` y ordene la lista según algún criterio (por ejemplo, por edad).

## Ejercicio 28: Gestión de Personas

1. Crea una clase llamada `Persona` con los siguientes atributos privados:
   - nombre (String)
   - apellido (String)
   - género (String)
   - edad (int)

2. La clase debe tener un constructor que acepte todos los atributos y un constructor predeterminado sin parámetros.
3. Proporciona métodos de acceso (getters y setters) para cada atributo.
4. En la clase `Main`, solicita al usuario ingresar los datos de varias personas (por ejemplo, 5 personas).
5. Crea una lista de objetos `Persona` y almacena en ella las personas ingresadas.
6. Implementa los siguientes métodos estáticos en la clase `Main` para realizar operaciones sobre la lista de personas:
   - **retornarNombreGenero**: Imprime el nombre, apellido y género de cada persona.
   - **retornarPromedioEdades**: Calcula y muestra el promedio de las edades de todas las personas.
   - **retornarPersonasMasculinas**: Muestra la cantidad de personas de género masculino.
   - **retornarPersonasFemeninas**: Muestra la cantidad de personas de género femenino.
