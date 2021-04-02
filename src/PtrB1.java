import java.util.Scanner;

public class PtrB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị số a : ");
        double a= scanner.nextDouble();
        System.out.println("Nhập giá trị số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị số c");
        double c=scanner.nextDouble();

        if(a!=0){
            double solution= -b/a;
            System.out.printf("The solution is : %f!", solution);
        }
        if (a!=0){
            double answer = (c-b)/a;
            System.out.println("The answer is :    ", answer);
        }else{
            System.out.println("Phương trình vô nghiệm");
        }

    }

}
