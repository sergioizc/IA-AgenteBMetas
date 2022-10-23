public class Agente {
    private String objetivo;
    private int velocidad;

    public Agente(String obj, int vel) {
        this.objetivo = obj;
        this.velocidad = vel;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return velocidad;
    }
}
