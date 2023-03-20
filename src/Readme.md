Clase Persona:
Se requiere un programa que modele el concepto de una persona. Una persona posee nombre, apellido, numero de documento de identidad y año de nacimento. La clase debe tener constructor que inicialice los valores de sus respectivos atributos.

La clase debe incluir los seguintes métodos:
=> Definir un método que imprima en pantalla los valores de los atributos del objeto.
=> En un método main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.

Agregar dos nuevos atributos a la clase Persona. Un atributo que
represente el país de nacimiento de la persona (de tipo String) y

otro que identifique el género de la persona, el cual debe represen-
tarse como un char con valores 'H' o 'M'.

u Modificar el constructor de la clase Persona para que inicialice es-
tos dos nuevos atributos.

u Modificar el método imprimir de la clase Persona para que mues-
tre en pantalla los valores de los nuevos atributos.

XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

Un planeta tiene los siguientes atributos:
Un nombre de tipo Sring con valor inicial de null.
Cantidad de satélites de tipo int con valor inicial de cero.
Masa en kilogramos de tipo double con valor inicial de cero.
Volumen en kilómetros cúbicos de tipo double con valor inicial de
cero.
Diámetro en kilómetros de tipo int con valor inicial de cero.
Distancia media al Sol en millones de kilómetros, de tipo int con
valor inicial de cero.
Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con
los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
Observable a simple vista, de tipo booleano con valor inicial false.


La clase debe incluir los siguientes métodos:
La clase debe tener un constructor que inicialice los valores de sus
respectivos atributos.
Definir un método que imprima en pantalla los valores de los atri-
butos de un planeta.
Calcular la densidad un planeta, como el cociente entre su masa y
su volumen. d= m/v
Determinar si un planeta del sistema solar se considera exterior.
Un planeta exterior está situado más allá del cinturón de asteroi-
des. El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una
unidad astronómica (UA) es la distancia entre la Tierra y el Sol=
149 597 870 Km.
En un método main se deben crear dos planetas y mostrar los va-
lores de sus atributos en pantalla. Además, se debe imprimir la
densidad de cada planeta y si el planeta es un planeta exterior del
sistema solar.


XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

Enunciado: clase Automóvil
Se requiere un programa que modele el concepto de un automóvil. Un
automóvil tiene los siguientes atributos:
Marca: el nombre del fabricante.
Modelo: año de fabricación.
Motor: volumen en litros del cilindraje del motor de un automóvil.
Tipo de combustible: valor enumerado con los posibles valores de
gasolina, bioetanol, diésel, biodiésel, gas natural.
Tipo de automóvil: valor enumerado con los posibles valores de
carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.
Número de puertas: cantidad de puertas.
Cantidad de asientos: número de asientos disponibles que tiene el
vehículo.
Velocidad máxima: velocidad máxima sostenida por el vehículo
en km/h.
Color: valor enumerado con los posibles valores de blanco, negro,
rojo, naranja, amarillo, verde, azul, violeta.
Velocidad actual: velocidad del vehículo en un momento dado.
La clase debe incluir los siguientes métodos:
Un constructor para la clase Automóvil donde se le pasen como
parámetros los valores de sus atributos.
Métodos get y set para la clase Automóvil.
Métodos para acelerar una cierta velocidad, desacelerar y frenar
(colocar la velocidad actual en cero). Es importante tener en cuen-
ta que no se debe acelerar más allá de la velocidad máxima per-
mitida para el automóvil. De igual manera, tampoco es posible
desacelerar a una velocidad negativa. Si se cumplen estos casos, se
debe mostrar por pantalla los mensajes correspondientes.
Un método para calcular el tiempo estimado de llegada, utilizando
como parámetro la distancia a recorrer en kilómetros. El tiempo
estimado se calcula como el cociente entre la distancia a recorrer y
la velocidad actual.
Un método para mostrar los valores de los atributos de un Auto-
móvil en pantalla.
Un método main donde se deben crear un automóvil, colocar su
velocidad actual en 100 km/h, aumentar su velocidad en 20 km/h,
luego decrementar su velocidad en 50 km/h, y después frenar. Con
cada cambio de velocidad, se debe mostrar en pantalla la velocidad
actual.