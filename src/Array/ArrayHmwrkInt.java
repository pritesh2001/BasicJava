package Array;

public class ArrayHmwrkInt {
    public static void main(String[] args) {
        int rollnumber[]={1,2,3,4,5,6,7,8};
        rollnumber[3]=15;
        String name="pritesh";
        String surname="patel";

        String surname1=name+ surname;
        System.out.println(surname1);
        System.out.println(rollnumber[3]);
        for (int a=0; a<=rollnumber.length-1;a++){
            if (rollnumber[a] == 2){
                System.out.println("position +"+ a);

            }

        }
    }
}
