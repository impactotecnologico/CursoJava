# Estructura del Proyecto Aerolínea

Proyecto que busca presentar los vuelos disponibles de determinadas aerolíneas y asociarlos a los pasajeros

## Paquetes y Clases

El paquete raíz es es.indra.aerolinea

### .beans

Paquete para Interfaces de beans

  *Interfaces*
  
  * IAerolinea: interfaz que define el comportamiento de la gestión de vuelos

### .beans.impl

Paquete para las implementaciones de interfaces o POJOs

  *Clases*

  * Aerolinea: implementación de la interfaz IAerolínea. Da cuerpo a los métodos: ..... y las variables:
    + nombre: nombre de la aerolínea
    + id: identificador de la aerolínea
    + vuelos[ ]: array de todos los vuelos disponibles
  * Vuelo: POJO que representa el vuelo con origen, destino, etc..
    + origen: origen del vuelo
    + destino: destino del vuelo
    + numeroVuelo: string que identifica el vuelo
    + numeroPasajeros: entero para indicar la capacidad de pasajeros
    + disponible: boolean que indica si el vuelo está disponible
  * Persona: clase abstracta para representar a todas las personas del sistema. Contiene:
    + nombre
    + apellido
    + id
    + dni
  * Empleado: clase que hereda de **Persona** y no añade propiedas extra, solo sobreescribe el método `getNombre()`
  * Pasajero: clase que hereda de **Persona** y añade un array de vuelos:
    + vuelos[ ]: array de objetos **Vuelo**

### .main

  * Venta: clase que tiene método **main** que arranca la aplicación

### .services

  * ReadFile: clase que gestiona la lectura de archivos
