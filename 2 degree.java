import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x1 = in.nextInt();
        int i = 2;

        if (x1 % 2 == 0 || x1 == 1)  {
            while(i < x1){
                i = i*2;
            }
            if (x1 == i || x1 == 1){
                out.println("YES");
            }else{
                out.println("NO");
            }

        }else{
            out.println("NO");
        }

        in.close();
        out.flush();
        out.close();
    }
}
