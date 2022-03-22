public class factory implements IFactory{
    public final static String hashmap =  "hashmap";
    public final static String treemap =  "treemap";


    @Override
    public IMaps crearMapa(String opcion) {
        switch(opcion){
            case hashmap: return new HashMap();
            case treemap: return new TreeMaps();
            default: System.err.println("Escriba el nombre de mapa correctamente");
            return null;
        }
    }
    
}
