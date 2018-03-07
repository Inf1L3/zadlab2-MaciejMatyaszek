package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        {
        while (liczba !=0){
        switch (liczba) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesień");
                break;
            case 10:
                System.out.println("Październik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzień");
                break;
            default:
                System.out.println("Błedny numer");
                break;
        }

    }
        int liczba1=10;
        
        int c=0;
                
        int iteracja1=0;
        int iteracja2=0;
        while (c<1000) {
            c += liczba1;
            iteracja1++;
        }
        System.out.println(iteracja1);
           c =0;
        do {
             c += liczba1;
            iteracja2++;
        }
        while(c<1000);
        System.out.println(iteracja2);
        }
        
        for (int i=0; i<20; i++)
        {
            if (i==2 || i==6 || i==9 || i==15 || i==19)
            {        continue;
           
          
            }
         
            System.out.println(i);
        }
        
        
       
}}
