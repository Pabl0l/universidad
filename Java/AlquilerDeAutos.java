public class AlquilerDeAutos {
    public static void main(String[] args) {
        calcularCobro(600);
    }

    public static void calcularCobro(int km) {
        double IVA = 0.19;
        int cobroBase = 600000;
        int cobroTotal = cobroBase;
        int masDe600km = 25000;
        int masDe1000km = 20000;
        if(km<1){
            System.out.println("ingrese un valor de km valido");
            return;
        }
        if(km > 600){
            cobroTotal = (int) (masDe600km * (km - 600) + cobroBase);
        } else {
            if(km >= 1000){
                cobroTotal = (int) (masDe1000km * (km - 600)* + cobroBase);
            }
        }
        System.out.println("valor bruto : " + cobroTotal);
        System.out.println("valor el IVA : " + (int) (cobroTotal * (IVA)));
        cobroTotal = (int) (cobroTotal * (1+IVA));
        System.out.println("Total : " + cobroTotal);
}
}