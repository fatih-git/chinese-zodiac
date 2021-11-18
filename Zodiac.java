import java.util.Scanner;

/**
 * @author fatih-git
 */

public class Zodiac {

    public static void main(String[] args) {

        int dogum;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz: ");
        dogum=input.nextInt();

        if(dogum%12==0){
            System.out.println("Çin burcunuz Maymun.");
        }
        else if(dogum%12==1){
            System.out.println("Çin burcunuz Horoz.");
        }
        else if(dogum%12==2){
            System.out.println("Çin burcunuz Köpek.");
        }
        else if(dogum%12==3){
            System.out.println("Çin burcunuz Domuz.");
        }
        else if(dogum%12==4){
            System.out.println("Çin burcunuz Fare.");
        }
        else if(dogum%12==5){
            System.out.println("Çin burcunuz Öküz.");
        }
        else if(dogum%12==6){
            System.out.println("Çin burcunuz Kaplan.");
        }
        else if(dogum%12==7){
            System.out.println("Çin burcunuz Tavşan.");
        }
        else if(dogum%12==8){
            System.out.println("Çin burcunuz Ejderha.");
        }
        else if(dogum%12==9){
            System.out.println("Çin burcunuz Yılan.");
        }
        else if(dogum%12==10){
            System.out.println("Çin burcunuz At.");
        }
        else if(dogum%12==11){
            System.out.println("Çin burcunuz Koyun.");
        }

    }

}
