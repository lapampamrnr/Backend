# Backend

🛒 TECHLAB E-COMMERCE – Backend en Java
Proyecto Final – Curso Back-End Java | Autora: Marcela Adriana Serrano
📌 Descripción del Proyecto

Este proyecto es un sistema completo de gestión para un E-commerce, desarrollado como entrega final del curso de Back-End Java.
Implementa la lógica necesaria para administrar:

🛍️ Productos

📦 Pedidos

🧾 Carrito

🔄 Actualización automática de stock

🏷️ Categorías

👥 Usuarios (opcional / extensible)

El proyecto fue diseñado aplicando todos los contenidos del curso, las prácticas guiadas por los profesores, el material oficial y las clases en video del flipbook.

Está listo para integrarse con un Frontend en HTML/JS como exige la consigna final.

🎯 Objetivo General

Construir una API modular y escalable que permita gestionar un sistema comercial simple, usando programación orientada a objetos con:

✔ Clases y colaboración entre clases
✔ Encapsulamiento
✔ Excepciones personalizadas
✔ Menú interactivo (Main)
✔ Manejo de colecciones
✔ Validaciones profesionales
✔ Principios de arquitectura limpia

🧩 Estructura del Proyecto
src/
 └── com.techlab
      ├── productos/
      │     └── Producto.java
      ├── pedidos/
      │     ├── LineaPedido.java
      │     └── Pedido.java
      ├── excepciones/
      │     └── StockInsuficienteException.java
      ├── servicios/
      │     └── ProductoService.java
      └── Main.java

🧱 Clases Principales
🔹 Producto

ID autogenerado

Nombre

Descripción

Categoría

Imagen URL

Precio

Stock

Validaciones completas

Métodos para aumentar/disminuir stock

🔹 LineaPedido

Representa un ítem dentro del carrito/pedido.

🔹 Pedido

ID

Fecha

Estado (pendiente/confirmado/enviado/entregado/cancelado)

Lista de LineaPedido

Total calculado

Disminución automática de stock al confirmar

🔹 ProductoService

Agregar producto

Listar productos

Buscar por ID

Actualizar

Eliminar

Validaciones

🧮 Diagrama UML (Simplificado)
Producto
 ├── id:int
 ├── nombre:String
 ├── descripcion:String
 ├── categoria:String
 ├── imagenUrl:String
 ├── precio:double
 ├── stock:int
 └── métodos…

Pedido
 ├── id:int
 ├── fecha:LocalDate
 ├── estado:String
 ├── lineas:ArrayList<LineaPedido>
 └── métodos…

LineaPedido
 ├── producto:Producto
 ├── cantidad:int
 └── métodos…

📦 Funcionalidades Incluidas
✔ Gestión de Productos

Crear producto

Listar productos

Buscar por ID

Actualizar

Eliminar

Validación de precios, stock y nombre

Mostrar datos formateados

✔ Gestión de Pedidos

Crear pedido desde productos

Validar stock en tiempo real

Calcular total automático

Confirmación del pedido

Disminución de stock

Mostrar detalle del pedido

✔ Menú Interactivo

Compatible con los requerimientos de la clase final:

=================================== SISTEMA DE GESTIÓN - TECHLAB ==================================
1) Gestionar Productos
2) Gestionar Categorías
3) Ver Carrito de Compras
4) Realizar Pedido
5) Consultar Historial de Pedidos
6) Administración (usuarios y stock)
7) Salir

💻 Cómo Ejecutarlo

Clonar el repositorio

Abrir en IntelliJ / Eclipse / NetBeans

Ejecutar el archivo Main.java

Requisitos:

Java 17+

Maven o IntelliJ con SDK configurado

📚 Tecnologías Utilizadas

Java 17

Programación Orientada a Objetos

Colecciones (ArrayList)

Validaciones

Excepciones

AtomicInteger para IDs

Arquitectura modular por paquetes

📝 Estado del Proyecto

✔ FINALIZADO
Listo para entrega al profesor, revisión y publicación.

Todo el código implementa:

Buenas prácticas

Estándares de programación

Recomendaciones del curso

Correcciones finales aplicadas

👩‍💻 Autora

Marcela Adriana Serrano
Proyecto final – Back-End Java |
