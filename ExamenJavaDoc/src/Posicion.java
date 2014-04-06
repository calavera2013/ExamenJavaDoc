
public class Posicion {

    private int x;
    private int y;


    public Posicion(){
        this.x=0;
        this.y=0;
    }

    public Posicion(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public String toString(){
        String cadena="";
        cadena="("+this.getX()+"),("+this.getY()+")";
        return cadena;
    }

    public void incrementarX(){
        this.setX(this.getX() + 1);
    }
    
    public void incrementarY(){
        this.setY(this.getY()+1);
    }
    
    public void decrementarX(){
        this.setX(this.getX() - 1);
    }
    
    public void decrementarY(){
        this.setY(this.getY()-1);
    }

    public void modificarPosicion(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public int[] obtenerPosicion(){
        int[] resultado = new int[2];
        resultado[0]=this.getX();
        resultado[1]=this.getY();
        return resultado;
    }

    public void copiarCoordenadas(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void copiarCoordenadas(Posicion posicion){
        this.setX(posicion.getX());
        this.setY(posicion.getY());
    }

}
