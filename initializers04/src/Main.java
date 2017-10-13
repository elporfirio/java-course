public class Main {
    /** Field Initializers **/
    long circunferenceinMiles = 25901;
    long getCircunferenceinKilometers = (long) (circunferenceinMiles * 1.6d);

    int algo;
    int otro;
    int nuevo;
    double operation;

    /** Constructor **/
    public Main(){ //si se va a tener mas de un constructor es necesario definir el default

    }

    public Main(int algo){
        this(algo * 3.0d); // se puede llamar a un constructor privado (siempre tiene que ir antes de otros)
        this.algo = algo;
    }
    // Se pueden tener distintos constructores

    public Main(int algo, int otro, int nuevo){
        this(algo);  // this hace referencia al constructor
        this.otro = otro;
        this.nuevo = nuevo;
    }

    private Main(double operation){
        this.operation = operation;
    }

}
