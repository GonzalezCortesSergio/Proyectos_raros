package componentes;

import java.util.Random;

public class Dado {

   public int tirarDados (int numCaras) {

       Random r = new Random(System.nanoTime());

       return r.nextInt(numCaras-1+1)+1;


   }
}
