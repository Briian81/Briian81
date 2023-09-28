import java.util.*;

public class OddOrEven {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
int num1;

System.out.println("Please eneter a number to be determined whether it is even or odd: ");
num1 = scanner.nextInt();

if (num1 % 2 == 0)
System.out.println("The number is even! ");

else
System.out.println("The number is odd! ");

}
}
