/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasi2nombor;

/**
 *
 * @author Noor Aiman
 */
import java.util.Scanner;
public class Operasi2Nombor {
    public static void main(String[]args) {
    Scanner input=new Scanner(System.in);
    double plus;
    double minus;
    double time;
    double divide;
    
   System.out.print("Masukkan no pertama :");
   double no1=input.nextDouble();
   
   System.out.print("Masukkan no kedua :");
   double no2=input.nextDouble();
   
   plus = no1+no2;
   minus = no1-no2;
   time = no1*no2;
   divide = no1/no2;
   
   System.out.println("------------------------------------------------------");
   System.out.println("Jumlah plus " +no1+ " dan " +no2+ " ialah : " +plus);
   System.out.println("Jumlah minus " +no1+ " dan " +no2+ " ialah : " +minus);
   System.out.println("Jumlah time " +no1+ " dan " +no2+ " ialah : " +minus);
   System.out.println("Jumlah divide " +no1+ " dan " +no2+ " ialah : " +divide);
   System.out.println("------------------------------------------------------");   
}
}