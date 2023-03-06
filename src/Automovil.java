import java.awt.*;

public class Automovil {

    private String marca;
    private String subMarca;
    private int modelo;//2000 + byte
    private Color color;
    private String estado;

    public Automovil() {
        marca = "";
        subMarca = "";
        modelo = 0;
        color = Color.GREEN;
        estado = "";
    }

    public Automovil(String marca, String subMarca, int modelo, Color color, String estado) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                ", estado='" + estado + '\'' +
                '}';
    }
    public void encender(){
        estado = "Encendido...";
        System.out.println("El Automovil se esta encendiendo\n Estado de tu Automovil: " + estado );
    }
    public void apagar(){
        estado = "Apagado...";
        System.out.println("El Automovil se apago\n Estado de tu Automovil: " + estado);
    }
    public void chocar(){
        estado = "Chocado... R.I.P. Automovil";
        System.out.println("El Automvil acelero en exceso en una curva\n Estado de tu Automovil: " + estado);
    }
}


