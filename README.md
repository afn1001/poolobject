[![Java CI](https://github.com/afn1001/poolobject/actions/workflows/ant.yml/badge.svg)](https://github.com/afn1001/poolobject/actions/workflows/ant.yml)
[![codecov](https://codecov.io/gh/afn1001/poolobject/branch/master/graph/badge.svg?token=PG57T6NPRP)](https://codecov.io/gh/afn1001/poolobject)

poolobject
==========

Dado el proyecto https://github.com/clopezno/poolobject se ha realizado la práctica "Medir para caracterizar entidades de productos y procesos software".

Enunciado
--
En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.<br />
El objetivo es establecer un caso de estudio que sirva para caracterizar y evaluar tanto el producto desarrollado como el proceso seguido.

Objetivos
--
- Comprender los objetivos de medición relacionados con la caracterización y la evaluación de productos, procesos y recursos software
- Comprender, aplicar y analizar técnicas de medición sobre entidades de productos software relacionados con conjuntos de pruebas de software
- Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos de prueba del software

Preguntas
--
__¿Se ha realizado trabajo en equipo?__ <br />
No, el trabajo ha sido realizado por una única persona realizando un fork al proyecto [poolobject](https://github.com/clopezno/poolobject) de [Carlos López](https://github.com/clopezno).

__¿Tiene calidad el conjunto de pruebas disponibles?__ <br />
No del todo, ya que cubre el 73% de todas las clases

__¿Cuál es el esfuerzo invertido en realizar la actividad?__ <br />
- La configuración estándar del entorno si no hubiera habido fallos - 1 hora
- La configuración de "Ant" y la integración continua con actions realizada con un fichero ".yml" - 1:30 horas.
- La realización de las pruebas - 1:30 horas
- Resolución de problemas al realizar el "Commit and Push", ya que obtenía el error "Rejected Non-Fast-Forward", para el cual he tenido que crear un token en Git para usarlo en lugar de la contraseña - 1 hora.
 - __Total - 5 horas__

__¿Cuál es el número de fallos encontrados en el código?__ <br />
No hay fallos en el código, como podemos comprobar en la integración continua de actions en la parte superior (Java CI: passing), pero hay 17 líneas que no se han tenido en cuenta en las pruebas y que se deberían solucionar

![image](https://user-images.githubusercontent.com/57288761/156159962-275668e0-0091-4187-a063-ce6cedc16c7e.png)
