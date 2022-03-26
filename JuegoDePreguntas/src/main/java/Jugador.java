public class Jugador {
    String jugador[] = {"", "", "", "", "", "", "", "", "", ""};
    int puntaje[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


    public void imprimirPodio() {

        for (int i = 0; i < 10; i++) {
            if (puntaje[i] != 0) {
                System.out.println("Puesto: " + (i + 1) + "  Jugador: " + jugador[i] + "  Puntaje: " + puntaje[i]);
            }


        }

    }

    public void podio(String participante, int puntajeActual) {

        for (int i = 0; i <= 9; i++) {

            if (jugador[i].equals(participante)) {
                puntaje[i] = puntaje[i] + puntajeActual;
                ordenar();
            }
        }

        if (existeJugador(participante) == false){

                jugador[9] = participante;
                puntaje[9] = puntajeActual;
                ordenar();

        }



    }

    public boolean existeJugador(String aux){
        for (int i = 0; i <= 9; i++) {

            if (jugador[i].equals(aux)) {
              return true;
            }
        }

        return false;
    }


    public void ordenar() {


        for (int x = 0; x < puntaje.length; x++) {
            for (int i = 0; i < puntaje.length - x - 1; i++) {
                if (puntaje[i] < puntaje[i + 1]) {

                    int tmp = puntaje[i + 1];
                    String aux = jugador[i + 1];


                    puntaje[i + 1] = puntaje[i];
                    jugador[i + 1] = jugador[i];


                    puntaje[i] = tmp;
                    jugador[i] = aux;
                }
            }

        }

    }


}
