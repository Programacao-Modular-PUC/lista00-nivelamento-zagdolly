import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número para calcular o fatorial:\n");
        int numUser = scanner.nextInt();
        int fat = 1;
        int numAux = numUser;
        for(int i = 0; i < numAux; i++)
        {
            fat = fat * numUser;
            numUser--;        
        }

        System.out.println("Resultado: " + fat);
    }
}
