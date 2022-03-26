import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ListadoPregunta listadoPregunta = new ListadoPregunta();
        Scanner leer = new Scanner(System.in);
        Complemento complemento = new Complemento();
        Jugador jugador = new Jugador();

        int control = 0;
        int nivel = 1;
        int numeroAleatorio = 0;
        String participante = "";
        int monedas = 0;

        System.out.println("Juego bob el constructor");

        while (1 == 1) {
            while (control == 0) {
                if (participante.equals("")) {
                    System.out.println("Nombre Jugador");
                    participante = leer.next();
                }
                switch (nivel) {
                    case 1:

                        numeroAleatorio = complemento.numeroAleatorio();
                        listadoPregunta.categoriaUno(numeroAleatorio);
                        if (complemento.respuesta(numeroAleatorio) == true) {
                            System.out.println("Respuesta correcta");
                            nivel++;
                            monedas += 1000;
                            System.out.println("Excelente ganaste 1000 monedas");
                            System.out.println("Monedas: " + monedas);


                        } else {
                            System.out.println("Respuesta incorrecta");
                            control = 0;
                            participante = "";
                            jugador.imprimirPodio();
                        }


                        break;

                    case 2:
                        numeroAleatorio = complemento.numeroAleatorio();
                        listadoPregunta.categoriaDos(numeroAleatorio);
                        if (complemento.respuesta(numeroAleatorio) == true) {
                            System.out.println("Respuesta correcta");
                            nivel++;
                            monedas += 1000;
                            System.out.println("Excelente ganaste 1000 monedas");
                            System.out.println("Monedas: " + monedas);
                        } else {
                            System.out.println("Respuesta incorrecta");
                            control = 0;
                            participante = "";
                            jugador.imprimirPodio();
                        }

                        break;
                    case 3:
                        numeroAleatorio = complemento.numeroAleatorio();
                        listadoPregunta.categoriaTres(numeroAleatorio);
                        if (complemento.respuesta(numeroAleatorio) == true) {
                            System.out.println("Respuesta correcta");
                            nivel++;
                            monedas += 1000;
                            System.out.println("Excelente ganaste 1000 monedas");
                            System.out.println("Monedas: " + monedas);
                        } else {
                            System.out.println("Respuesta incorrecta");
                            control = 0;
                            participante = "";
                            jugador.imprimirPodio();
                        }

                        break;
                    case 4:

                        numeroAleatorio = complemento.numeroAleatorio();
                        listadoPregunta.categoriaCuatro(numeroAleatorio);
                        if (complemento.respuesta(numeroAleatorio) == true) {
                            System.out.println("Respuesta correcta");
                            nivel++;
                            monedas += 1000;
                            System.out.println("Excelente ganaste 1000 monedas");
                            System.out.println("Monedas: " + monedas);
                        } else {
                            System.out.println("Respuesta incorrecta");
                            control = 0;
                            participante = "";
                            jugador.imprimirPodio();
                        }
                        break;
                    case 5:
                        numeroAleatorio = complemento.numeroAleatorio();
                        listadoPregunta.categoriaFive(numeroAleatorio);
                        if (complemento.respuesta(numeroAleatorio) == true) {
                            System.out.println("Respuesta correcta");
                            nivel++;
                            monedas += 1000;
                            System.out.println("Excelente ganaste 1000 monedas");
                            System.out.println("Monedas: " + monedas);
                        } else {
                            System.out.println("Respuesta incorrecta");
                            control = 0;
                            participante = "";
                            jugador.imprimirPodio();
                        }
                        break;

                    default:
                        System.out.println("Felicitaciones, completo todos los niveles");
                        jugador.podio(participante, monedas);
                        jugador.imprimirPodio();
                        control = 0;
                        nivel = 1;
                        participante = "";
                        monedas = 0;
                        break;
                }

            }

        }
    }
}
