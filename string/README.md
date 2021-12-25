# String

## Métodos

### format

#### Ejemplo 1
Código:
``` java
    String entero = String.format("%d", 11037);  
    String flotante = String.format("%f %.10f", 3.141592653589793, 0.00002718281828459045);
    String notacionCientificaComputarizada = String.format("%e %E", 3.141592653589793, 0.00002718281828459045);
    String notacionCientificaGeneral = String.format("%g %G", 3.141592653589793, 0.00002718281828459045);

    System.out.println("Entero:");
    System.out.println(entero);

    System.out.println("\nFlotante:");
    System.out.println(flotante);

    System.out.println("\nNotacion Cientifica Computarizada:");
    System.out.println(notacionCientificaComputarizada);

    System.out.println("\nNotacion Cientifica General:");
    System.out.println(notacionCientificaGeneral);
```

Salida:
```
    Entero:
    11037

    Flotante:
    3.141593 0.0000271828

    Notacion Cientifica Computarizada:
    3.141593e+00 2.718282E-05

    Notacion Cientifica General:
    3.14159 2.71828E-05
```

#### Ejemplo 2
Código:
``` java
    String boleano = String.format("%b %B", true, false);
    String caracter = String.format("%c %C ", 'a', 'z');
    String cadena = String.format("%s %S", "Madeline", "Badeline");
    
    System.out.println("Booleano:");
    System.out.println(boleano);

    System.out.println("\nCaracter:");
    System.out.println(caracter);

    System.out.println("\nCadena:");
    System.out.println(cadena);
```

Salida:
```
    Booleano:
    true FALSE

    Caracter:
    a Z 

    Cadena:
    Madeline BADELINE
```

#### Ejemplo 3
Código:
``` java
    String indexOrdenado = String.format("%1$s %2$s %3$s %4$s %5$s", "a", "b", "c", "d", "e");
    String indexDesordenado = String.format("%5$s %4$s %3$s %2$s %1$s", "a", "b", "c", "d", "e");
    
    System.out.println("Indice de argumentos:");
    System.out.println(indexOrdenado);
    System.out.println(indexDesordenado);
```

Salida:
```
    Indice de argumentos:
    a b c d e
    e d c b a
```


### join

#### Ejemplo 1
Código:
``` java
  String words[] = {"My", "heart", "belongs", "to", "you"};
  String delimiter = new String(" ");
  String sentence = String.join(delimiter, words);
  
  System.out.println(sentence);
```

Salida:
```
    My heart belongs to you
```


### split

#### Ejemplo 1
Código:
``` java
    String golden = "1-6-1-8-0-3-3-9-8-8-7-4-9";
    String regex = new String("-");
    String[] digits = golden.split(regex);

    System.out.println("Cadena original:");
    System.out.println(golden);

    System.out.println("\nArreglo:");
    for(String digit : digits)
        System.out.print(digit + " ");

    System.out.println();
```

Salida:
```
    Cadena original:
    1-6-1-8-0-3-3-9-8-8-7-4-9

    Arreglo:
    1 6 1 8 0 3 3 9 8 8 7 4 9
```
