import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name(Mg,Aung,Myo)");
        String name =sc.nextLine();

        switch (name){
            case "Mg" :
                System.out.println("This is Mg"); break;
            case "Aung":
                System.out.println("This is Aung"); break;
            case "Myo":
                System.out.println("This is Myo"); break;
            default:
                System.out.println(name + " is not exit");
        }
    }
}
