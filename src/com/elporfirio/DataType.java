package com.elporfirio;

public class DataType {
    int entero; //  -2147483648 - 2147483647
        byte bit; // -128 a 127
        short corto; // -32768 a 32767
        long largo; // -9223372036854775808L a 9223372036854775807L
    float flotante; // 0.0f
        double doble; // 0.0 o 0.0d
    char caracter; // 'A' !== string
    boolean boleano; // true || false


    public void doPrefix() {
            /* Operadores Aritmeticos **/
        int ejemploNumero = 10;
        System.out.println(++ejemploNumero); // 10
        System.out.println(ejemploNumero); // 11
    }

    public void doPostFix() {
            /* Operadores Aritmeticos **/
        int ejemploNumero = 10;
        System.out.println(ejemploNumero++); // 11
        System.out.println(ejemploNumero); // 11
    }

    /** Operator Precedence
     * 1. Postfix
     * 2. Prefix
     * 3. Multiplicacion  *  /  %
     * 4. Adición - +
     * */

    public void doPrecedence() {
        int result = 10 / 5 * 6 + 8;

        // 10 / 5 => * 6  => +8
        // Después de la precedencia se lee de izquierda a derecha.

        int result2 = 10 / (5 * (6 + 8));
    }


    /** Implicit Type conversion
     * Al pasar entre tipos se adopta el tipo de mayor memoria
     * Util al pasar numeros pequeños a variables que pueden contener tipos mas grandes
     * **/
    short dude = 15;
    int some = dude;  // De Short a entero
    float some2 = some; // de entero a Float

    /** Explicit Type Conversion
     * SE puede convertir de un mayor a uno menor con la limitante de que puede haber perdida de datos
     */
    long nuevo = 125400000000L;
    int pequeno = (int) nuevo;

    public void doCast(){
        float floatNumber = 1.0f;
        double doubleNumber = 2.0d;
        byte byteNumber = 2;
        short shortVal = 5;
        long longNumber = 6;

        short result1 = byteNumber;
        short result2 = byteNumber + longNumber;
        double result3 = longNumber - doubleNumber;
        long result4 = shortVal - longNumber + floatNumber;
    }
}
