## PC2 CC3S2 - 20221

[![build](https://github.com/glozanoa/pc2-cc3s2-group11/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/glozanoa/pc2-cc3s2-group11/actions/workflows/build.yml)


**Members of group 11:**  
* A
* Guillermo Borjas
* Gustavo Lozano - 20161317K

Pregunta 1:

Hay algunas lineas de la clase Flight que no estan siendo ejecutas por la prueba AirportTest y por eso no cubre el 100%

[]

Pregunta 2:

Es necesario refactorizar dado que cada vez que se necesite agregar un nuevo tipo de vuelo, habría que modificar la condicional haciendo cambios en la clase y para eso siempre tendriamos que estar sujetos a lo que la variable typeFlight tome para cada caso. Convirtiendo cada tipo de vuelvo en una clase diferente que herede de la clase Flight podremos modificar los métodos addPassenger y removePasenger segpun sea el caso
