public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(33);
        persona.setNombre("Alberto");
        persona.setTelefono("956000000");

        System.out.println("La persona se llama " + persona.getNombre() + " tiene "+ persona.getEdad() + " años y su teléfono es " + persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}