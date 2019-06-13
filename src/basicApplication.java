import java.util.Scanner;
public class basicApplication {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type number: ");
        int num = scan.nextInt();
        System.out.println(((num + 5) * 2) - 7 );
    }
}
