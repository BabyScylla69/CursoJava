public class FOR {
    public static void main(String[] args) {
        //ex 1
       /* for(int i = 0; i<=100; i += 2)
        {
            System.out.println(i);
        }*/

        //ex 2
        /*for(int i = 0; i <= 100; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }*/

        //ex 3
        /*for (int i = 1; i <= 20; i++)
        {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }*/

        //ex 4
        /*int value;
        for(int i = 1; i<=9; i++)
        {
            value = i * 7;
            System.out.println("7 * " + i + " = " + value);
        }*/

        //ex 5
        int value;
        for (int i = 1; i<=9; i++) {
            for (int j = 1; j <= 9; j++) {
                value = i * j;
                System.out.println(i + " * " + j + " = " + value);
            }
        }
    }
}
