import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Iniciamos una instancia de la clase escanner.
        Scanner scanner = new Scanner(System.in);


        // Iniciamos las variables, declaramos intentos , los max y la palabra secreta. Iniciamos centinela de adivinado a falso.
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Creamos un array de carácteres que contiene la longitud de carácteres de la palabra secreta.
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos<intentosMaximos) {

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra por favor: ");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;


            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {

                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    
                }

                
            }

            if (!letraCorrecta) {
                    intentos++;
                    System.err.println("Incorrecto, te quedan " + (intentosMaximos - intentos) + " intentos");
                }

                if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                    palabraAdivinada = true;
                    System.out.print("Felicidades, adivinaste la palbara: " + palabraSecreta);
                    System.out.println(". Te costó " + (intentos) + " Intentos");
                }

            


            
        }
        if(!palabraAdivinada){
                System.out.println("Te quedaste sin intentos. Game over bby");

            }

            scanner.close();
    }
}