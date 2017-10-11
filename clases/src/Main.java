public class Main {
    public static void main(String[] args) {

        // al copiar clases lo que se hace es hacer referencia al objeto a diferencia de las variables primitivas
        Volar volar1 = new Volar();
        Volar volar2 = new Volar();


        volar1 = volar2; // Se vuela el objeto volar2



        sumar(10, 15);
        System.out.println("Yo de regreso");
    }

    /* Modificadores ########
    *
    * public > acceso desde cualquier lugar
    * private > solo puede acederse desde la misma clase */

    /** Los nombres de las clases tienen que llamarse como los archivos **/ // Mandatorio cuando son clase publicas


    /** REGLAS
     * 1. Solo letras y numeros
     * 2. Comienzan con Mayusculas
     * 3. Nombre Propio en Singular
     * 4. No utilizar Abreviaciones
     *
     *
     *
     * _tipo de retorno_ <nombre de la clase> (parametros tipados) { } // tipo de retorno void si no regresa nada
     * */

    private static void sumar(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return; // No es necesario en un tipo de retorno void;

        // return sirve para terminar la ejecución de un método, por ejemplo en un error simple
    }

    /** Cuando se retorna solo se puede retornar un valor
     * - tipo primitivo (int, boolean, etc)
     * - un objeto
     * - un array
     */
}
