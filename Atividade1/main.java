import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[3];
        int menor = 0, maior = 0;

        for(int i = 0; i < 3; i++)
        {
            vetor[i] = scanner.nextInt();
            if (i == 0) {
                menor = vetor[i];
                maior = vetor[i];
            }
            else {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
                if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);

        if (vetor[2] < vetor[0] && vetor[1] > vetor[0]) {
            System.out.println("Valor " + vetor[0] + " dentro do intervalo " + vetor[1] + " e " + vetor[2]);            
        } else{
            System.out.println("Valor " + vetor[0] + " fora do intervalo " + vetor[1] + " e " + vetor[2]);
        }

        
        if (vetor[0] % vetor[1] == 0) {
            System.out.println(vetor[0] + " é divisivel por " + vetor[1]);
        } else {
            System.out.println(vetor[0] + " não é divisivel por " + vetor[1]);
        }

        if (vetor[0] % vetor[2] == 0)
        {
            System.out.println(vetor[0] + " é divisivel por " + vetor[2]);
        } else {
            System.out.println(vetor[0] + " não é divisivel por " + vetor[2]);
        }   
    }
}
