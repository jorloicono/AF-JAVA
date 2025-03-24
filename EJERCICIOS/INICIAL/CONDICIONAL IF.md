## Ejercicio 3: Notas

Crear un programa que indique al usuario la nota media global de su curso. Requisitos:

1. El programa pedirá al usuario que introduzca 5 notas, para las asignaturas: Matemáticas, Física, Química, Lenguaje e Historia.
2. El programa realizará la media de esas cinco notas.
3. El programa indicará al usuario el rango al que equivale la nota final que ha sacado:
   a. Entre 0 y 3: Muy deficiente  
   b. Entre 3 y 5: Insuficiente  
   c. Entre 5 y 6: Suficiente  
   d. Entre 6 y 7: Bien  
   e. Entre 7 y 9: Notable  
   f. Entre 9 y 10: Sobresaliente

## Ejercicio Switch + If/Else: Gestión de pedidos en tienda online

Una tienda online vende tres tipos de productos:

- **1. Electrónica**
- **2. Ropa**
- **3. Alimentación**

Cada categoría tiene una lógica distinta para calcular el *descuento* y verificar si el pedido puede realizarse según el **día de la semana** y la **cantidad del pedido**.


## 🎯 Objetivo

Implementa un programa en Java que:

1. **Solicite al usuario**:
   - El tipo de producto (número del 1 al 3).
   - El día de la semana (como texto, por ejemplo: `"lunes"`, `"martes"`, etc.).
   - La cantidad de unidades que desea comprar.

2. **Use un `switch`** para identificar la categoría del producto.

3. Dentro de cada `case`, utiliza estructuras `if/else` para gestionar las siguientes reglas:


### 📦 Electrónica (1)
- Solo se puede comprar de **lunes a viernes**.
- Si la cantidad es **mayor a 3**, se aplica un **10% de descuento**.
- Si no, **sin descuento**.

### 👗 Ropa (2)
- Se puede comprar **todos los días**.
- Si es **sábado o domingo**, se aplica un **15% de descuento** sin importar la cantidad.
- Si se compran **más de 5 unidades** entre semana, aplica un **20% de descuento**.
- En otros casos, sin descuento.

### 🍎 Alimentación (3)
- **No se puede comprar los domingos**.
- Si se compran **más de 10 unidades**, aplica un **5% de descuento**.
- Si además es **lunes**, se aplica un **2% adicional**.

## 💰 Precios por unidad (para el cálculo del precio final)
- Electrónica: **100€**
- Ropa: **50€**
- Alimentación: **10€**


## 📤 El programa debe mostrar:
- Si el pedido es **válido o no**.
- Qué **descuento** se aplicó (si lo hay).
- El **precio total estimado** tras aplicar el descuento.

## 🛠 Requisitos técnicos
- Uso obligatorio de `switch-case`.
- Uso de condiciones `if/else` dentro de cada `case`.
- Control de errores básicos (por ejemplo, categoría fuera de rango o días mal escritos).



   
