## PC2 CC3S2 - 20221

[![build](https://github.com/glozanoa/pc2-cc3s2-group11/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/glozanoa/pc2-cc3s2-group11/actions/workflows/build.yml)


**Members of group 11:**  
* Hannu Portillo - 20185508K
* Guillermo Borjas - 20090312A
* Gustavo Lozano - 20161317K

Pregunta 1:

Hay algunas lineas de la clase Flight que no estan siendo ejecutas por la prueba AirportTest y por eso no cubre el 100%

![](https://github.com/glozanoa/pc2-cc3s2-group11/blob/test/Fase1/report/coverage-fase1.png)


Pregunta 2:

Es necesario refactorizar dado que cada vez que se necesite agregar un nuevo tipo de vuelo, habría que modificar la condicional haciendo cambios en la clase y para eso siempre tendriamos que estar sujetos a lo que la variable typeFlight tome para cada caso. Convirtiendo cada tipo de vuelvo en una clase diferente que herede de la clase Flight podremos modificar los métodos addPassenger y removePasenger segpun sea el caso.


Pregunta 3:

Cobertura de código:
![](https://github.com/glozanoa/pc2-cc3s2-group11/blob/master/Fase3/report/coverage-report-fase3.png?raw=true)
La refactorización ayudó tanto a la legibilidad del código como a ser más mantenible en el futuro y también es ahora abierto a cambios, como agregar nuevas clases a partir de Flight, la cual quedará sin modificar (principio abierto / cerrado). A su vez los test han podido cubrir el 100%.


Pregunta 4:

Esta regla consiste en que se considera mala práctica si existe un bloque de código similar implementado más de dos veces. Esto es si este bloque se está reescribiendo por tercera vez, debe ser refactorizado, dado que conlleva a una difícil manuntención y lohace más pesado.

Pregunta 5:
Inicialización de la clase PremiumFlight:
![](https://github.com/glozanoa/pc2-cc3s2-group11/blob/master/Fase4/report/init-premium-flight.png?raw=true)


Pregunta 6:
Ejecución de pruebas luego de haber implementado las pruebas para la clase PremiumFlight:
![](https://github.com/glozanoa/pc2-cc3s2-group11/blob/master/Fase4/report/test-execution-1-fase4.png?raw=true)
![](https://github.com/glozanoa/pc2-cc3s2-group11/blob/master/Fase4/report/test-execution-2-fase4.png?raw=true)
![](https://github.com/glozanoa/pc2-cc3s2-group11/blob/master/Fase4/report/test-execution-3-fase4.png?raw=true)


Pregunta 7:

Pregunta 8:
