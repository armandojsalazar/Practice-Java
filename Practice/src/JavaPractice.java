public class JavaPractice {
//    Create a method that takes two integers as arguments and return their sum.
    public static int sumOfTwoNumbers(int a, int b){
        return a + b;
    }

        //Create a function that returns true when x is equal to y; otherwise return false.
    public static boolean isSameNum(int x, int y){
        if(x == y){
            return true;
        }else{
            return false;
        }
    }
// Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
public static int nextEdge(int side1, int side2) {
   return (side1 + side2) - 1;
}
}
