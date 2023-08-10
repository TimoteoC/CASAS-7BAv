public class Componente {
	private String nombre;
	private float valor;
	private String unidad;
	private int frecuencia;
	//construcctores
	
	//accessors
	public void setNombre(String pNom){
		nombre = pNom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setValor(float pVal){
        valor = pVal;
    }
    public float getValor(){
        return valor;
    }
    public void setUnidad(String pUni){
        unidad = pUni;
    }
    public String getUnidad(){
        return unidad;
    }
    public void setFrecuencia(int pFre){
        frecuencia = pFre;
    }
    public int getFrecuencia(){
        return frecuencia;
    }

	
	//negocio
	
}
