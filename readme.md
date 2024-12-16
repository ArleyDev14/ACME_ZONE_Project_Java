# 🚀 Sistema de Control de Acceso para el Complejo Empresarial Zona Acme

## 📚 Tabla de Contenidos
1. [Descripción](#descripción)
2. [Funcionalidades Principales](#funcionalidades-principales)
3. [Tecnologías Utilizadas](#tecnologías-utilizadas)
4. [Requisitos del Sistema](#requisitos-del-sistema)
5. [Instalación](#instalación)
6. [Uso del Sistema](#uso-del-sistema)
7. [Diseño y Principios Implementados](#diseño-y-principios-implementados)
8. [Capturas de Pantalla](#capturas-de-pantalla)
9. [Tareas Futuras](#tareas-futuras)
10. [Contribución](#contribución)
11. [Licencia](#licencia)

## 📝 Descripción
Este sistema tiene como objetivo gestionar el acceso al Complejo Empresarial Zona Acme, asegurando la trazabilidad de los movimientos de trabajadores e invitados, y proporcionando herramientas amigables para guardas de seguridad, supervisores y funcionarios de empresas.

## 🌟 Funcionalidades Principales
1. *Gestión de Usuarios*  
   - Superusuarios, supervisores, guardas y funcionarios.
   - Inactivación de usuarios para mantener consistencia en el sistema.

2. *Registro de Accesos*  
   - Registro de entradas y salidas mediante documento de identidad.  
   - Control de acceso basado en anotaciones (prohibición de ingreso visible).  

3. *Gestión de Vehículos*  
   - Registro de placas de vehículos.  
   - Registro individual de pasajeros.  

4. *Manejo de Incidentes*  
   - Registro de anotaciones por supervisores.  
   - Restricciones de acceso con trazabilidad.  

5. *Reportes y Trazabilidad*  
   - Reportes sobre usuarios activos/inactivos y accesos en rangos de fechas.  

6. *Interfaz Gráfica*  
   - Pantallas amigables e intuitivas para cada tipo de usuario.  

## 🛠️ Tecnologías Utilizadas
- *Lenguaje de Programación*: Java (JDK 17+)
- *Interfaz Gráfica*: Swing
- *Base de Datos*: MySQL
- *Conexión a BD*: JDBC
- *Patrones de Diseño*: Singleton, DAO, Observer, Factory, MVC
- *Herramientas de Concurrencia*: Uso de hilos para operaciones en tiempo real

## 💻 Requisitos del Sistema
- *Software necesario*:
  - Java JDK 17+
  - MySQL Server
  - IDE: IntelliJ IDEA, Eclipse o NetBeans
- *Configuración de la base de datos*:
  - Crear una base de datos con el script proporcionado en el directorio /database.

## ⚙️ Instalación
1. Clonar este repositorio:
   bash
   git clone https://github.com/tu_usuario/sistema-control-acceso.git
   cd sistema-control-acceso
   

2. Configurar la base de datos:
   - Ejecutar el script setup.sql en MySQL.

3. Configurar el archivo de conexión en src/Configuracion/Conexion.java:
   java
   public static final String URL = "jdbc:mysql://localhost:3306/zona_acme";
   public static final String USER = "usuario";
   public static final String PASSWORD = "contraseña";
   

4. Compilar y ejecutar el proyecto desde el IDE.

## 🚪 Uso del Sistema
- *Inicio de sesión*:  
  - Superusuarios crean supervisores.  
  - Supervisores gestionan guardas y funcionarios.  
- *Pantalla principal del guarda*:  
  - Registro rápido de entradas/salidas.  
  - Visualización de anotaciones en tiempo real.  
- *Supervisor*:  
  - Registro de incidentes.  
  - Generación de reportes.  

## 🧩 Diseño y Principios Implementados
### 🏗️ Arquitectura
El sistema está basado en el patrón *MVC*, dividido en módulos para facilitar la escalabilidad y el mantenimiento.

### 🔍 Patrones de Diseño
- *Singleton*: Gestión de la conexión a la base de datos.  
- *DAO*: Abstracción de acceso a datos.  
- *Observer*: Sincronización en tiempo real entre pantallas.  
- *Factory*: Creación de usuarios y roles.  
- *Command*: Manejo de acciones como registro de accesos e incidentes.

### ⚖️ Principios SOLID
- *Responsabilidad Única*: Cada clase tiene una única responsabilidad bien definida.  
- *Abierto/Cerrado*: El sistema permite la extensión sin modificar su código fuente principal.  
- *Inversión de Dependencia*: Uso de interfaces para desacoplar la lógica del sistema.

## 📸 Capturas de Pantalla
- *Pantalla de Login*
  ![Login](./screenshots/login.png)
- *Pantalla Principal del Guarda*
  ![Guarda](./screenshots/guarda.png)

## 🚀 Tareas Futuras
- Integración con dispositivos biométricos.  
- Mejora de reportes con exportación a formatos PDF/Excel.  
- Migración a JavaFX para una interfaz más moderna.

## 🤝 Contribución
1. Realiza un fork de este repositorio.  
2. Crea una nueva rama para tus cambios:
   bash
   git checkout -b feature/nueva-funcionalidad
   
3. Realiza tus cambios y súbelos:
   bash
   git commit -m "Descripción de los cambios"
   git push origin feature/nueva-funcionalidad
   
4. Envía un Pull Request.

## 📜 Licencia
Este proyecto está licenciado bajo los términos de la [MIT License](LICENSE).