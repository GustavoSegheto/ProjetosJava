import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        do{
        x = sc.nextInt();
        y = sc.nextInt();
        if(x == 1000000 || y == 1000000){
            break;
        }else{
        if(x > 0 && y > 0){
            System.out.println("primeiro");
        }else{
            if(x<0 && y>0){
                System.out.println("segundo");
            }else{
                if(x<0 && y<0){
                    System.out.println("terceiro");
                }else{
                    if(x>0 && y<0){
                        System.out.println("quarto");
                    }
                }
            }

        }
    }

        }while(x != 1000000 || y != 1000000);


    }
}
