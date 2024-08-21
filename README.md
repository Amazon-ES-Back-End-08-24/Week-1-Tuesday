# Semana 1 
## Tabla de Contenidos

1. [Objetivos de Aprendizaje](#objetivos-de-aprendizaje)
2. [Introducción a la Programación y Java](#1-introducción-a-la-programación-y-java)
   - [¿Qué es la Programación?](#qué-es-la-programación)
   - [Introducción a Java](#introducción-a-java)
   - [Configuración de Tu Entorno de Trabajo](#configuración-de-tu-entorno-de-trabajo)
3. [Tu Primer Programa: ¡Hola, Mundo!](#2-tu-primer-programa-hola-mundo)
4. [Variables y Tipos de Datos](#3-variables-y-tipos-de-datos)
   - [Entendiendo las Variables](#entendiendo-las-variables)
   - [Tipos de Variables en Java](#tipos-de-variables-en-java)
   - [Declaración y Uso de Variables](#declaración-y-uso-de-variables)
   - [Por Qué son Importantes las Variables](#por-qué-son-importantes-las-variables)
   - [Ejercicio Práctico: Catálogo Personal de Biblioteca](#ejercicio-práctico-catálogo-personal-de-biblioteca-20-minutos)
5. [Operadores Básicos de Java](#4-operadores-básicos-de-java)
   - [Operadores Aritméticos](#1-operadores-aritméticos)
   - [Operador de Asignación](#2-operador-de-asignación)
   - [Operadores de Asignación Compuesta](#3-operadores-de-asignación-compuesta)
   - [Operadores de Comparación](#4-operadores-de-comparación)
   - [Operadores Lógicos](#5-operadores-lógicos)
   - [Práctica con Operadores](#práctica-con-operadores)

---

### Objetivos de Aprendizaje
Al finalizar esta lección, podrás:
1. Comprender conceptos básicos de programación
2. Escribir y ejecutar programas simples en Java
3. Usar variables, tipos de datos y operadores en Java
4. Implementar flujo de control utilizando sentencias if y bucles
5. Trabajar con arreglos y cadenas en Java

## 1. Introducción a la Programación y Java

### ¿Qué es la Programación?
La programación es como darle instrucciones a un amigo muy literal para hacer un sándwich. Necesitas ser preciso y desglosar cada paso de manera clara.

### Introducción a Java
Java es como aprender un nuevo idioma, pero en lugar de comunicarte con personas, te comunicas con computadoras. Así como los idiomas humanos tienen reglas gramaticales, Java tiene reglas de sintaxis que debemos seguir.

### Configuración de Tu Entorno de Trabajo
Antes de comenzar a cocinar (codificar), necesitamos configurar nuestra cocina (entorno de desarrollo):
1. Instala el Kit de Desarrollo de Java (JDK) - Esto es como conseguir tus utensilios básicos de cocina - Java 17 o 21.
2. Instala un Entorno de Desarrollo Integrado (IDE) - Piensa en esto como tu cocina especializada para codificar. Recomendamos IntelliJ IDEA.

## 2. Tu Primer Programa: ¡Hola, Mundo!

Así como podrías decir "Hola" al aprender un nuevo idioma, en programación, comenzamos imprimiendo "¡Hola, Mundo!". Así es como se ve:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

No te preocupes si esto parece confuso ahora. Lo desglosaremos y explicaremos cada parte a medida que avancemos en el curso.

## 3. Variables y Tipos de Datos

### Entendiendo las Variables
Las variables son uno de los conceptos más fundamentales en la programación. Piensa en una variable como un contenedor o una caja etiquetada que contiene una pieza de información.

#### Analogía del Mundo Real
Imagina que estás organizando una fiesta. Podrías usar diferentes contenedores para guardar diferentes artículos:
- Un tazón para patatas fritas
- Una jarra para zumo
- Un plato para galletas

En programación, las variables son como estos contenedores. Cada variable tiene:
1. Un nombre (como "tazón", "jarra", "plato")
2. Un tipo (qué tipo de cosa puede contener)
3. Un valor (el contenido real)

### Tipos de Variables en Java
En Java, cada variable tiene un tipo específico. Pueden ser primitivos o no primitivos. Aquí hay algunos tipos básicos:

1. `int`: Para números enteros (por ejemplo, 1, -5, 1000)
2. `double`: Para números decimales (por ejemplo, 3.14, -0.01, 2.0)
3. `boolean`: Para valores verdadero/falso
4. `char`: Para caracteres individuales (por ejemplo, 'A', '7', '$')
5. `String`: Para texto (por ejemplo, "¡Hola, Mundo!") - no primitivo

### Declaración y Uso de Variables
Para crear una variable en Java, necesitas declararla. Aquí está la sintaxis básica:

```java
tipo nombreVariable = valor;
```

Ejemplos:
```java
int edad = 25;
double precio = 19.99;
boolean esEstudiante = true;
char calificación = 'A';
String nombre = "Alicia";

System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");
```


### Por Qué son Importantes las Variables
1. **Reusabilidad**: Puedes usar el mismo valor varias veces en tu programa.
2. **Legibilidad**: Usar variables bien nombradas hace que tu código sea más fácil de entender.
3. **Flexibilidad**: Puedes cambiar fácilmente los valores en un solo lugar, afectando a todo el programa.

### Ejercicio Práctico: Catálogo Personal de Biblioteca (20 minutos)

¡Ahora es el momento de poner en práctica tu comprensión de las variables! En este ejercicio, crearás un programa simple para catalogar libros en tu biblioteca personal.

#### Descripción de la Tarea:
1. Crea variables para almacenar información sobre tres libros. Para cada libro, debe tener:
   - Título (String)
   - Autor (String)
   - Año de Publicación (int)
   - Número de Páginas (int)
   - Si lo has leído o no (boolean)
2. Asigna valores a estas variables para tres libros diferentes.
3. Usa `System.out.println()` para mostrar la información de cada libro de manera formateada.
4. Calcula y muestra algunas estadísticas básicas:
   - El número total de páginas en todos los libros
   - El año de publicación promedio

## 4. Operadores Básicos de Java

Los operadores son símbolos que indican al compilador que realice manipulaciones matemáticas o lógicas específicas.

### 1. Operadores Aritméticos
Estos se usan para realizar operaciones matemáticas comunes:
- `+` (Suma): Suma dos valores
- `-` (Resta): Resta el operando derecho del operando izquierdo
- `*` (Multiplicación): Multiplica dos valores
- `/` (División): Divide el operando izquierdo por el operando derecho
- `%` (Módulo): Devuelve el resto de una operación de división

### 2. Operador de Asignación
- `=` : Asigna un valor a una variable

### 3. Operadores de Asignación Compuesta
Estos realizan una operación y asignación en un solo paso:
- `+=` : Sumar y asignar
- `-=` : Restar y asignar
- `*=` : Multiplicar y asignar
- `/=` : Dividir y asignar

### 4. Operadores de Comparación
Estos se utilizan para comparar dos valores:
- `==` : Igual a
- `!=` : No igual a
- `>` : Mayor que
- `<` : Menor que
- `>=` : Mayor o igual a
- `<=` : Menor o igual a

### 5. Operadores Lógicos
Estos se utilizan para determinar la lógica entre variables o valores:
- `&&` : Y lógico
- `||` : O lógico
- `!` : NO lógico

### Práctica con Operadores
Intenta adivinar el resultado de estas operaciones:
1. `int resultado = 10 + 5 * 2;`
2. `boolean esAdulto = (18 >= 18);`
3. `int x = 10; x += 5; x *= 2;`
