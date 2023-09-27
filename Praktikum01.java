package praktikum2;
import java.util.Scanner;
public class soal1 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
     int p;
     int l;
     int t;
   System.out.print("P : ");
   p = input.nextInt();
   System.out.print("L : ");
   l = input.nextInt();
   System.out.print("T : ");
   t = input.nextInt();
   int volume = p * l * t;
   System.out.println("Volume = " + volume);
 }
}
