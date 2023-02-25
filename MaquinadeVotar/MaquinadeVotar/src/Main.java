import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        HashMap<String, Integer> candidatos = new HashMap<String, Integer>();

        candidatos.put("Emilia TERREROS", 0);
        candidatos.put("Gerardo ESCODAR", 0);
        candidatos.put("María AGUAVIVA", 0);
        candidatos.put("Nadia LETUX", 0);

        int votacion;

        do {
            System.out.println("Elija entre:");
            System.out.println("1 - Emilia TERREROS");
            System.out.println("2 - Gerardo ESCODAR");
            System.out.println("3 - María AGUAVIVA");
            System.out.println("4 - Nadia LETUX");
            votacion = teclado.nextInt();
            switch (votacion) {
                case 1:
                    candidatos.put("Emilia TERREROS", candidatos.get("Emilia TERREROS") + 1);
                    System.out.println("ha votado");
                    break;
                case 2:
                    candidatos.put("Gerardo ESCODAR", candidatos.get("Gerardo ESCODAR") + 1);
                    System.out.println("ha votado");
                    break;
                case 3:
                    candidatos.put("María AGUAVIVA", candidatos.get("María AGUAVIVA") + 1);
                    System.out.println("ha votado");
                    break;
                case 4:
                    candidatos.put("Nadia LETUX", candidatos.get("Nadia LETUX") + 1);
                    System.out.println("ha votado");
                    break;
            }
        } while (votacion != 68753421);

        teclado.close();

        System.out.println("Resultados:");
        int totalVotos = 0;
        
        for (String candidato : candidatos.keySet()) {
            totalVotos += candidatos.get(candidato);
        }
        for (String candidato : candidatos.keySet()) {
            double porcentajeVotos = (candidatos.get(candidato) * 100.0) / totalVotos;
            System.out.println(candidato + ": " + String.format("%.2f", porcentajeVotos) + " %");
        }
    }
}
