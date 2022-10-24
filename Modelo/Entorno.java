package Modelo;
public class Entorno {
    public static final String getT1 = null;
    String []objetivos={ "A","B","C","D","E"};
    String []T1={objetivos[0],objetivos[1],"80"};
    String []T2={objetivos[2],"10"};
    String []T3={objetivos[3],"70"};
    String []T4={objetivos[4],"30"};

    public double distancia(double t, double v){
        return (v*t)/3600;
    }
    public boolean buscaRuta(String T[], String buscando){
        for(int i = 0;i<T.length;i++){
            if(T[i].equals(buscando)){
                return(true);
            }
        }
        return (false);
    }
    public boolean buscaR (int ruta, String buscado){
        boolean encontrado = false;
        switch(ruta){
            case 1:
                encontrado = buscaRuta(T1,buscado);
                break;

            case 2:
                encontrado = buscaRuta(T2,buscado);
                break;

            case 3:
                encontrado = buscaRuta(T3, buscado);
                break;

            case 4:
                encontrado = buscaRuta(T4,buscado);
                break;
        }
        return encontrado;
    }
    public double getDT1(){
        return Double.parseDouble(T1[2]);
    }
    public double getDT2(){
        return Double.parseDouble(T2[1]);
    }
    public double getDT3(){
        return Double.parseDouble(T3[1]);
    }
    public double getDT4(){
        return Double.parseDouble(T4[1]);
    }
    public String getObj1(){
        return (objetivos[0]);
    }
    public String getObj2(){
        return (objetivos[1]);
    }
    public String getObj3(){
        return (objetivos[2]);
    }
    public String getObj4(){
        return (objetivos[3]);
    }
    public String getObj5(){
        return(objetivos[4]);
    }
}

