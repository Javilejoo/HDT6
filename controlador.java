public class controlador {
    vista vista = new vista();
    IFactory mifactory = new factory();
    

    public void controlador(){
        String opcion = vista.UseMap();
        IMaps miMapa = mifactory.crearMapa(opcion);
        miMapa.show();

    }
}
