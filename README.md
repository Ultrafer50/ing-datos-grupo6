# Ingeniería de Datos - Trabajo Integrador
En el presente repositorio se encuentra el codigo fuente para la aplicación del Trabajo Integrador, que consiste en una ventana que permite realizar registros de ventas que se escriben en un base de datos.
## Cómo ejecutar
### Tablas y datos iniciales
Para ejecutar el proyecto es necesario primero tener creadas las tablas en la base de datos, con datos cargados. Las sentencias de creación de tablas, junto con unas secuencias necesarias para el ingreso de datos, se encuentran en la carpeta "sql". Aquí se encontraran dos versiones para lograr este fin.
- tablasNewid_simple.sql
  - Este presenta las tablas, secuencias y unas 100 sentencias INSERT INTO por tabla.
- tablasNewid_completo.sql
  - Este presenta las tablas, secuencias y más de 9000 sentencias INSERT INTO en total.
### Procedures necesarias
Para la correcta ejecución del programa también se necesitará un par de procedures encargadas de registrar nuevos datos en las tablas PEDIDO y PEDIDO_PRODUCTO. Estas procedures se encuentra en la carpeta "sql" en forma de paquete con el nombre "programas.sql". Al ser un paquete es necesario primero ejecutar su *header* y luego el *body*.
### Proyecto Java
Luego de tener las tablas, datos y procedures listas se podrá ejecutar el proyecto java, siempre y cuando se hallan especificado los datos de conexión correctos en el archivo "JdbcUtil.java"
## Grupo 6
Integrantes:
- Arribasplata Muñoz, Andy Roberto - 20170113
- Rodríguez Roncal, Fernando David - 20193354
- Trujillo Lou, Diego Alberto - 20173965
- Vargas Zarpan, Javier Antonio - 20171632
