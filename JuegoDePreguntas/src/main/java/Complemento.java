import java.util.Scanner;

public class Complemento {
    Scanner leer = new Scanner(System.in);
    Pregunta pregunta = new Pregunta();
    int aux = 0;
    String repuesta = "";


    public Boolean respuesta(int numero) {
        System.out.println("Digite A,B,C o D según sea la respuesta.");
        repuesta = leer.next().toUpperCase();

        

        if (repuesta.equals(pregunta.respuestas[numero])) {
            return true;
        }

        return false;
    }



    public int numeroAleatorio() {
        return (int) (Math.random() * 5 + 1);
    }


}
