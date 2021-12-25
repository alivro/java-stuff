# StringBuilder

## Constructores

| Constructor | Descripción |
| ----------- | ----------- |
| StringBuilder() | Crea un StringBuilder vacío y con una capacidad inicial de 16 caracteres. |
| StringBuilder(CharSequence seq) | Crea un StringBuilder a partir del CharSequence `seq`. |
| StringBuilder(int capacity) | Crea un StringBuilder vacío y con una capacidad inicial `capacity`.|
| StringBuilder(String str) | Crea un StringBuilder a partir del String `str`. |

## Métodos

| Tipo | Método | Descripción
| ----------- | ----------- | ----------- |
| StringBuilder | append(var value) | Agrega la cadena que representa `value` al final del StringBuilder. |
| int | capacity() | Devuelve la capacidad del StringBuilder. |
| char | charAt(int index) | Devuelve el carácter que se encuentra en la posición `index`. |
| StringBuilder | delete(int start, int end) | Elimina los caracteres entre los índices `start` y `end`. |
| StringBuilder | deleteCharAt(int index) | Elimina el carácter que se encuentra en la posición `index`. |
| int | indexOf(String str) | Devuelve el índice de la primera aparición de la cadena `str`. |
| StringBuilder | insert(int offset, var value) | Inserta la cadena que representa `value` en la posición `offset`. |
| int | lastIndexOf(String str) | Devuelve el índice de la última aparición de la cadena `str`. |
| int | length() | Devuelve el número de caracteres del StringBuilder. |
| StringBuilder | replace(int start, int end, String str) | Reemplaza los caracteres que se encuentran entre los índices `start` y `end`, por la cadena `str`. |
| StringBuilder | reverse() | Invierte el orden de los caracteres del StringBuilder. |
| void | setCharAt(int index, char ch) | Reemplaza el carácter en la posición `index`, por el carácter `ch`. |
| String | substring(int start, int end) | Devuelve la cadena comprendida entre los índices `start` y `end`. |
| String | toString() | Devuelve una cadena que representa los caracteres del StringBuilder. |


### reverse

#### Ejemplo 1
Código:
``` java
    String number = new String ("123456789");
    StringBuilder numberReverse = new StringBuilder(number);
    numberReverse.reverse();

    System.out.println("Cadena original:");
    System.out.println(number);
    
    System.out.println("\nCadena invertida:");
    System.out.println(numberReverse.toString());
```

Salida:
```
    Cadena original:
    123456789

    Cadena invertida:
    987654321
```

## Referencias
- [StringBuilder (Java Platform SE 7 )](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html)
