public class Flight {
    private int passenger, flightNumber, seats;
    private char flightClass;
    private boolean[] isSeatAvaiable;

    /** Bloque de inicializacion **/
    {
        isSeatAvaiable = new boolean[seats];

        for(int i = 0; i < seats; i++){
            isSeatAvaiable[i] = true;
        }
    }

//    public Flight(){
//        isSeatAvaiable = new boolean[seats];
//
//        for(int i = 0; i < seats; i++){
//            isSeatAvaiable[i] = true;
//        }
//    }

    public Flight(){}

    public Flight(int flightNumber){
        // this();  Ya no se llama asi mismo por la inicializacion tipo Bloque
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass){
        // this();  Ya no se llama asi mismo por la inicializacion tipo Bloque
        this.flightClass = flightClass;
    }


    /** FASES DE INICIALIZACION ####
     *
     * 1. Field Initialization
     * 2. Block Initialization
     * 3. Constructor
     * ****/

}
