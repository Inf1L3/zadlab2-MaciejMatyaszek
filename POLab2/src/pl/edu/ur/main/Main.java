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
        
        //Zadanie domowe
        
        //zad3 
    {double [] tablica;
      int c;
        tablica = new double[10];
      double y;
      for (int i=0; i< 10; i++)
      {   y = input.nextDouble();
          c=i+1;
          tablica[i] = y;
         
}
      for (int j=0; j<10; j++)
      {
          System.out.println("Wartości tablicy to " +tablica[j]);
    }
      for (int k=9; k>=0; k--)
      {System.out.println("Wartości tablicy malejąco to " +tablica[k]);
    }
      for (int l=1; l<10; l+=2)
      {System.out.println("Wartości o indeksach ujemnych " +tablica[l]);
   
    
    }
      for (int m=2; m<10; m+=2)
      {System.out.println("Wartosci o indeksach dodatnich " +tablica[m]);}
    }
      //zad4
      
        Scanner wow = new Scanner(System.in);
        System.out.println("Wprowadź liczby do tablicy");
        double[] tablica1;
        tablica1 = new double[10];
        double t;
        for (int z=0; z<10; z++)
        { t= input.nextDouble();
           tablica1[z]=t;
        }
        int menu;
        
        
       //zad5 
       do { 
           System.out.println("Wybierz opcje:\n 1.Suma elementów tablicy\n 2. Iloczyn elementów tablicy \n 3. Wartość średnia tablicy\n 4.Wartość minimalna tablicy \n 5. Wartość maksymalna tablicy\n 0. Wyjście");
           menu = input.nextInt();
       
        
           
       { 
           
          switch(menu){
            
            case 1: 
             double d = 0;
            for (int i=0; i<10; i++)
            { d=d+tablica1[i];
            }
                System.out.println("Suma elementów tablicy to " +d);        
            break;
            case 2:
            double e = 1;
            for (int i=0; i<10; i++)
            { e=e*tablica1[i];
            }
                System.out.println("Iloczyn elementów tablicy to " +e);
             break;   
            case 3:
                double f= 0;
            for (int i=0; i<10; i++)
            { f=f+tablica1[i];
              f=f/10;  
            }
                System.out.println("Wartość średnia tablicy to " +f);
                break;
            case 4:
            double h;
            h= tablica1[0];
            for (int i=1; i<10; i++)
            {
                if (tablica1[i]<h)
                {h=tablica1[i];}
                
                }
            System.out.println("Minimalna wartosc tablicy " +h);
            break;
            case 5:
             double v;
             v= tablica1[0];
             for (int i=1; i<10; i++)
             {
                 if (tablica1[i]>v)
                 {v=tablica1[i];}
                 
             }
                System.out.println("Wartość maksymalna tablicy " +v);
            break;
            case 0:
                System.out.println("Program zostaje zamknięty");
                break;
            default:
                
                System.out.println("Błędny numer");
                  break;       }    
       }} while(menu!=0);
       //zad6
       int z;
       while(true)
       {   System.out.println("Podaj liczbe calkowita ");
           z=input.nextInt();
           if (z<0)
           {break;}
       }
       // zad7
       int ilosc;
        System.out.println("Podaj ilosc elementow tablicy:");
       ilosc=input.nextInt();
       int []tab=new int[ilosc];
       for (int i=0; i<tab.length; i++)
       {
           System.out.println("Podaj element tablicy: ");
           tab[i]= input.nextInt();
       }
       int zap;
       int zmiana;
       zmiana=1;
       while(zmiana>0)
       { zmiana=0;
        for (int i=0; i<tab.length-1; i++){
            if(tab[i]>tab[i+1])
            {zap=tab[i+1];
            tab[i+1] = tab[i];
            tab[i]=zap;
            zmiana++;
            }
        }
        
        
           
       }
        System.out.println("Elementy posortowane: ");
       for (int i=0;i<tab.length; i++){
           System.out.println(tab[i]+"");
       }
       
       
       
       }     }
    
       

