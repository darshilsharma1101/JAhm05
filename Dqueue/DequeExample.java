package Dqueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (deque.size() < 5) {
            System.out.print("Enter a number: ");
            try {
                int num = scanner.nextInt();

                if (num > 50) {
                    deque.add(num);
                    System.out.println("Number added");
                } else {
                    System.out.println("Number must be greater than 50.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard invalid input
            }
        }
        System.out.println("Deque: " + deque);
    }
}