public class Main {




    public static void main(String[] args) {


        Incidente incidente1 = new Incidente("Servidor caido", 300, true);
        System.out.println(incidente1.calcularPrioridad());
        Incidente incidente2 = new Incidente("Servidor activo", 20, false);
        System.out.println(incidente2.calcularPrioridad());
        Incidente incidente3 = new Incidente("Servidor caido", 75, true);
        System.out.println(incidente3.calcularPrioridad());

        Incidente[] incidentes = {incidente1, incidente2, incidente3};
        int n = incidentes.length;

        for (int i = 0; i < n; i++) {
            System.out.println(incidentes[i].getTitulo() + " - " + incidentes[i].calcularPrioridad());
        }

        System.out.println("=== PRUEBAS DE VALIDACION ===");

        try{
            Incidente prueba = new Incidente("Error", -10, true);
            System.out.println("ERROR: acepto usuarios negativos");
        } catch (IllegalArgumentException e) {
            System.out.println("Prueba 1 OK: " + e.getMessage());
        }

        try {
            incidente1.setUsuariosAfectados(-500);
            System.out.println("ERROR: acepto usuarios negativos");
        } catch (IllegalArgumentException e) {
            System.out.println("Prueba 2 OK: " + e.getMessage());
        }

    }


}