package main.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of the first array: ");
        for(int i=0; i<n;i++)
        {
            a[i] = s.nextInt();
        }
        int[] p = new int[n];
        System.out.println("Enter elements of the second array: ");
        for (int i = 0; i < n; i++) {
            p[i] = s.nextInt();
        }
        System.out.println("Die billigste Tastatur ist: ");
        System.out.println(billigsteTastatur(a));
        System.out.println("Den teuresten Gegenstand: ");
        System.out.println(teuerstenGegenstand(a,p));
        System.out.println("Das teuerste USB ist: ");
        System.out.println(teuersteUSB(a, 30));
        System.out.println("Max Buget von Markus: ");
        System.out.println(MarkusBuget(a, p, 60));
    }

    private static int billigsteTastatur(int[] tastatur){
        int min = tastatur[0];
        for(int i:tastatur){
            if(i < min)
            {
                min = i;
            }
        }
        return min;
    }

    private static int teuerstenGegenstand(int[] Geg1, int[] Geg2){
        int max = Geg1[0];
        for(int i=0; i<Geg1.length; i++){
            if(Geg1[i] > max)
                max = Geg1[i];
            if(Geg2[i] > max)
                max = Geg2[i];
        }
        return max;
    }

    private static int teuersteUSB(int[] preise, int buget){
        int USB = 0;
        for(int i:preise){
            if(i <= buget){
                if(i>USB){
                    USB = i;
                }
            }
        }
        return USB;
    }

    private static int MarkusBuget(int[] tastatur, int[] USB, int buget){
        int maxbuget = -1;
        for(int i: tastatur){
            for(int j: USB){
                int sum_buget = i+j;
                if(sum_buget < buget && maxbuget < sum_buget)
                    maxbuget = sum_buget;
            }
        }
        return maxbuget;
    }

}
