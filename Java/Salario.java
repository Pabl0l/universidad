import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        double salarioBruto, descuentos = 0.08, deducciones = 0.05;
        String var;
        do{
            var = JOptionPane.showInputDialog("Escriba su salario bruto");
            salarioBruto = Double.parseDouble(var);
            if(salarioBruto>0){
                JOptionPane.showMessageDialog(null, "El salario neto es: " + salarioBruto*(1-descuentos-deducciones) + "$");
            }
        }
        while(salarioBruto>0);
    }
}
