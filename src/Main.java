/* 
public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.matricula = "abcde 254";
        coche.velocidadMaxima = 20;
        coche.setSonido("rummmm");
         System.out.println(coche.getsonido());

       /*  CocheElectrico cocheele = new CocheElectrico();
        cocheele.matricula = "xcva 263";
        cocheele.velocidadMaxima = 20;
        System.out.println(cocheele.compruebamatricula(
            "cxdz"
        )); */
        /*Vehiculo avion = new Vehiculo();
        avion.setTipo("volador");

        avion.setSonido("fuuuuummm");
       */
/*    }
} */
/* 
abstract  class Vehiculo { 
    String matricula;
    int velocidadMaxima;
    public String sonido;

    
   public boolean compruebamatricula ( String matricula) {
    if (matricula == "xxx") {
        return true;
    }
    return false;
   }

   public Vehiculo () {
    System.out.println("constructor");
   }
abstract public void setSonido (String sonido);
  abstract public String getsonido ();
}

class Coche extends Vehiculo {
     public void setSonido (String sonido) {
        this.sonido = sonido;
    }
     public String getsonido () {
        return this.sonido;
    }
}
class CocheElectrico extends Coche {} 
*/
/*class Vehiculo { 
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

    
    public void setSonido (String sonido){
        this.sonido = sonido;
    }
    public String getsonido ()  {
        return this.sonido;
     }

    public void setVelocidadMaxima (int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo; 
    }
    public String getTipo () {
        return this.tipo;
    }
}
*/

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.matricula = "abcde 254";
        coche.velocidadMaxima = 20;
        coche.setSonido("rummmm");
         System.out.println(coche.getsonido());

       /*  CocheElectrico cocheele = new CocheElectrico();
        cocheele.matricula = "xcva 263";
        cocheele.velocidadMaxima = 20;
        System.out.println(cocheele.compruebamatricula(
            "cxdz"
        )); */
        /*Vehiculo avion = new Vehiculo();
        avion.setTipo("volador");

        avion.setSonido("fuuuuummm");
       */
    }
}

abstract  class Vehiculo { 
    String matricula;
    int velocidadMaxima;
    public String sonido;

    
   public boolean compruebamatricula ( String matricula) {
    if (matricula == "xxx") {
        return true;
    }
    return false;
   }

   public Vehiculo () {
    System.out.println("constructor");
   }
abstract public void setSonido (String sonido);
  abstract public String getsonido ();
}

class Coche extends Vehiculo {
     public void setSonido (String sonido) {
        this.sonido = sonido;
    }
     public String getsonido () {
        return this.sonido;
    }
}
class CocheElectrico extends Coche {}
