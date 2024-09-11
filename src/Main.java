import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random diceNumber = new Random();
        int answer = diceNumber.nextInt(6) + 1;

        System.out.println("You rolled a:  "+ answer);
    }
}