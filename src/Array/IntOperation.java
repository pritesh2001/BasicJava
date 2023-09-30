package Array;

import java.util.NoSuchElementException;

public class IntOperation {
    public static void main(String[] args) {
        int employeenumbers[]={121,145,143,178,165,114,328};
                // index        0   1   2   3   4   5   6
        employeenumbers[2]=143;
        employeenumbers[2]++;
        System.out.println(employeenumbers[2]);

        employeenumbers[4]=employeenumbers[2]+employeenumbers[5];
        System.out.println(employeenumbers[4]);

        employeenumbers[4]=employeenumbers[2]*employeenumbers[5];
        System.out.println(employeenumbers[4]);

        employeenumbers[4]=employeenumbers[2]/employeenumbers[5];
        System.out.println(employeenumbers[4]);

        employeenumbers[4]=employeenumbers[2]%employeenumbers[5];
        System.out.println(employeenumbers[4]);
        for (int i=0; i<=employeenumbers.length-1;i+=2){
            System.out.println(employeenumbers[i]);
        }
    }
}
