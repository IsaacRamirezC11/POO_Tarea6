import java.awt.*;

public class AutomovilDriver {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Chevrolet", "Aveo", 2021, Color.GREEN, "Apagado");
        Automovil auto2 = new Automovil();
        auto2.setMarca("Mazda");
        auto2.setSubMarca("CX-5");
        auto2.setModelo(2020);
        auto2.setColor(Color.RED);
        auto2.setEstado("Encendido");

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

        auto1.encender();
        auto1.chocar();
        auto2.apagar();
    }
}
