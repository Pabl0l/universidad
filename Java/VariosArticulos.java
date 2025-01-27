import javax.swing.JOptionPane;

public class VariosArticulos {
    public static void main(String[] args) {
        int i = 1, total = 0, cantidad, precio;
        String var, hayOtro = "si";
        while("si".equals(hayOtro)){
            var = JOptionPane.showInputDialog("Ingrese el precio del producto #" + i);
            precio = Integer.parseInt(var);
            var = JOptionPane.showInputDialog("Ingrese la cantidad de producto #" + i);
            cantidad = Integer.parseInt(var);
            hayOtro = JOptionPane.showInputDialog("Hay otro producto: si o no?");
            total +=  precio*cantidad;
            i += 1;
        }
        JOptionPane.showMessageDialog(null, "El total a pagar es: " + total + "$");
    }
}
