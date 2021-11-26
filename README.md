# bluebank-backend

Bluebank-backend es un smicroservicio el cual permite realizar ciertas acciones enfocadas a cuemtas de ahorro, como son la creción de una cuenta, la consulta del saldo y el retirar o agregar fondos a la misma.
## Principales tecnologias utilizadas

- [JDK 11.0.11](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
- [Spring Boot 2.4.4](https://spring.io/projects/spring-boot)
- [Gradle](https://gradle.org/)
- [Postgresql](https://www.postgresql.org/)

## Lineamientos y Consideraciones

Al momento de desarrollar la solución es tuvo en cuenta la capacidad de escalar de la aplicación, por lo cual se elije realizar una implementación enfocada en el desacoplamiento, lo cual permite incrementar las funcionalidades de la misma de manera sencilla. Respecto a la persistencia de la información se pudieron identificar claras relaciones entre los datos, por lo cual se elije una base de datos relacional (postgresql), la cual permite mantener la consistencia de la información y asegurar la integridad de las transacciones realizadas.
