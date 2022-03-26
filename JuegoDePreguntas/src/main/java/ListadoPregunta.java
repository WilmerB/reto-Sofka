public class ListadoPregunta {
    Pregunta pregunta = new Pregunta();

    public void categoriaUno(int numero){
        System.out.println("Preguntas basadas en la planeación de una construcción");
        switch (numero) {
            case 1:
                System.out.println(pregunta.getPreguntaUno());
                System.out.println(pregunta.getrPUB());
                System.out.println(pregunta.getrPUMU());
                System.out.println(pregunta.getrPUMD());
                System.out.println(pregunta.getrPUMT());
                break;
            case 2:
                System.out.println(pregunta.getPreguntaDos());
                System.out.println(pregunta.getrPDMU());
                System.out.println(pregunta.getrPDB());
                System.out.println(pregunta.getrPDMD());
                System.out.println(pregunta.getrPDMT());
                break;

            case 3:
                System.out.println(pregunta.getPreguntaTres());

                System.out.println(pregunta.getrPTMU());
                System.out.println(pregunta.getrPTMD());
                System.out.println(pregunta.getrPTMT());
                System.out.println(pregunta.getrPTB());
                break;


            case 4:
                System.out.println(pregunta.getPreguntaCuatro());
                System.out.println(pregunta.getrPCB());
                System.out.println(pregunta.getrPCMU());
                System.out.println(pregunta.getrPCMD());
                System.out.println(pregunta.getrPCMT());
                break;

            case 5:
                System.out.println(pregunta.getPreguntafive());
                System.out.println(pregunta.getrPFMU());
                System.out.println(pregunta.getrPFMD());
                System.out.println(pregunta.getrPFB());
                System.out.println(pregunta.getrPFMT());
                break;




        }

    }


    public void categoriaDos(int numero){
        System.out.println("Ejecución de la obra");
        switch (numero) {
            case 1:
                System.out.println(pregunta.getPreguntaUnoD());
                System.out.println(pregunta.getrPUBD());
                System.out.println(pregunta.getrPUMUD());
                System.out.println(pregunta.getrPUMDD());
                System.out.println(pregunta.getrPUMTD());
                break;
            case 2:
                System.out.println(pregunta.getPreguntaDosD());
                System.out.println(pregunta.getrPDMUD());
                System.out.println(pregunta.getrPDBD());
                System.out.println(pregunta.getrPDMDD());
                System.out.println(pregunta.getrPDMTD());
                break;

            case 3:
                System.out.println(pregunta.getPreguntaTresD());
                System.out.println(pregunta.getrPTMTD());
                System.out.println(pregunta.getrPTMUD());
                System.out.println(pregunta.getrPTMDD());
                System.out.println(pregunta.getrPTBD());
                break;


            case 4:
                System.out.println(pregunta.getPreguntaCuatroD());
                System.out.println(pregunta.getrPCBD());
                System.out.println(pregunta.getrPCMUD());
                System.out.println(pregunta.getrPCMDD());
                System.out.println(pregunta.getrPCMTD());
                break;

            case 5:
                System.out.println(pregunta.getPreguntafiveD());
                System.out.println(pregunta.getrPFMUD());
                System.out.println(pregunta.getrPFMDD());
                System.out.println(pregunta.getrPFBD());
                System.out.println(pregunta.getrPFMTD());
                break;
        }


    }

    public void categoriaTres(int numero){
        System.out.println("Instalaciones eléctricas");
        switch (numero) {
            case 1:
                System.out.println(pregunta.getPreguntaUnoT());
                System.out.println(pregunta.getrPUBT());
                System.out.println(pregunta.getrPUMUT());
                System.out.println(pregunta.getrPUMDT());
                System.out.println(pregunta.getrPUMTT());
                break;
            case 2:
                System.out.println(pregunta.getPreguntaDosT());
                System.out.println(pregunta.getrPDMUT());
                System.out.println(pregunta.getrPDBT());
                System.out.println(pregunta.getrPDMDT());
                System.out.println(pregunta.getrPDMTT());
                break;

            case 3:
                System.out.println(pregunta.getPreguntaTresT());
                System.out.println(pregunta.getrPTMUT());
                System.out.println(pregunta.getrPTMDT());
                System.out.println(pregunta.getrPTMTT());
                System.out.println(pregunta.getrPTBT());
                break;


            case 4:
                System.out.println(pregunta.getPreguntaCuatroT());

                System.out.println(pregunta.getrPCBT());
                System.out.println(pregunta.getrPCMUT());
                System.out.println(pregunta.getrPCMDT());
                System.out.println(pregunta.getrPCMTT());
                break;

            case 5:
                System.out.println(pregunta.getPreguntafiveT());
                System.out.println(pregunta.getrPFMUT());
                System.out.println(pregunta.getrPFMDT());
                System.out.println(pregunta.getrPFBT());
                System.out.println(pregunta.getrPFMTT());
                break;




        }

    }
    public void categoriaCuatro(int numero){
        System.out.println(" instalaciones hidrosanitarias");
        switch (numero) {
            case 1:
                System.out.println(pregunta.getPreguntaUnoC());
                System.out.println(pregunta.getrPUBC());
                System.out.println(pregunta.getrPUMUC());
                System.out.println(pregunta.getrPUMDC());
                System.out.println(pregunta.getrPUMTC());
                break;
            case 2:
                System.out.println(pregunta.getPreguntaDosC());
                System.out.println(pregunta.getrPDMUC());
                System.out.println(pregunta.getrPDBC());
                System.out.println(pregunta.getrPDMDC());
                System.out.println(pregunta.getrPDMTC());
                break;

            case 3:
                System.out.println(pregunta.getPreguntaTresC());
                System.out.println(pregunta.getrPTMUC());
                System.out.println(pregunta.getrPTMDC());
                System.out.println(pregunta.getrPTMTC());
                System.out.println(pregunta.getrPTBC());
                break;


            case 4:
                System.out.println(pregunta.getPreguntaCuatroC());
                System.out.println(pregunta.getrPCBC());
                System.out.println(pregunta.getrPCMUC());
                System.out.println(pregunta.getrPCMDC());
                System.out.println(pregunta.getrPCMTC());
                break;

            case 5:
                System.out.println(pregunta.getPreguntafiveC());
                System.out.println(pregunta.getrPFMUC());
                System.out.println(pregunta.getrPFMDC());
                System.out.println(pregunta.getrPFBC());
                System.out.println(pregunta.getrPFMTC());
                break;




        }

    }
    public void categoriaFive(int numero){
        System.out.println("Conceptos técnicos");
        switch (numero) {
            case 1:
                System.out.println(pregunta.getPreguntaUnoF());
                System.out.println(pregunta.getrPUBF());
                System.out.println(pregunta.getrPUMUF());
                System.out.println(pregunta.getrPUMDF());
                System.out.println(pregunta.getrPUMTF());
                break;
            case 2:
                System.out.println(pregunta.getPreguntaDosF());
                System.out.println(pregunta.getrPDMUF());
                System.out.println(pregunta.getrPDBF());
                System.out.println(pregunta.getrPDMDF());
                System.out.println(pregunta.getrPDMTF());
                break;

            case 3:
                System.out.println(pregunta.getPreguntaTresF());
                System.out.println(pregunta.getrPTMUF());
                System.out.println(pregunta.getrPTMDF());
                System.out.println(pregunta.getrPTMTF());
                System.out.println(pregunta.getrPTBF());
                break;


            case 4:
                System.out.println(pregunta.getPreguntaCuatroF());
                System.out.println(pregunta.getrPCBF());
                System.out.println(pregunta.getrPCMUF());
                System.out.println(pregunta.getrPCMDF());
                System.out.println(pregunta.getrPCMTF());
                break;

            case 5:
                System.out.println(pregunta.getPreguntafiveF());
                System.out.println(pregunta.getrPFMUF());
                System.out.println(pregunta.getrPFMDF());
                System.out.println(pregunta.getrPFBF());
                System.out.println(pregunta.getrPFMTF());
                break;




        }

    }

}