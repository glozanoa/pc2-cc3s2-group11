Pregunta 2
John necesita refactorizar la factorización debido a que en caso que se necesite crear más tipos de vuelos, tendríamos que modificar la clase Flight para agregar o quitar tipos de vuelos. La solución para esto es convertir Flight en una clase abstracta y a partur de ahí crear subclases que representen un tipo de vuelo específico, de modo que si queremos agregar un nuevo tipo de vuelo simplemente creamos una subclase heredera de Flight. 