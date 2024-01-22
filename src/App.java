import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int mult2 = 0,mult3 = 0,mult4 = 0, mult5 = 0;

       for(int i = 0; i < a; i++){
        int num = sc.nextInt();

        if(num%2 == 0){
            mult2++;
        }if(num%3 == 0){
            mult3++;
        }if(num%4 == 0){
            mult4++;
        }if(num%5 == 0){
            mult5++;
        }
        
       }
       sc.close();

       System.out.println(mult2 +" Multiplo(s) de 2");
       System.out.println(mult3 +" Multiplo(s) de 3");
       System.out.println(mult4 +" Multiplo(s) de 4");
       System.out.println(mult5 +" Multiplo(s) de 5");
    }
}
