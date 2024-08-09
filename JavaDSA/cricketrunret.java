import java.util.Scanner;

public class cricketrunret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the run rate: ");
        double runrate = sc.nextDouble();
        int overs = 20;
        double totalrun = runrate * overs;

        System.out.printf("Total run scored in %d overs: %.2f\n",overs,totalrun);
        sc.close();


    }
}
