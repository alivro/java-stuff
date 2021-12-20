# String

## Métodos

### format

#### Ejemplo 1
Código:
``` java
  String entero = String.format("%d", 11037);  
  String flotante = String.format("%f %.8f", 3.141592653589793, 3.141592653589793);
  String notacionCientificaComputarizada = String.format("%e %E", 0.00001618033988749894, 0.00001618033988749894);
  String notacionCientificaGeneral = String.format("%g %G", 0.00002718281828459045, 0.00002718281828459045);  

  System.out.println(entero);
  System.out.println(flotante);
  System.out.println(notacionCientificaComputarizada);
  System.out.println(notacionCientificaGeneral);
```

Salida:
```
  11037
  3.141593 3.14159265
  1.618034e-05 1.618034E-05
  2.71828e-05 2.71828E-05
```

#### Ejemplo 2
Código:
``` java
  String boleano = String.format("%b %B", true, false);
  String caracter = String.format("%c %C ", 'a', 'z');
  String cadena = String.format("%s %S", "Madeline", "Badeline");

  System.out.println(boleano);
  System.out.println(caracter);
  System.out.println(cadena);
```

Salida:
```
  true FALSE
  a Z 
  Madeline BADELINE
```


#### Ejemplo 3
Código:
``` java
  String indexOrdenado = String.format("%1$s %2$s %3$s %4$s %5$s", "a", "b", "c", "d", "e");
  String indexDesordenado = String.format("%5$s %4$s %3$s %2$s %1$s", "a", "b", "c", "d", "e");

  System.out.println(indexOrdenado);
  System.out.println(indexDesordenado);
```

Salida:
```
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
    My heart belongs to you ...    
```

### split

#### Ejemplo 1
Código:
``` java
  String pi = "3-1-4-1-5-9";
  String regex = new String("-");
  String[] digits = pi.split(regex);

  for(String digit: digits)
    System.out.println(digit);
```

Salida:
```
3
1
4
1
5
9 
```
