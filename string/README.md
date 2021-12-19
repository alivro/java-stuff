# String

## Métodos

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
