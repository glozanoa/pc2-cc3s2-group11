## PC2 CC3S2 - 20221

[![build](https://github.com/glozanoa/pc2-cc3s2-group11/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/glozanoa/pc2-cc3s2-group11/actions/workflows/build.yml)


**Members of group 11:**  
* A
* Guillermo Borjas
* Gustavo Lozano - 20161317K

Pregunta 1:

Hay algunas lineas de la clase Flight que no estan siendo ejecutas por la prueba AirportTest y por eso no cubre el 100%

![](https://gist.githubusercontent.com/glozanoa/b00c32a8e47c27157f467f00f704d9b7/raw/d1e566e42dabb0156953ea0ca209159c95679d8b/build.gradle)

Pregunta 2:

Es necesario refactorizar dado que cada vez que se necesite agregar un nuevo tipo de vuelo, habría que modificar la condicional haciendo cambios en la clase y para eso siempre tendriamos que estar sujetos a lo que la variable typeFlight tome para cada caso. Convirtiendo cada tipo de vuelvo en una clase diferente que herede de la clase Flight podremos modificar los métodos addPassenger y removePasenger segpun sea el caso


Pregunta 4:

Esta regla consiste en que se considera mala práctica si existe un bloque de código similar implementado más de dos veces. Esto es si este bloque se está reescribiendo por tercera vez, debe ser refactorizado, dado que conlleva a una difícil manuntención y lohace más pesado.
