import javax.swing.JOptionPane;

public class MenorPrecio {
        public static void main(String[] args) {
        int cantidad, precio, minimo;
        String var;
        var = JOptionPane.showInputDialog("Ingrese la cantidad de productos");
        cantidad = Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Ingrese el precio del producto #1");
        precio = Integer.parseInt(var);
        minimo = precio;
        for(int i = 2; i<=cantidad;i++){
            var = JOptionPane.showInputDialog("Ingrese el precio del producto #" + i);
            precio = Integer.parseInt(var);
            if (precio<minimo) {
                minimo = precio;
            }
        }
        JOptionPane.showMessageDialog(null, "El precio menor es: " + minimo + "$");
    }
}
