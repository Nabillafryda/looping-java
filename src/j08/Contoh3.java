
package j08;

import java.util.Scanner;
public class Contoh3 {
    public static void main(String[] args)
    { //CARA1
        // MENAMPILKAN 10 BILANGAN GANJIL PERTAMA
        int x = 1;
        
        for(x = 1; x <= 20; x+=2)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        // MENAMPILKAN 10 BILANGAN GENAP PERTAMA
        
        for(x = 2; x <= 20; x+=2)
        {
        System.out.print(x + " ");
        }
        System.out.println();
    
       //CARA 2
       // MENAMPILKAN 10 BILANGAN GANJIL PERTAMA
        for(x = 1; x <= 20; x++)
        {
            if(x % 2 == 1)
            {
                System.out.print(x + " ");
            }
         // MENAMPILKAN 10 BILANGAN GENAP PERTAMA
        for(x = 1; x <= 20; x++)
        {
            if(x % 2 == 0)
            {
                System.out.print(x + " ");
            }

        
        }        
    }
    }
    }