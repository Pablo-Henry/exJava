import java.util.Scanner;

public class NumMaior {
    static void main(String[] args) {
        int num1, num2, num3, maiorNum;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);


            System.out.println("Informe 3 números");
            num1 = sc.nextInt();
            num2 = sc2.nextInt();
            num3 = sc3.nextInt();

            if (num1 > num2 && num1 > num3){
                maiorNum = num1;
            } else if (num2 > num1 && num2 > num3) {
                maiorNum = num2;
            } else {
                maiorNum = num3;
            }

        System.out.println("Maior número: " + maiorNum);
    }
}
