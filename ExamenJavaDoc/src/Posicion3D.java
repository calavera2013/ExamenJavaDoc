
public class Posicion3D extends Posicion{
	
	private int z;

	public Posicion3D(int z) {
		super();
		this.z = 0;
	}

	public Posicion3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void incrementarZ(){
        this.setZ(this.getZ() + 1);
    }
	
    public void decrementarZ(){
        this.setZ(this.getZ()-1);
    }
    
    public int[] obtenerPosicion3D(){
        int[] resultado = new int[3];
        resultado[0]=this.getX();
        resultado[1]=this.getY();
        resultado[2]=this.getZ();
        return resultado;
    }
	
    public String toString(){
        String cadena="";
        cadena="("+this.getX()+","+this.getY()+","+this.getZ()+")";
        return cadena;
    }
	
}
