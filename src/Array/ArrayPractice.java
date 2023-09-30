package Array;

public class ArrayPractice {
    public static void main(String[] args) {
        int numbers[]={10,20,50,40,45,21};
        // index       0  1  2  3  4  5

        numbers[2]=30;
        System.out.println(numbers[2]);

        System.out.println(numbers.length);
        for (int i=0; i<= numbers.length-1;i++){
            System.out.println(numbers[i]);


        }
    }
}
