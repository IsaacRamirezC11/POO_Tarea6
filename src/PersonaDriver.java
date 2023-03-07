public class PersonaDriver {
    public static void  main(String[] args){
        Persona per1 = new Persona();
        Persona per2 = new Persona(21, "Alan", 1.70,71.0, "masculino");
        per1.setEdad(18);
        per1.setNombre("Emiliano");
        per1.setEstatura(1.40);
        per1.setPeso(49.0);
        per1.setGenero("Masculino");
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        per1.Amputacion();
        per1.cambioGenero();
        per2.comer();
    }

}
