import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ClassTwo {
    public static void main(String[] args) {

    /*
    Conditional Statements
    1. If-else,
    2. Switch case
     */

        int a = 6;

        /// -n , 0, 1, 2, 3, 4, 5 (Less than equal Five) -> a <= 5

        ///  5, 6, 7, 8, +n (Greater than equal Five) -> a>= 5

        /// Used operators are :     ( ==, != , <=, >= , < , >)

        if (a != 5){
            System.out.println("A is not equal to Five");
        }else if(a== 5){
            System.out.println("A is Five");
        }else{
            System.out.println("Not five");
        }

        /*
        1. make a odd-even checker

        2. make a prime number checker

        3. find leap year

         */

        int currentYear = 1600;

        if (currentYear % 4 == 0){
            if(currentYear % 100 == 0){
                if(currentYear % 400 == 0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not Leap Year");
                }
            }else{
                System.out.println("Leap Year");
            }
        }else {
            System.out.println("Not Leap Year");
        }


    }
}
