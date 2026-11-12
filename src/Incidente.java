public class Incidente {

    private String titulo;
    private int usuariosAfectados;
    private boolean servicioCaido;



    public Incidente(String titulo, int usuariosAfectados, boolean servicioCaido) {
            this.titulo = titulo;
            setUsuariosAfectados(usuariosAfectados);
            this.servicioCaido = servicioCaido;
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isServicioCaido() {
        return servicioCaido;
    }

    public void setServicioCaido(boolean servicioCaido) {
        this.servicioCaido = servicioCaido;
    }

    public int getUsuariosAfectados() {
        return usuariosAfectados;
    }

    public void setUsuariosAfectados(int usuariosAfectados) {
        if (usuariosAfectados >= 0) {
            this.usuariosAfectados = usuariosAfectados;
        } else {
            throw new IllegalArgumentException("Los usuarios no pueden ser negativos");
        }
    }

    public String calcularPrioridad() {
            if(servicioCaido && usuariosAfectados >= 100) {
            return "CRITICA";
        } else if(servicioCaido || usuariosAfectados >= 50) {
            return "ALTA";
        } else {
            return "BAJA";
        }
    }

}
