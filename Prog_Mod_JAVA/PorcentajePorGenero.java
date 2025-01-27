import javax.swing.JOptionPane;

public class PorcentajePorGenero{
    public static void main(String [] args){
        int hombres, mujeres, total;
        hombres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de hombres:"));
        mujeres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de mujeres:"));
        total = hombres + mujeres;
        JOptionPane.showMessageDialog(null, "Total: "+ total +" \n Hombres: " + hombres*100/total + "%\n Mujeres: " + mujeres*100/total + "%");

    }
}