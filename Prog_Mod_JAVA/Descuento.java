import javax.swing.JOptionPane;

public class Descuento{
    public static void main(String [] args){
        double precio = 0;
        int fin;

        do{
            precio += Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la compra:"));
            fin = JOptionPane.showConfirmDialog(null,"Desea agregar otro producto?");
            
        }while(fin == 0);
       
        JOptionPane.showMessageDialog(null, "El total a pagar será: " + precio * 0.8 + "$.");
        }
}