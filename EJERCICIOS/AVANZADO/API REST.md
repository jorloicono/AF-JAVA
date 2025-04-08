## 🛫 Aplicación de Gestión de Vuelos - Servicios Web

La aplicación debe proporcionar una API REST para gestionar vuelos. La base de datos contendrá los siguientes campos:

- **Origen** (string)
- **Destino** (string)
- **Precio** (float)
- **Número de escalas** (int)
- **Compañía** (string)

### 🧩 Operaciones disponibles

1. **Buscar vuelos**
   - Filtros: origen, destino, número de escalas
   - Endpoint sugerido: `GET /vuelos?origen=...&destino=...&escalas=...`

2. **Registrar un nuevo vuelo**
   - Datos requeridos: origen, destino, precio, escalas, compañía
   - Endpoint sugerido: `POST /vuelos`

3. **Dar de baja un vuelo**
   - Por ID u otro identificador único
   - Endpoint sugerido: `DELETE /vuelos/{id}`

4. **Dar de baja todos los vuelos a un destino determinado**
   - Endpoint sugerido: `DELETE /vuelos?destino=...`

5. **Modificar un vuelo**
   - Endpoint sugerido: `PUT /vuelos/{id}`
   - Datos actualizables: origen, destino, precio, escalas, compañía

---

## 🏨 Aplicación de Búsqueda de Hoteles - Servicios Web

La aplicación debe proporcionar una API REST para consultar y gestionar hoteles y sus habitaciones. La base de datos contendrá:

### 🏨 Datos de hoteles

- **Nombre** (string)
- **Descripción** (string)
- **Categoría** (int o string)
- **¿Piscina?** (boolean)
- **Localidad** (string)

### 🛏️ Datos de habitaciones

- **Tamaño** (string, ej: "pequeña", "mediana", "grande")
- **Capacidad** (1 o 2 personas)
- **Precio por noche** (float)
- **¿Incluye desayuno?** (boolean)
- **¿Ocupada?** (boolean)

### 🧩 Operaciones disponibles

1. **Buscar hoteles por localidad o categoría**
   - Endpoint sugerido: `GET /hoteles?localidad=...&categoria=...`

2. **Buscar habitaciones de un hotel por tamaño y rango de precio**
   - Solo se mostrarán las habitaciones libres
   - Endpoint sugerido: `GET /hoteles/{id}/habitaciones?tamaño=...&precioMin=...&precioMax=...`

3. **Registrar un nuevo hotel**
   - Endpoint sugerido: `POST /hoteles`
   - Datos: nombre, descripción, categoría, piscina, localidad

4. **Registrar una nueva habitación en un hotel**
   - Endpoint sugerido: `POST /hoteles/{id}/habitaciones`

5. **Eliminar una habitación determinada de un hotel**
   - Endpoint sugerido: `DELETE /hoteles/{idHotel}/habitaciones/{idHabitacion}`

6. **Modificar una habitación para indicar que está ocupada**
   - Endpoint sugerido: `PUT /hoteles/{idHotel}/habitaciones/{idHabitacion}`
   - Cambio de campo: `"ocupada": true`
