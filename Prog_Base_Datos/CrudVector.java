import javax.swing.JOptionPane;

public class CrudVector {

    static int[] vector = null; // Variable para almacenar el vector
    static int n; // Tamaño del vector

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Menu CRUD de Vector
                                                                  1. Crear vector
                                                                  2. Leer vector
                                                                  3. Actualizar vector
                                                                  4. Eliminar vector
                                                                  5. Salir
                                                                  Ingrese una opcion:"""));

            switch (opcion) {
                case 1 -> crearVector();
                case 2 -> leerVector();
                case 3 -> actualizarVector();
                case 4 -> eliminarVector();
                case 5 -> JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                default -> {
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                }
            }
        } while (opcion != 5);
    }

    public static void crearVector() {
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector:"));
        vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10) + 1;
        }
        JOptionPane.showMessageDialog(null, "Vector creado exitosamente.");
    }

    public static void leerVector() {
        if (vector == null) {
            JOptionPane.showMessageDialog(null, "El vector aún no ha sido creado.");
            return;
        }

        String datos = "Contenido del vector:\n";
        for (int i = 0; i < n; i++) {
            datos += vector[i] + " ";
        }

        JOptionPane.showMessageDialog(null, datos);
    }

    public static void actualizarVector() {
        if (vector == null) {
            JOptionPane.showMessageDialog(null, "El vector aún no ha sido creado.");
            return;
        }
    
        int opcionUpdate = Integer.parseInt(JOptionPane.showInputDialog("""
                Actualizar vector
                1. Modificar un valor
                2. Eliminar un valor
                3. Agregar un nuevo valor
                Ingrese una opción:"""));
    
        int posicion;
        switch (opcionUpdate) {
            case 1 -> {
                // Modificar un valor
                posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a modificar:"));
                if (posicion >= 0 && posicion < n) {
                    int nuevoValor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor:"));
                    vector[posicion] = nuevoValor;
                    JOptionPane.showMessageDialog(null, "Valor actualizado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Posición fuera de rango.");
                }
            }
    
            case 2 -> {
                 // Eliminar un valor
                posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar:"));
                if (posicion >= 0 && posicion < n) {
                    int[] nuevoVector = new int[n - 1];
                    for (int i = 0, j = 0; i < n; i++) {
                        if (i != posicion) {
                            nuevoVector[j++] = vector[i];
                        }
                    }
                    vector = nuevoVector;
                    n--;
                    JOptionPane.showMessageDialog(null, "Valor eliminado correctamente. El tamaño del vector ahora es: " + n);
                } else {
                    JOptionPane.showMessageDialog(null, "Posición fuera de rango.");
                }
                break;
            }
            case 3 -> {
                // Agregar un nuevo valor
                posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición para agregar el nuevo valor:"));
                int nuevoValor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor:"));
                if (posicion >= 0 && posicion <= n) {
                    int[] nuevoVector = new int[n + 1];
                    for (int i = 0, j = 0; i < n + 1; i++) {
                        if (i == posicion) {
                            nuevoVector[i] = nuevoValor;
                        } else {
                            nuevoVector[i] = vector[j++];
                        }
                    }
                    vector = nuevoVector;
                    n++;
                    JOptionPane.showMessageDialog(null, "Valor agregado correctamente. El tamaño del vector ahora es: " + n);
                } else {
                    JOptionPane.showMessageDialog(null, "Posición fuera de rango.");
                }
            }
    
            default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }
    
    public static void eliminarVector() {
        if (vector != null) {
            vector = null;
            JOptionPane.showMessageDialog(null, "El vector ha sido eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El vector ya está vacío (null), no es necesario eliminarlo.");
        }
    }
}