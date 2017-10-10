public class Main {
    public static void main(String[] args) {
        double val1 = 100.0d, val2 = 20.0d, result;
        char typeOperation = 'a';

        if(typeOperation == 'a')
            result = val1 + val2;
        else if (typeOperation == 's')
            result = val1 - val2;
        else if(typeOperation == 'd')
            result = val1 / val2;
        else if(typeOperation == 'm')
            result = val1 * val2;
        else {
            System.out.println("Opción inválida");
            result = 0.0d;
        }

        System.out.println("The result: " + result);
    }

    public void doOperation(){
        double[] izquierda = { 100.0d, 25.0d, 225.0d, 11.0d };
        double[] derecha = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] codes = { 'd', 'a', 's', 'm' };
        double[] results = new double[codes.length];

        for(int i = 0; i <codes.length; i++){
            switch(codes[i]) {
                case 'a':
                    results[i] = izquierda[i] + derecha[i];
                    break;
                case 's':
                    results[i] = izquierda[i] - derecha[i];
                    break;
                case 'd':
                    results[i] = derecha[i] != 0.0d ? izquierda[i] / derecha[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = izquierda[i] * derecha[i];
                    break;
                default:
                    System.out.println("Opción inválida");
                    results[i] = 0.0d;
                    break;

            }
        }

        for(double result: results) {
            System.out.println("result =");
            System.out.println(result);
        }
    }
}
