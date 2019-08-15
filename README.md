# MVNGIT-LAB
## Introduccion 
Se requiere de un programa que dada una lista de numeros encuentre la media y la desviacion estandar de los mismos.
Para esto la lista a usar debe ser una lista encadenada de nodos que almacenen los valores de los numeros de la lista.
El programa esta compuesto de 3 clases. Aplication,linket linkedList y nodo.
Nodo es como su nombre lo dice la clase donde se almacenaran los valores numericos.
linkedList es la clase encargada de unir a los diferentes nodos y almacenar tanto la cabeza como la cola de la lista. 
Aplicacion es la clase que simplemente hace uso de linkedList  para encontrar la media y la desviacion de un caso en particular.
A continuación se explicara el funcionamiento del programa descrito anteriormente. 
## Solución
La clase mas atomica a crear es Nodo, posee dos atributos, next y valor, donde valor es el numero almacenado en el nodo y next es la referencia al siguiente nodo de la lista. si no lo hay es null next.
Se crea una clase llamada LinkedList , esta posee las dos funciones que haran el proceso para solucionar el problema, theMedia y deviationStandar para poder clacular la media y la desviacion de la lista que almacena.Posee otra funcion para calcular el tamaño de la lista que esta guardando;numero de nodos que hay actualmente.Tambien se encuentra el metodo DeleteNodo, en caso de que se quiera eliminar un numero.Las variables heat y tail son la cabeza y la cola de la lista respectivamente.Cuando se desee agregar un nodo a la lista se debera llamar a la funcion agregarNodo, la cual se encarga de crear un nuevo nodo y almacenarlo en la cola de la lista. la funcion recibe el numero a agregar.
Aplicacion se crea para usar la aplicacion LinketList y solucionar el problema.
