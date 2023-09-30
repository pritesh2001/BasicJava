package Collection;

import java.util.ArrayList;

public class ArrayListTopic {
    public static void main(String[] args) {
        String names[]={"Pritesh","Patel"};

        for (String name: names){
            System.out.println(name);
        }
        ArrayList<String> nextProduct = new ArrayList<>(); //[Shirts, tshirts,shoes]
        nextProduct.add("Shirts");
        nextProduct.add("shoes");
        nextProduct.add("Tshirts");

        System.out.println(nextProduct);
    }

}
