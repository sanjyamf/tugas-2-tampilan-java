
import java.util.Scanner;

public class InputOutput5 {
  public static void main (String[] args) {
  Scanner input = new Scanner (System.in);

  String nama;
  char jenisKelamin;
  int  tinggiBadan;
  boolean  menikah;
 
 System.out.print("Masukan Nama : ");
  
  nama = input.nextLine();
  
  System.out.print("Masukan jenis Kelamin  : ");
  jenisKelamin = input.next().charAt(0);
  
  System.out.print("Masukan Tinggi Badan  : ");
   tinggiBadan = input.nextInt();   
   
    System.out.print("Masukan Status menikah  : ");
   menikah = input.nextBoolean();
  
   System.out.print( "===========================" );
  System.out.print( "nama:" );
  System.out.println(nama);
  System.out.print( "jenisKelamin:" );
  System.out.println(jenisKelamin);
   System.out.print( "tinggiBadan:" );
  System.out.println(tinggiBadan);
  System.out.println( "menikah):" );
  System.out.println(menikah);
   System.out.print( "==============================" );
     }
}