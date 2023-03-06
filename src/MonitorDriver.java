public class MonitorDriver {

public static void main(String[] args){

    Monitor pantalla1 = new Monitor(24.7, "AOC","24g2","LED", 4500.0,"Apagado");
    Monitor pantalla2 = new Monitor(23.8,"LG","Ultragear","LED",3591.46,"Encendido");
    pantalla2.setPulgadas(23.8);
    pantalla2.setMarca("LG");
    pantalla2.setModelo("Ultragear");
    pantalla2.setTipo("LED");
    pantalla2.setPrecio(3591.46);
    pantalla2.setEstado("Encendido");

    pantalla1.apagar();
    pantalla1.PantallaNegra();
    pantalla2.encender();
    }
}
