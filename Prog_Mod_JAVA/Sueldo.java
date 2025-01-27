import javax.swing.JOptionPane;

public class Sueldo{
    public static void main(String [] args){
        double sueldoBase;
        sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo base:"));
       
        JOptionPane.showMessageDialog(null, "El sueldo total será: " + sueldoBase * 1.45 + "$.");
        // 0.45 = 0.15 + 0.15 + 0.15 = 3 ventas * 15% por cada venta.
    }
}