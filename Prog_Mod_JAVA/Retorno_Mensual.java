import javax.swing.JOptionPane;

public class Retorno_Mensual{
    public static void main(String [] args){
        double monto;

        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que desea invertir:"));

        JOptionPane.showMessageDialog(null, "El monto total después de un mes será: " + monto * 1.05 + "$. Con una ganancia de: " + monto * 0.05 + "$.");
    }
}