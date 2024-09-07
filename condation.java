import java.util.Scanner;
public class condation {
    public static void main (String[] args){
        int age;

        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your age");
        age=Sc.nextInt();

        if (age>=18){
            System.out.println("yes you are able to do ");
        }

        else{
            System.out.println("no you are not able to do ");
        }
    }
}
