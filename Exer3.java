import java.util.Scanner;
public class Exer3{
    public static void main(String args[]){

        Scanner x = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = x.nextInt();

        for (int n=1; n<=a; n++){
            for (int i=1; i<=n; i++){
                System.out.print(n*i+" ");
            }
        }
    }
}