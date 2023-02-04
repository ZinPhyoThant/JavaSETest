import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num;
        System.out.print("Enter Number 1 to 3:");
        num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("This is One"); break;
            case 2:
                System.out.println("This is Two");break;
            case 3:
                System.out.println("This is Three");break;
            default:
                System.out.println(num+" is not exit");

        }
    }
}
