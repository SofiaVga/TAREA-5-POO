import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        String move = "";
        int a;
        boolean entrada = true;

        String [][] parts ;
        parts = new String[3][3];
        do {
            entrada = true;
            //impresiones
            System.out.println("Introduzca la cadena: ");
            move = sc.nextLine();

            for (int i = 0; i < move.length(); i++) {
                char caracter = move.charAt(i);
                a = (int) caracter;
                if (a != 88 && a != 79 && a != 95){
                    entrada = false;
                }
            }
        }while(entrada == false);
        String[] caracteres = move.split("");
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                parts[i][j] = caracteres[k++];
            }
        }
        System.out.println("-----");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(parts[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-----");
    }
}