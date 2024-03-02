package visual;

public class Componente {
    private String mensaje;

    public Componente(String nombre){
        this.mensaje = nombre;
    }
    public void mostrarMensaje(){
        System.out.println("Hola a todos me llamo....."+ this.mensaje);
    }
}
