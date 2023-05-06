public class Tabla {
    Persona []T; 
    public Tabla(){
        this.T= new Persona[1000]; 
    }
    public int mitadCuadrado(int id){
        int cuadrado, p, seisint; 
        String claveString;
        String ultSeis;
         
         cuadrado= (int) Math.pow(id, 2); //calcula cuadrado
         claveString=String.valueOf(cuadrado); //paso a string
         ultSeis= claveString.substring(claveString.length() -6); //tomo ultimos 6 de la cadena
         seisint= Integer.parseInt(ultSeis); //paso a entero
         p= seisint/1000; //primeros 3 numeros 
        
        
        return p;
    }
    public void inserPer(Persona per){
        int pos;  
        pos=mitadCuadrado(per.id); 
        T[pos]=per; 
    } 
    public void muestraArr(){
        for(int i=0; i<T.length; i++){
            if(T[i]!=null){
                System.out.println("posicion: "+ i + "  Nombre de la persona:  " + T[i].getName() + " Su ID es: " + T[i]. getId());
            }
        }
    }
}
