public class CobroParqueadero {
    public static void main(String[] args) {
        calcularCobro(1, 1);
    }

    public static void calcularCobro(int hora, int minuto) {
        int valor  = (int) Math.round(hora *5000);
        int div = (int) Math.ceil((minuto / 60));
        if (minuto == 0){
            if(hora==0){
                System.out.println("Ingrese un valor de hora y minutos valido.");
            }else{
                System.out.println(valor);
            }
            return;
        }
        if (0 < minuto && minuto < 60 ){
            valor = valor + 5000 * (div);
            System.out.println(valor);
        }else{
            System.out.println("Ingrese un valor de hora y minutos valido.");
        }
    }
}
