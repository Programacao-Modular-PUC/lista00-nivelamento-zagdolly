import java.util.*;

class main {
    public static void main(String[] args) {

        System.out.println("Informe o numero de matriculas do curso Programacao Modular:");
        Scanner scanner = new Scanner(System.in);
        int nProg = scanner.nextInt();
        System.out.println("Informe o numero de matriculas do curso Modelagem:");
        int nMode = scanner.nextInt();        

        int progMod[] = new int[nProg];
        int modelagem[] = new int[nMode];

        for(int i = 0; i < nProg; i++)
        {
            progMod[i] = scanner.nextInt();           
        }
        
        for(int i = 0; i < nMode; i++)
        {
            modelagem[i] = scanner.nextInt();
        }

        for(int i = 0; i < nProg; i++)
        {
            for(int j = 0; j < nMode; j++)
            {
                if(progMod[i] == modelagem[j])
                {
                    System.out.println("Matricula presente nos dois cursos: " + progMod[i]);
                }
            }
        }

    }
}
