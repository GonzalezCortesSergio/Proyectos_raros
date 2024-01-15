import componentes.Dado;
import componentes.Jugador;

import java.util.Arrays;
import java.util.Scanner;

public class Juego {

    public static void main (String args[]) {

        //Variables
        String nombre, aux;
        int clase;
        double vida = 0, ataque = 0, inteligencia = 0, defensa = 0, velocidad = 0;

        //Instanciar Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("######                                                        ##       ######                                            \n" +
                "#     # #    # #    #  ####  ######  ####  #    #  ####      #  #      #     # #####    ##    ####   ####  #    #  ####  \n" +
                "#     # #    # ##   # #    # #      #    # ##   # #           ##       #     # #    #  #  #  #    # #    # ##   # #      \n" +
                "#     # #    # # #  # #      #####  #    # # #  #  ####      ###       #     # #    # #    # #      #    # # #  #  ####  \n" +
                "#     # #    # #  # # #  ### #      #    # #  # #      #    #   # #    #     # #####  ###### #  ### #    # #  # #      # \n" +
                "#     # #    # #   ## #    # #      #    # #   ## #    #    #    #     #     # #   #  #    # #    # #    # #   ## #    # \n" +
                "######   ####  #    #  ####  ######  ####  #    #  ####      ###  #    ######  #    # #    #  ####   ####  #    #  ####  ");

        System.out.println("----------------------------------------");
        System.out.println("Bienvenido usuario, introduzca su nombre");
        System.out.println("----------------------------------------");
        nombre = s.nextLine();

        System.out.println("De acuerdo " + nombre + " ¿qué clase quieres escoger?" );

        do {
            System.out.println("""
                    Opción 1:   Bárbaro
                    Opción 2:   Pícaro
                    Opción 3:   Cazador
                    Opción 4:   Bardo
                    Opción 5:   Druida
                    """);

            aux = s.nextLine();
            clase = Integer.parseInt(aux);

        }while (clase != 1 && clase != 2 && clase != 3 && clase != 4 && clase != 5);

        if (clase == 1) {

            vida = 15;
            ataque = 6;
            inteligencia = 4;
            defensa = 10;
            velocidad = 4;
        }

        if (clase == 2) {

            vida = 6;
            ataque = 10;
            inteligencia = 6;
            defensa = 4;
            velocidad = 15;
        }

        if (clase == 3) {

            vida = 7;
            ataque = 15;
            inteligencia = 8;
            defensa = 5;
            velocidad = 9;
        }

        if (clase == 4) {

            vida = 5;
            ataque = 5;
            inteligencia = 15;
            defensa = 4;
            velocidad = 15;
        }

        if (clase == 5) {

            vida = 6;
            ataque = 2;
            inteligencia = 17;
            defensa = 4;
            velocidad = 10;
        }

        Jugador j = new Jugador (nombre, clase, vida, ataque, inteligencia, defensa, velocidad);

        System.out.println(j);

        System.out.println("Te vas a ver inmerso en una gran aventura. Prepárate");

        System.out.println("Te encuentras con un trasgo");

        Dado d = new Dado ();

        System.out.println("Haces una tirada de dados");

        if (d.tirarDados(20) == 20) {

            System.out.println("Has matado de un sólo golpe al trasgo");
        }
        else if (d.tirarDados(20) < 20 && d.tirarDados(20) > 10) {

            j.setVida(j.getVida() - 1);
            System.out.println("Has perdido algo de vida " + j.getVida() + " pero conseguiste matar al trasgo");
        }

        else if (d.tirarDados(20) < 10 && d.tirarDados(20) > 5) {

            j.setVida(j.getVida() / 2);

            System.out.println("Has perdido la mitad de tu vida " + j.getVida() + " pero conseguiste matar al trasgo");
        }

        else if (d.tirarDados(20) <= 5){

            j.setVida (0);

            System.out.println("Has perdido toda tu vida "+ j.getVida() + " has muerto");
        }
    }
}
