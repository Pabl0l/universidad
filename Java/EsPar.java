public class EsPar {
    public static void main(String[] args) {
        esPar(-1);
    }

    public static void esPar(int numero) {
        String paridad;
        String signo;
        if(numero == 0){
            System.out.println("El numero 0 es par y neutro.");
            return;
        }
        if(numero%2==0){
            paridad = "par";
        } else {
            paridad = "impar";
        }
        if(numero > 0){
            signo = "positivo";
        } else {
            signo = "negativo";
        }
    System.out.println("El numero " + numero + " es " + paridad + " y " + signo + ".");
    }
}
