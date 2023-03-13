 /*
             * 1. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
             */
            printArray1("6. Find min & max in array\t", array3);
            System.out.println("6. Minimum: " + findMin(array3));
            System.out.println("6. Maximum: " + findMax(array3));

            // 3. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
import java.util.Scanner;
import java.util.Arrays;
public class Task03 {
   public static void main(String[] args){
       System.out.println("Введите значение массива :");
       int[] numbs = new int[4];
       Scanner sc = new Scanner(System.in);
       for (int i = 0; i < numbs.length; i++) {

           numbs[i] = sc.nextInt();
       }
       int val = 3;
       int a = numbs.length - 1;
       for (int i = 0; i < numbs.length / 2; i++) {
           if(numbs[i] == numbs[a]){
               a --;
           }
           int c = numbs[i];
           numbs[i] = numbs[a];
           numbs[a] = c;
           
       }
       a -= 1;
   System.out.println(Arrays.toString(numbs));

   }
}
   
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида

// "Доброе утро, <Имя>!", если время от 05:00 до 11:59

// "Добрый день, <Имя>!", если время от 12:00 до 17:59;

// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;

// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
        LocalTime nowTime = LocalTime.now();
        int hours = nowTime.getHour();
        System.out.print("Доборое");
        if (hours>=5 && hours<12)System.out.print( " утро " );
        else if (hours>=12 && hours<18)System.out.print( " день " );
        else if (hours>=18 && hours<23)System.out.print( " вечер " );
        else System.out.print( " ночи " );
        System.out.println(name);
    }
}