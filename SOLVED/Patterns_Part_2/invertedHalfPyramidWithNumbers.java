import java.util.Scanner;

public class invertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j <= n+1)){
                    System.out.print(num + " ");
                    num++;
                }
            }
            num = 1;
            System.out.println();
        }

        sc.close();
    }
}
