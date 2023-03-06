public class PerroDriver {
    public static void main(String[] args){
        Perro Dog = new Perro("Pug", "Frank");
        System.out.println(Dog.getNombre());
        System.out.println(Dog.getEspecie());
        System.out.println(Dog.ladrar());
        System.out.println(Dog.hacerDelBanio());
    }
}