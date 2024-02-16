import java.util.Scanner;

public class EstudoAlgoritmos {

    public static void main(String args[]) {
        Scanner op = new Scanner(System.in);
        int[] meuVetor = new int[10];

        int i;


        do{
            int y=0;

            System.out.println("Digite a posição do vetor: ");
            i=op.nextInt();

            if(i != -1){
                System.out.println("Informe o valor da posição: "+ i +": ");
                y = op.nextInt();
            }

        }while(i>-1);
        for (i = 0; i <= meuVetor.length; i++) {
            System.out.println("Valor da posição encontrado: "+ i +" : "+meuVetor[i]);

            }
        }

    }



// public int AlgoritmoBuscaBinaria(){

// }
