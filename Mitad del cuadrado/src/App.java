public class App {
    public static void main(String[] args) throws Exception {
       Persona p1, p2, p3; 
       Tabla tablaHash=new Tabla(); 
       
       p1= new Persona("Cande",  17657); 
       p2= new Persona("Nahir",  17865); 
       p3= new Persona("Pedernera",  17926); 
       tablaHash.inserPer(p1);
       tablaHash.inserPer(p2);
       tablaHash.inserPer(p3);
       tablaHash.muestraArr();


    }
}
