import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
         int i  =in.nextInt();
        int k;
       k=1;
       k= k << i;
        a= a ^ k;



        System.out.println(a);




}

}
