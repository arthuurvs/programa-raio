import java.util.*;

public class Main {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Double raio, comprimento , area, volume;

       System.out.print("Indique o raio:");
       raio = entrada.nextDouble();


       comprimento = (2*Math.PI*raio);

           System.out.format("Seu comprimento é: %.2fcm%n", comprimento);

       area = Math.PI*Math.pow(raio,2);
       System.out.format("Sua area é: %.2fcm²%n", area);
       volume = 0.75 *  (Math.PI  * Math.pow(raio,3));
       System.out.format("Seu volume é: %.2fcm³%n", volume);
       }

   }



