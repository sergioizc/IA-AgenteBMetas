package Modelo;
public class Agente {
    Entorno objEntorno = new Entorno();
    private String objetivo;
    private int velocidad;
    String rutas;

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
    
    public String whatIF(){
        String rutasx ="perdido";
        if(objEntorno.buscaR(1, objetivo)){
            rutasx="T1";        
        }
        else 
        if(objEntorno.buscaR(2, objetivo)){
            rutasx="T2";        
        }
        else 
        if(objEntorno.buscaR(3, objetivo)){
            rutasx="T3";        
        }
        else 
        if(objEntorno.buscaR(4, objetivo)){
            rutasx="T4";        
        }

        return rutasx;
    }
     public double actualizarEstado(String estadop, String accion, double percepcion){
        double distancia=0;
        System.out.println("conduciendo por "+estadop+" la acción: "+accion+", percepción(tiempo): "+percepcion);
        distancia = objEntorno.distancia(percepcion, velocidad);
        return distancia;
     }
     public boolean accion(double distancia){
        System.out.println("conduciendo hacia "+objetivo+" por "+ rutas);
        if((distancia>=objEntorno.getDT1()) && (objetivo.equals(objEntorno.getObj1()))){
            System.out.println("Llegón al Destino");
            return false;
        }if((distancia>=objEntorno.getDT1()) && (objetivo.equals(objEntorno.getObj2()))){
            System.out.println("Llegón al Destino");
            return false;
        }
        if((distancia>=objEntorno.getDT2()) && (objetivo.equals(objEntorno.getObj3()))){
            System.out.println("Llegón al Destino");
            return false;
        }if((distancia>=objEntorno.getDT3()) && (objetivo.equals(objEntorno.getObj4()))){
            System.out.println("Llegón al Destino");
            return false;
        }if((distancia>=objEntorno.getDT4()) && (objetivo.equals(objEntorno.getObj5()))){
            System.out.println("Llegón al Destino");
            return false;
        }
        return true;
     }
}
