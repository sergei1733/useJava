package exception.exception2;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException {

        Scanner in = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(in.nextLine());

        if (x!=0){
            throw new ScannerException("Введен не ноль");
            }
        }


    }
}
