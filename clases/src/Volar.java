public class Volar {
    private int pasajeros;
    private int asientos;

    public Volar() {
        asientos = 50;
        pasajeros = 100;
    }

    public void agregarPasajero(){
        if(pasajeros < asientos)
                pasajeros += 1;
        else
            demasiadosPasajeros();
    }

    private void demasiadosPasajeros() {
        System.out.println("Hay muchos");
    }

    protected String doSome() {
        return "Hello World";
    }

    public boolean tieneAsientos(Volar f2){
        int total = pasajeros + f2.pasajeros;
        return total <= asientos;
    }

    public Volar crearNuevoCon2Vuelso(Volar f2){
        Volar nuevoVuelo = new Volar();
        nuevoVuelo.asientos = asientos;
        nuevoVuelo. pasajeros = pasajeros + f2.pasajeros;
        return nuevoVuelo;
    }

    /** APlicando this, mejora la referencia del codigo */
    public Volar crearNuevoCon2Vuelo(Volar f2){
        Volar nuevoVuelo = new Volar();
        nuevoVuelo.asientos = this.asientos;
        nuevoVuelo. pasajeros = this.pasajeros + f2.pasajeros;
        return nuevoVuelo;
    }

    /** null aplica a una variable que no esta definida, pero si tiene su tipo
     *
     * int valor
     */
}
