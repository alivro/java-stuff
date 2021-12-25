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
| int | capacity() | Devuelve la capacidad del StringBuilder. |
| char | charAt(int index) | Devuelve el carácter que se encuentra en el índice `index`. |
| int | length() | Devuelve el número de caracteres del StringBuilder. |
| StringBuilder | reverse() | Invierte el orden de los caracteres del StringBuilder. |
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
