package lexicon.se;

public class MethodOverloading {






        int num1 = 40;
        int num2=20;
         System.out.printLn(add(num1,num2));
         System.out.printLn(add(num1:40.45, num2:30.65));


        public static int add (int number1,int number2){
            return number1  + number2;
        }
         public static int  add (int num1, int num2){
            return num1 +num2;

         }
    public int getNum2() {
        return num2;
    }
}

