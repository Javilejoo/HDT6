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
        System.out.println("");
        int opcion = intscanner.nextInt();
        return opcion;
    }

}

