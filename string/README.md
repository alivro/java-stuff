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