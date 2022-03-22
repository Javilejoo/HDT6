public class controlador {
    vista vista = new vista();
    IFactory mifactory = new factory();
    HashMaps hash = new HashMaps();
    public void controlador(){
        String opcion = vista.UseMap();
        IMaps miMapa = mifactory.crearMapa(opcion);
        boolean continuar = true;
        while(continuar){
        switch(opcion){
            case "hashmap":
            int opcion2 = vista.menuUsuario();
            switch(opcion2){
                case 1://agregar producto
                hash.agregar();
                break;
                case 2://Mostrar categoria del producto
                break;
                case 3://Categoria y cantidad de carrito
                hash.carrito();
                break;
                case 4://Categoria y cantidad ordenada en carrito
                break;
                case 5://Producto y categoria de todo el inventario
                hash.show();
                break;
                case 6://Producto y categoria de todo el inventario
                break;
                case 7://Salir
                continuar = false;
                System.exit(0);
                break;
                default:
                System.err.println("Debe escoger una opcion del 1-7");
            }
            break;
            case  "treemap":
            int opcion3 = vista.menuUsuario();
        switch(opcion3){
            case 1://agregar producto
            break;
            case 2://Mostrar categoria del producto
            break;
            case 3://Categoria y cantidad de carrito
            break;
            case 4://Categoria y cantidad ordenada en carrito
            break;
            case 5://Producto y categoria de todo el inventario
            break;
            case 6://Producto y categoria de todo el inventario
            break;
            case 7://Salir
            continuar = false;
            System.exit(0);
            break;
            default:
            System.err.println("Debe escoger una opcion del 1-7");
        }
            break;
            case "linkedhashmap":
        int opcion4 = vista.menuUsuario();
        switch(opcion4){
            case 1://agregar producto
            break;
            case 2://Mostrar categoria del producto
            break;
            case 3://Categoria y cantidad de carrito
            break;
            case 4://Categoria y cantidad ordenada en carrito
            break;
            case 5://Producto y categoria de todo el inventario
            break;
            case 6://Producto y categoria de todo el inventario
            break;
            case 7://Salir
            continuar = false;
            System.exit(0);
            break;
            default:
            System.err.println("Debe escoger una opcion del 1-7");
        }
            break;
            default:
            System.err.println("Debe escribir el mapa deseado (hashmap,treemap o linkedhashmap)");
        }
    }
        
    }
}
