public class Main {

    public static String calcularPrioridad(int usuarios, boolean servicioCaido) {

        if(servicioCaido && usuarios >= 100) {
            return "CRITICA";
        } else if(servicioCaido || usuarios >= 50) {
            return "ALTA";
        } else {
            return "BAJA";
        }
    }

    public static void main(String[] args) {
        System.out.println("===INCIDENTHUB===");
        System.out.println(calcularPrioridad(300, true));
        System.out.println(calcularPrioridad(20, true));
        System.out.println(calcularPrioridad(70, false));
        System.out.println(calcularPrioridad(5, false));
        System.out.println(calcularPrioridad(50, false));
    }

}