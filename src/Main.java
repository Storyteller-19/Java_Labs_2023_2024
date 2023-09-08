import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //part_one();
        //part_two(2);
        //part_tree();
        //garmony_arr();
        /*Scanner read = new Scanner(System.in);
        int fac_num = read.nextInt();
        int factoryal = factorial(fac_num);
        System.out.print(factoryal);*/

    }


    public static void part_one() {
        Scanner read = new Scanner(System.in);
        int size_of_arr = read.nextInt();
        double sr_of_element;
        int sum_arr = 0;
        int[] array = new int[size_of_arr];
        for (int i = 0; i < array.length; i++){
            array[i] = read.nextInt();
            sum_arr += array[i];
        }
        sr_of_element = sum_arr * 1.0 / array.length;
        System.out.println(sr_of_element);
        read.close();
    }

    public static void part_two(int num){
        Scanner read = new Scanner(System.in);
        int size_of_arr = read.nextInt();
        int sum_arr = 0;
        int[] array = new int[size_of_arr];
        array[0] = read.nextInt();
        int min = array[0], max = min;
        if (num % 2 == 0){
            int counter = 0;
            while (counter < array.length){
                array[counter] = read.nextInt();
                sum_arr += array[counter];
                if (array[counter] > max)
                    max= array[counter];
                if (array[counter] < min)
                    min = array[counter];
                counter += 1;
            }
            read.close();
        }
        else{
            int counter = 0;
            do{
                array[counter] = read.nextInt();
                sum_arr += array[counter];
                if (array[counter] > max)
                    max= array[counter];
                if (array[counter] < min)
                    min = array[counter];
                counter += 1;
            }
            while (counter < array.length);

        }
        System.out.println(max + " " + min + " ");
        read.close();
    }


    public static void part_tree() {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i > -1; i++){
            String word = read.nextLine();
            if (word.equals("stop"))
                break;
            System.out.println(word);
        }
        }

    public static void garmony_arr () {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%.3f", 1.0 / i);
            System.out.println();
        }
    }

    public static int factorial(int num) {
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}

