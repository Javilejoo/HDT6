import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class HashMaps implements IMaps{
    vista vista = new vista();
    Scanner intscanner = new Scanner(System.in);
    private int comprar;
    String a;

    ArrayList<String> products = new ArrayList();
    HashMap<Integer,String> Categoria1 = new HashMap();
    HashMap<Integer,String> Categoria2 = new HashMap();
    HashMap<Integer,String> Categoria3 = new HashMap();
    HashMap<Integer,String> Categoria4 = new HashMap();
    HashMap<Integer,String> Categoria5 = new HashMap();
    HashMap<Integer,String> Categoria6 = new HashMap();
    HashMap<Integer,String> Categoria7 = new HashMap();

    
    public HashMaps() {
    Categoria1.put(1,"Mesas de jardín");
    Categoria1.put(2,"Sillas de jardín");
    Categoria1.put(3,"Conjuntos mesas y sillas de jardín");
    Categoria1.put(4,"Mesas de Ping Pong exteriores");
    Categoria2.put(1,"Cojines y colchonetas de masaje");
    Categoria2.put(2,"Sillones relax y sofás de masajes");
    Categoria2.put(3,"Sillones de masajes avanzados");
    Categoria2.put(4,"Sofás camas");
    Categoria3.put(1,"Cerveza tibetana Barley");
    Categoria3.put(2,"Té frio");
    Categoria3.put(3,"Coca cola 1 litro");
    Categoria3.put(4,"Coca cola 2 litros");
    Categoria4.put(1,"Sirope de regaliz");
    Categoria4.put(2,"Especies Cajun del chef");
    Categoria4.put(3,"Mezcla Gumbo del chef");
    Categoria5.put(1,"Peras secas");
    Categoria5.put(2,"Pasas");
    Categoria5.put(3,"Manzana roja");
    Categoria5.put(4,"Manzana verde");
    Categoria6.put(1,"Res");
    Categoria6.put(2,"Pollo");
    Categoria6.put(3,"Cerdo");
    Categoria6.put(4,"Camarones");
    Categoria6.put(5,"Pescados");
    Categoria7.put(1,"Queso de cabra");
    Categoria7.put(2,"Queso Manchego");
    Categoria7.put(3,"Leche descremada");
    Categoria7.put(4,"Leche deslactosadas");
    Categoria7.put(5,"Leche entera");
    
    }
    @Override
    public void show() {
        System.out.println("Hashmap");
        System.out.println("-----Mueble de terraza-----");
        for(String i: Categoria1.values()){
            System.out.println("Mueble de terraza | " +i);
        }
        System.out.println("-----Sillones de masaje-----");
        for(String i: Categoria2.values()){
            System.out.println("Sillones de masaje | " +i);
        }
        System.out.println("-----Bebidas-----");
        for(String i: Categoria3.values()){
            System.out.println("Bebidas | " +i);
        }
        System.out.println("-----Condimentos-----");
        for(String i: Categoria4.values()){
            System.out.println("Condimentos | " +i);
        }
        System.out.println("-----Frutas-----");
        for(String i: Categoria5.values()){
            System.out.println("Frutas | " +i);
        }
        System.out.println("-----Carnes-----");
        for(String i: Categoria6.values()){
            System.out.println("Carnes | " +i);
        }
        System.out.println("-----Lácteos-----");
        for(String i: Categoria7.values()){
            System.out.println("Lácteos | " +i);
        }
        
    }
    public void agregar(){
        int opcion = vista.categoria();
        int count = 1;
        
        switch(opcion){
            case 1:
            System.out.println("Que producto de esta categoria quiere comprar");
            for(String i: Categoria1.values()){
                System.out.println(count++  +"."  +i);
            }
            comprar = intscanner.nextInt();
            a = Categoria1.get(comprar);
            products.add(a);
            break;
            case 2:
            System.out.println("Que producto de esta categoria quiere comprar");
            for(String i: Categoria2.values()){
                System.out.println(count++  +"."  +i);
            }
            comprar = intscanner.nextInt();
            a = Categoria2.get(comprar);
            products.add(a);
            break;
            case 3:
            System.out.println("Que producto de esta categoria quiere comprar");
            for(String i: Categoria3.values()){
                System.out.println(count++  +"."  +i);
            }
            comprar = intscanner.nextInt();
            a = Categoria3.get(comprar);
            products.add(a);
            break;
            case 4:
            System.out.println("Que producto de esta categoria quiere comprar");
            System.out.println("Que producto de esta categoria quiere comprar");
            for(String i: Categoria4.values()){
                System.out.println(count++  +"."  +i);
            }
            comprar = intscanner.nextInt();
            a = Categoria4.get(comprar);
            products.add(a);
            break;
            case 5: 
            System.out.println("Que producto de esta categoria quiere comprar");
            for(String i: Categoria5.values()){
                System.out.println(count++  +"."  +i);
            }
            comprar = intscanner.nextInt();
            a = Categoria5.get(comprar);
            products.add(a);
            break;
            case 6:
            System.out.println("Que producto de esta categoria quiere comprar");
            for(String i: Categoria6.values()){
                System.out.println(count++  +"."  +i);
            }
            comprar = intscanner.nextInt();
            a = Categoria6.get(comprar);
            products.add(a);
            break;
            case 7:
            System.out.println("Que producto de esta categoria quiere comprar");
            for(String i: Categoria7.values()){
                System.out.println(count++  +"."  +i);
            }
            comprar = intscanner.nextInt();
            a = Categoria7.get(comprar);
            products.add(a);
            break;
            default: System.err.println("Debe escoger una categoria de 1-7");
        }
    }

    public void carrito(){
        System.out.println();
        System.out.println("Los productos agregados en su carrito son:");
        for(int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        System.out.println();
        
    }
    
}
