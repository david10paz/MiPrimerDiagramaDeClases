***Mi Primer Diagrama de Clases***
===

``` mermaid
classDiagram
      Persona <|-- Profesor
      Persona <|-- Alumno

    <!-- Clase Principal de la cual Profesor y Alumno heredarán sus datos -->

    class Persona{
        -edad : INTEGER
        -dni : String
        -nombre : String
        +toString() void
    }

    <!-- Clase Profesor que aparte tiene dos datos propios y un método para mostrar sus datos propios-->

    class Profesor{
          -departamento : String
          -asignatura: String
          +toString() void
      }

    <!-- Clase Alumno que aparte tiene dos datos propios y dos métodos, uno para mostrar sus datos y otro para comparar los DNI -->

    class Alumno{
          -repetidor : String
          -asignatura: String
          +toString() void
          +compareTo(Object personaje) int
      }