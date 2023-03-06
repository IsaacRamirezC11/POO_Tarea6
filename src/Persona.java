public class Persona {
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String genero;

    public Persona() {
        edad = 0;
        nombre = "";
        estatura = 0.0;
        peso = 0.0;
        genero = "";
    }

    public Persona(int edad, String nombre, double estatura, double peso, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void cambioGenero() {
        if (this.genero.equals("masculino")) {
            this.genero = "femenino";
        } else if (this.genero.equals("femenino")) {
            this.genero = "masculino";
        }
        System.out.println(nombre + " Se cambio el genero\n Ahors es: " + genero);
    }
    public void comer() {
        peso += 10;
        System.out.println(nombre + "  Se comio la mounstrosa y subio 10kg\n Ahora su peso es: " + peso + "kg");
    }

    public void Amputacion(){
        estatura -= 0.40;
        System.out.println(nombre + "  Le amputaron las dos piernas tras chocar el Automovil\n Ahora su estatura es: " + estatura + "m");

    }
}


