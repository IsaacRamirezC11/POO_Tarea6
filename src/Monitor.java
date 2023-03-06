public class Monitor {

    private  double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;
    private String estado;


    public Monitor(double pulgadas, String marca, String modelo, String tipo, double precio, String estado) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", estado='" + estado + '\'' +
                '}';
    }

    public void encender(){
    estado = "Encendido...";
    System.out.println(" El monitor se esta encendiendo\n Estado del monitor: " + estado);
    }
    public void apagar(){
    estado = "Apagado...";
        System.out.println(" El monitor se apago\n Estado del monitor: " + estado);
    }
    public void PantallaNegra(){
     estado = "Perdio señal";
        System.out.println("El monitor dio un pantallazo\n Estado del monitor: " + estado);
    }
}



