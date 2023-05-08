import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NameGenerator nameGenerator = new NameGenerator();
        System.out.println("Welcome to the silly name generator!");
        System.out.print("Do you want a silly name? Yes or No: ");
        String sillyNameChoice = input.nextLine();
        if(sillyNameChoice.equalsIgnoreCase("Yes")){
            System.out.print("What is your name?: ");
            String userName = input.next();
            System.out.println(nameGenerator.GetSillyName(userName));
        } else {
            System.out.println("What are you doing here then? Get out of here!");
        }
    }
}