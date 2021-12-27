public class ConversionTipos {
    public static void main(String[] args) {
        ConversionTipos.conversionImplicita();
        //ConversionTipos.conversionExplicita();
        //ConversionTipos.cadenaANumero();
    }

    public static void conversionImplicita() {
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
    }

    public static void conversionExplicita() {
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
    }

    public static void cadenaANumero() {
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
    }
}