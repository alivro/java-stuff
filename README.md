# Java 

## Datos

| Tipo | Tamaño | Valor por defecto | Rango de valores
| ----------- | ----------- | ----------- | ----------- |
| byte | 1 byte | 0 | -128 a 127 |
| short | 2 bytes | 0 | -32,768 a 32,767 |
| int | 4 bytes | 0 | -2,147,483,648 a 2,147,483,647 |
| long | 8 bytes | 0L | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 |
| float | 4 bytes | 0.0f | Números reales con hasta 7 dígitos decimales |
| double | 8 bytes | 0.0d | Números reales con hasta 15 dígitos decimales |
| char | 2 bytes | '\u0000' | ‘\u0000’ a ‘\uffff’ (0 a 65535) |
| boolean | 1 bit | false | true o false |

### Conversión

#### Implicita
Conversión de un tipo de dato más pequeño a un tipo de dato más grande:
```
  byte -> short -> char -> int -> long -> float -> double 
```

Código:
``` java
    byte b = 127;
    short s = b;
    int i = s;
    long l = i;
    float f = l;
    double d = f;

    System.out.println("Conversion implicita");
    System.out.println("byte = " + b);
    System.out.println("short = " + s);
    System.out.println("int = " + i);
    System.out.println("long = " + l);
    System.out.println("float = " + f);
    System.out.println("double = " + d);
```

Salida:
```
    Conversion implicita
    byte = 127
    short = 127
    int = 127
    long = 127
    float = 127.0
    double = 127.0
```

#### Explicita
Conversión de un tipo de dato más grande a un tipo de dato más pequeño:
```
  double -> float -> long -> int -> char -> short -> byte
```

Código:
``` java
    double d = 1.414213562373095d;
    float f = (float) d;
    long l = (long) f;
    int i = (int) l;
    short s = (short) i;
    byte b = (byte) s;

    System.out.println("Conversion explicita");
    System.out.println("double = " + d);
    System.out.println("float = " + f);
    System.out.println("long = " + l);
    System.out.println("int = " + i);
    System.out.println("short = " + s);
    System.out.println("byte = " + b);
```

Salida:
```
    Conversion explicita
    double = 1.414213562373095
    float = 1.4142135
    long = 1
    int = 1
    short = 1
byte = 1
```

#### Cadena a número
Código:
``` java
    String str = new String("101");
    byte b = Byte.parseByte(str);
    short s = Short.parseShort(str);
    int i = Integer.parseInt(str);
    long l = Long.parseLong(str);
    float f = Float.parseFloat(str);
    double d = Double.parseDouble(str);

    System.out.println("Cadena a numero");
    System.out.println("String = " + str);
    System.out.println("byte = " + b);
    System.out.println("short = " + s);
    System.out.println("int = " + i);
    System.out.println("long = " + l);
    System.out.println("float = " + f);
    System.out.println("double = " + d);
```

Salida:
```
    Cadena a numero
    String = 101
    byte = 101
    short = 101
    int = 101
    long = 101
    float = 101.0
    double = 101.0
```
