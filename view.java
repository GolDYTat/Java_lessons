import java.util.Scanner;
public class view {
    static Integer version() {
        Scanner iScanner = new Scanner (System.in);
        System.out.println("Введите 1, чтобы ввести значения вручную\nВведите 2, чтобы взятьт значения из файла:");
        int version = iScanner.nextInt();
        // iScanner.close();
        return version;
    }
    
    static Integer enterDigit() {
        Scanner iScanner = new Scanner (System.in);
        System.out.println("Введите число:");
        if(iScanner.hasNextInt() ){
            int d = iScanner.nextInt();
            return d;
        } else {
            int d = 0;
            return d;
        } 
    }
    
    static Integer enterPow() {
        Scanner iScanner = new Scanner (System.in);
        System.out.println("Введите степень:");
        if(iScanner.hasNextInt() ){
            int p = iScanner.nextInt();
            iScanner.close();
            return p;
        } else {
            int p = 0;
            iScanner.close();
            return p;
        }
    }
  
}
