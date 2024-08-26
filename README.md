# Microservicio de Restaurante - Ejercicio Práctico

### Descripción

Este proyecto es un ejercicio práctico en el que puse en práctica mis conocimientos sobre microservicios. El objetivo fue desarrollar dos microservicios para un sistema de gestión de restaurantes/bars:

- **Servicio de Platos:** Gestiona datos como el número de plato, nombre, precio y una breve descripción.
- **Servicio de Ingredientes:** Gestiona información como el ID del ingrediente, nombre del ingrediente y los platos en los que se utiliza.

### Funcionalidades

A continuación, se detallan los endpoints de ambos servicios:

#### 1. **Crear Ingrediente (POST)**
**Endpoint:** `localhost:9003/ingredientes/crear`  
**Descripción:** Permite crear un nuevo ingrediente.  
**Cuerpo del request:**
```json
{
  "nombre_ingrediente": "tomate",
  "platos": [
    "Milanesa a la napolitana",
    "Pizza napolitana"
  ]
}
```

#### 2. **Obtener Ingredientes de un Plato (GET)**
**Endpoint:** `localhost:9003/ingredientes/traer/{nombrePlato}`  
**Descripción:** Retorna la lista de ingredientes utilizados en un plato específico.  
**Ejemplo de respuesta:**
```json
[
  {
    "id_ingrediente": 1,
    "nombre_ingrediente": "tomate",
    "platos": [
      "Milanesa a la napolitana",
      "Pizza napolitana"
    ]
  },
  {
    "id_ingrediente": 2,
    "nombre_ingrediente": "carne",
    "platos": [
      "Milanesa a la napolitana"
    ]
  }
]
```

#### 3. **Crear Plato (POST)**
**Endpoint:** `localhost:9004/platos/crear`  
**Descripción:** Permite crear un nuevo plato.  
**Cuerpo del request:**
```json
{
  "nombrePlato": "Milanesa a la napolitana",
  "precio": 1200.0,
  "descripcion": "Plato típico de la cultura argentina"
}
```

#### 4. **Obtener Todos los Platos (GET)**
**Endpoint:** `localhost:9004/platos/traer`  
**Descripción:** Retorna la lista de todos los platos disponibles junto con sus ingredientes.  
**Ejemplo de respuesta:**
```json
{
  "idPlato": 1,
  "nombrePlato": "Milanesa a la napolitana",
  "precio": 1200.0,
  "descripcion": "Plato típico de la cultura argentina",
  "listaIngredientes": [
    "tomate",
    "carne"
  ]
}
```
