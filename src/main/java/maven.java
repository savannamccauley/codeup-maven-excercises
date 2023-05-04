import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class maven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter a String: ");
        input = scanner.nextLine();

        boolean isNumber= StringUtils.isNumeric(input);
        if(isNumber){
            System.out.println(input + "is a number");
        }else{
            System.out.println(input + "is not a number");
            String flippedCase = StringUtils.swapCase(input);
            System.out.println("Flipped: " + flippedCase);
            String reversed = StringUtils.reverse(input);
            System.out.println("Reversed: " + reversed);
        }


    }
}
