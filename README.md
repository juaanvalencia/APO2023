 	 


Conceptos fundamentales de Java 6-1: Arreglas
Actividades prácticas
Objetivos de la lección:
•	Realización de un array unidimensional en un programa Java usando tipos de datos primitivos
•	Realización de un array unidimensional en un programa Java usando tipos de referencia (Objeto)
•	Realización de un array bidimensional en un programa Java usando tipos de datos primitivos
•	Realización de un array bidimensional en un programa Java usando tipos de referencia (Objeto)
•	Declaración de un array, inicialización de un array y atravesar (traverse) el array
•	Descripción de la inicialización de array
•	Distinción entre el método de longitud de cadena length() y el valor de longitud del array
•	Reescribir un programa Java para guardar enteros en un array, realizar un cálculo matemático y mostrar el resultado
•	Uso de sintaxis alternativa de declaración de array


Vocabulario:

Identifique el término correspondiente a cada una de las definiciones a continuación.

Recorrido de array	Acto de pasar por un array.
Array	Estructura que almacena valores múltiples del mismo tipo de datos.
Array bidimensional	Array de dos dimensiones.
Índice de array	Número entero que identifica la ubicación de un valor en un array.
Paso de array por referencia	Capacidad de transmitir datos hacia la función principal y acceder a ellos como elemento del array.
Algoritmo	Procedimiento informático lógico que, si se aplica correctamente, garantiza la solución de un problema.
Matriz	Un array de arrays, similar a una tabla, arreglo u hoja de cálculo.
Ciclo anidado	A para ciclo dentro de “a” para ciclo
Array o Vector	Objeto con nombre utilizado para almacenar más de un valor.
 
Inténtelo/resuélvalo:

1.	Declare una calificación de nombre de array de una dimensión del tipo int que pueda contener 9 valores.

package punto1a4;

public class Main {

public static void main(String[] args) {

int[] array = new int[9];
}
}

2.	Declare un precio con nombre de array de 2 dimensiones de tipo float que tenga 10 filas y 3 columnas.

package punto1a4;

public class Main {

public static void main(String[] args) {

float[][] precio = new float[10][3];
}
}


3.	Declare e inicialice un array de 2 dimensiones denominado arreglo de un tipo largo que tenga 4 filas y 3 columnas para que todos los valores estén configurados en 5.

package punto1a4;

public class Main {

public static void main(String[] args) {

long[][] arreglo = new long[4][3];

for(int i = 0; i < 4; i++) {

for(int j = 0; j < 3; j++) {
arreglo[i][j] = 5;
}
}











4.	Declare e inicialice un array de bytes de una dimensión denominado valores de tamaño 10 de manera que todas las entradas contengan 1.

package punto1a4;

import java.util.Arrays;

public class Main {

public static void main(String[] args) {

byte[] valores = new byte[10];

for (int i = 0; i < 10; i++) {

valores[i] = (byte) 1;
}
}
}

5.	Sin escribir el código, determine el resultado del siguiente programa.
int num[] = {7,7,6,6,5,5,4,4};
for(int i = 0; i < 8; i = i + 2)
System.out.print(num[i]);

R// El programa imprimirá "7654"

6.	Sin escribir el código, determine el resultado del siguiente programa. int[][] num = {{3,3,3},{2,2,2}};
int[] array = {4,3,2}; for(int i = 0; i < 3; i++){
num[1][i] = num[0][i]+array[i];
}

for(int i = 0; i < 2; i++){
for(int j = 0; j < 3; j++){
System.out.print(num[i][j]);
}
System.out.println();
}
R// el resultado del programa sería:
3 3 3
7 6 5
