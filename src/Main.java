public class Main {
    public static void main(String[] args) {
    Coche newcocheBlue = new Coche();
    newcocheBlue.addpuertas();
    System.out.println(newcocheBlue.puertas);
    
    var valor =  suma(4,5,6);
        System.out.println(valor);
    }
    public static int suma ( int a, int b,int c) {
        return a + b + c;

    }
}



class Coche {
    public int  puertas = 5;

    public  void addpuertas() {
        this.puertas ++;
    }
} 