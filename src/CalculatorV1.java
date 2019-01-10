import java.math.BigInteger;
import java.util.Scanner;

public class CalculatorV1 {
    Scanner scanner = new Scanner(System.in);

    int numberFromUser1;

    public static void main(String[] args) {
        CalculatorV1 calculatorv2 = new CalculatorV1();
        calculatorv2.printMenu();
    }

    private void printMenu() {
        do {
            System.out.println("Calculate v.2");
            System.out.println("1 - Add [+]");
            System.out.println("2 - Substring [-]");
            System.out.println("3 - Multiply [*]");
            System.out.println("4 - Division [/]");
            System.out.println("5 - Exponentiation [^]");
            System.out.println("6 - Factorial [!]");
            System.out.println("7 - Exit");

            parseUserChoice(getNumberFromUser());

        } while (true);
    }

    private int getNumberFromUser() {
        System.out.println("Your choice:");
        return scanner.nextInt();
    }
    private int getNumber(){
        System.out.println("Podaj pierwszą liczbe:");
        return scanner.nextInt();
    }
    private int getNumberTwo(){
        System.out.println("Podaj drugą liczbe:");
        return scanner.nextInt();
    }

    private void parseUserChoice(int userChoice) {

        switch (userChoice) {
            case 1: {
                print(add(getNumber(), getNumberTwo()));
                break;
            }
            case 2: {
                print(substring(getNumber(),getNumberTwo()));
                break;
            }
            case 3: {
                print(multiply(getNumber(), getNumberTwo()));
                break;
            }
            case 4: {
                print(division(getNumber(),getNumberTwo()));
                break;
            }
            case 5:{
                print(exponentiation(getNumber(),numberFromUser1));
                break;
            }
            case 6:{
                System.out.println("Result: " + factorial());
                break;

            }
            case 7: {
                System.out.println("The end.");
                System.exit(0);
                break;
            }
            default:
                System.out.println("There is no such choice. Try again...");
                break;
        }

    }

    private int add(int numberFromUser, int numberFromUser1) {
        return numberFromUser + numberFromUser1;
    }
    private int substring(int numberFromUser, int numberFromUser1) {
        return numberFromUser - numberFromUser1;
    }
    private int multiply(int numberFromUser, int numberFromUser1) {
        return numberFromUser * numberFromUser1;
    }
    private int division(int numberFromUser, int numberFromUser1) {
        return numberFromUser / numberFromUser1;
    }
    private int exponentiation(int numberFromUser, int numberFromUser1) {
        System.out.println("To which power ? ");
        numberFromUser1 = scanner.nextInt();

        int result = numberFromUser;

        for (int i = 0; i < numberFromUser1; i++) {
            result *= numberFromUser;
            break;
        }
        return result;
    }

    private BigInteger factorial() {
        System.out.println("podaj liczbe: ");
        numberFromUser1 = scanner.nextInt();
        BigInteger sum =  BigInteger.ONE;

        for (int i = 2; i <= numberFromUser1; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

    private void print(int result) {
        //JOptionPane.showMessageDialog(null,String.valueOf(result));
        System.out.println("Result: " + result);
    }
}
