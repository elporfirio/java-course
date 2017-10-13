public class Main {
    int number;

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public Main(){
        int i = 10;
        int j = 20;

        intercambiar(i, j);
        System.out.println("ORIGINALES");
        System.out.println(i & j);
    }

    /**
     * Cuando se pasan primitivos, se crea una copia de los valores,
     * manteniendo los valores originales.
     *
     * @param i
     * @param j
     */
    void intercambiar(int i, int j){
        int temp = i;
        i = j;
        j = temp;

        System.out.println("INTERCAMBIADOS");
        System.out.println(i & j);
    }

    /**
     * Cuando se pasan clases, se mantiene una referencia hacia esas clases
     * permitiendo cambiar los valores de las clases originales que se pasan como parametro
     */
    void intercambiarClase(Main i, Main j){
        int temp = i.getNumber();
        i.setNumber(j.getNumber());
        j.setNumber(temp);

        System.out.println("INTERCAMBIADOS");
        System.out.println(i.getNumber() & j.getNumber());
    }


    /** SOBRECARGAR ##############
     *
     * Cada metodo o constructor tiene una unica firma, esa firma se basa en 3 aspectos
     *
     * 1. la cantidad de parametros de entrada
     * 2. el tipo de parametro de entrada
     * 3. Nombre del método
     *
     * **/


}
