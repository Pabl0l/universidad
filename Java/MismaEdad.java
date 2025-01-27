public class MismaEdad {
        public static void main(String[] args) {
            mismaEdad(3,2,3);
        }
    
        public static void mismaEdad(int edad1, int edad2, int edad3) {
            if(edad1==edad2 && edad2 == edad3){
                System.out.println("Las personas tienen la misma edad");
                return;
            } else {
                if (edad1 == edad2){
                    System.out.println("La persona 1 y la persona 2 tienen la misma edad");
                    return;
                }
                if (edad2 == edad3){
                    System.out.println("La persona 2 y la persona 3 tienen la misma edad");
                    return;
                }
                if (edad1 == edad3){
                    System.out.println("La persona 1 y la persona 3 tienen la misma edad");
                    return;
                }
            }
            System.out.println("Las personas no son de la misma edad");
            }
}
