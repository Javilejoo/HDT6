public class factory implements IFactory{
    public final static String hashmap =  "hashmap";
    public final static String treemap =  "treemap";
    public final static String linkedhashmap = "linkedhashmap";


    @Override
    public IMaps crearMapa(String opcion) {
        switch(opcion){
            case hashmap: return new HashMaps();
            case treemap: return new TreeMaps();
            case linkedhashmap: return new LinkedHashMap();
            default: System.err.println("Escriba el nombre de mapa correctamente");
            return null;
        }
    }
    
}
