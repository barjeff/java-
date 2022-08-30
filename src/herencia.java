public class herencia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Juan"; 
        cliente.edad = 25;
        cliente.telefono = 1312325;
        cliente.credito = 67000;
        System.out.println(cliente.getNombre()); 
        System.out.println(cliente.getEdad()); 
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 250;
        System.out.println(trabajador.getSalario());
    }
    
}

class Persona {
    String nombre;
    int edad;
    int telefono; 

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre; 
    }
    public void setEdad (int edad) {
        this.edad = edad; 
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono (int telefono){
        this.telefono = telefono;
    }

    public int getTelefono (){
        return this.telefono;
    }
}
 class Cliente extends Persona {
    int credito;

    public void setCredito (int credito) {
        this.credito = credito; 
    }

    public int getCredito(){
        return this.credito;
    }
 }
class Trabajador extends Persona {
    int salario;

    public void setSalario (int salario){
        this.salario = salario;
    }
    public int getSalario (){
        return this.salario;
    }
    
    public Trabajador (){
        System.out.println("El salario del trabajador es");
    }
}