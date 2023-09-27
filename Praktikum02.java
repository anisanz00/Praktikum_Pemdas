package praktikum2;
import java.util.Scanner;
public class soal2 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
 
  int f;
 
   System.out.print("Inputkan nilai");
   f = input.nextInt();
 
   String hasil = f % 2 ==0 ? "Genap" : "Ganjil";
 
   System.out.println(hasil); 
 }
}
