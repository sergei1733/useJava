package exception.exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args){
        File file = new File("C:\\Users\\h\\Desktop\\Новая папка\\1.txt");
        Scanner scanner  = null;
        try {
            scanner = new Scanner(file);
            System.out.println(scanner.next());
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }

        //----------------------------------------
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("not file");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\h\\Desktop\\Новая папка\\1.txt");
        Scanner scanner  = new Scanner(file);
        System.out.println(scanner.next());
    }
}
