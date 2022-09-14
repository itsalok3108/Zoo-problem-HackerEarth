import java.util.Scanner;
public class Approach1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        int zchar=0;
        int ochar=0;

        // For loop for counting the no. of z & o
       for (int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            if (a=='z')
                zchar++;
            if (a=='o')
                ochar++;
        }
       if (2*zchar==ochar)
        System.out.println("yes");
        else
           System.out.println("no");
    }
}
