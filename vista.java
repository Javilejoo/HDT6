import java.util.Scanner;
public class vista {
    Scanner Stringscanner = new Scanner (System.in);
    Scanner intscanner = new Scanner(System.in);
    IFactory mifactory = new factory();
    
     public String UseMap(){
        System.out.println("Que tipo de mapa desea usar\nHashMap\nTreeMap\nLinkedHashMap");
        String opcion = Stringscanner.next().toLowerCase();
        return opcion;
    }

    public int menuUsuario(){
        System.out.println("Menu principal");
        System.out.println("1. Agregar producto\n2. Mostrar categoria del producto"+
        "\n3. Categoria y cantidad de carrito\n4. Categoria y cantidad ordenada en carrito"+
        "\n5. ver productos\n6. Producto y categoria de todo el inventario\n7. Salir");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    public int categoria(){
        System.out.println("Que categoria quiere comprar");
        System.out.println("1.Mueble de terraza\n2.Sillones de masaje\n3.Bebidas\n4.Condimentos\n5.Frutas\n6.Carnes\n7.Lácteos\n");
        int categoriao=intscanner.nextInt();
        return categoriao;
    }
    
}


