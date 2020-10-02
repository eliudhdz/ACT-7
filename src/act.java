

import java.util.Scanner;


public class act {
    public static void main (String[] args){
        Scanner leer =new Scanner(System.in)  ;
        int Nprimos;
        int a=1;
        int b=0;
        int num;
        int temp;
        System.out.print("Que sucecion de numeros primos te gustaria conocer");
        Nprimos =leer.nextInt();
        for (int i =1;i<Nprimos;i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;

            }
            if (count == 2)
                System.out.print(i+",");

        }
        System.out.print(" " + "Ingresa los numeros de la sucesion fibonacci");
        num = leer.nextInt();
        while(b + a <= num){
            temp = a;
            a = b;
            b = temp + a;
            System.out.print(b + ",");
        }

    }

}


