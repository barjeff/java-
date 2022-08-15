public class Main {
    public static void main(String[] args) {
    
    int numeroIf  = 5;

    if (numeroIf > 0) {
        System.out.println(numeroIf);
    } else if (numeroIf < 0) {
        System.out.println(numeroIf);
    } else if (numeroIf == 0) {
        System.out.println(numeroIf);
    }
  
    int  numeroWhile = 3;
    while ( numeroWhile < 3) {
        numeroWhile =  numeroWhile + 1;
        System.out.println( numeroWhile);
    }


    int  numberoDoWhile = 3;
    do {
        numberoDoWhile = numberoDoWhile + 1;
    }  while (numberoDoWhile < 4);

    for (int numeroFor = 0; numeroFor <=3; numeroFor = numeroFor + 1) {
        System.out.println(numeroFor);
    }

    int values[] = new int [5];

    for (int i = 0; i < values.length; i++ ) {
        System.out.println(values);
    }
    var estacion = "otoño";
    switch (estacion) {
        case "invierno":
            
            break;
        case "verano":
            
            break;
        case "otoño":
        System.out.println("es: otoño" );
            break;
        default:
        System.out.println("La contamincacion ambientas acabo con las estaciones" );
            break;
    }
    }
}



