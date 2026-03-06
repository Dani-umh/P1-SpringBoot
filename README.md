# Spring Boot Hello World Application

Aplicación desarrollada con **Spring Boot** y **Thymeleaf**

La aplicación permite probar diferentes funcionalidades que utilizan:

- Formularios Thymeleaf
- Validación de datos
- Lógica en la capa de servicio
- Controladores web
- Tests de servicio y controladores

La página principal muestra el nombre del autor y enlaces a todas las funcionalidades implementadas.

Autor: **Daniel Garcia Moreno**

---

# Requisitos

Necesitas tener instalado en tu sistema:

- Java 8
- Maven (no necesario si usas el wrapper incluido)

---

# Ejecución de la aplicación

Puedes ejecutar la aplicación usando el **Maven Wrapper** incluido en el proyecto:

```
./mvnw spring-boot:run
```

Una vez arrancada la aplicación puedes acceder a:

```
http://localhost:8080
```

Desde la página principal se puede acceder a todas las funcionalidades.

---

# Funcionalidades implementadas

La aplicación incluye las siguientes funcionalidades:

### Palindrome
Comprueba si una palabra es un palíndromo.

Formulario:
```
http://localhost:8080/palindromeform
```

---

### Even number
Comprueba si un número es par.

Formulario:
```
http://localhost:8080/evenform
```

---

### Square
Comprueba si el segundo número es el cuadrado del primero.

Formulario:
```
http://localhost:8080/squareform
```

---

### Calculator
Calculadora básica que permite realizar operaciones:

- suma
- resta
- multiplicación
- división

Formulario:
```
http://localhost:8080/calculatorform
```

---

# Funcionalidad adicional (opcional)

### Prime number
Comprueba si un número es primo.

Formulario:
```
http://localhost:8080/primeform
```

Esta funcionalidad se ha añadido como extensión opcional de la aplicación siguiendo el mismo patrón de arquitectura utilizado en el resto de funcionalidades (controller, service, DTO, formulario Thymeleaf y tests).

---

# Funcionalidades de ejemplo incluidas en el proyecto base

El proyecto base proporcionado incluye también ejemplos para aprender Thymeleaf:

### Saludo básico
```
http://localhost:8080/saludo/Pepito
```

### Saludo usando plantilla
```
http://localhost:8080/saludoplantilla/Pepito
```

### Formulario de saludo
```
http://localhost:8080/saludoform
```

---

# Tests

El proyecto incluye diferentes tipos de tests:

- Tests de **servicios**
- Tests de **controladores**
- Tests de **formularios**

Para ejecutar todos los tests:

```
./mvnw test
```

---

# Generar el JAR

También puedes empaquetar la aplicación en un archivo ejecutable:

```
./mvnw package
```

Después puedes ejecutarla con:

```
java -jar target/demoapp-0.0.1-SNAPSHOT.jar
```

---

# Docker image

Docker Hub public link:

https://hub.docker.com/r/daniumh/p1-spring-boot-app