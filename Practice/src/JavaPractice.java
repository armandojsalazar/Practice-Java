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

// Create a function that takes voltage and current and returns the calculated power.
public static int power(int voltage, int current) {
    return voltage * current;
}

//Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
public static boolean lessThanOrEqualToZero(int num) {
if(num <= 0){
    return true;
}else{
    return false;
}
}
}
