public class Main {

    public  static void main(String args[]){
        CustomerArray customerArray = new CustomerArray();
        customerArray.add("One");
        customerArray.add("Two");
        customerArray.add("Three");
        customerArray.add("Four");
        customerArray.add("Five");
        customerArray.add("Six");
        customerArray.add("Seven");
        customerArray.add("Eight");
        customerArray.add("Nine");
        customerArray.add("Ten");
        customerArray.add("Eleven");
        System.out.println(customerArray.getSize());

        CustomerArray customerArray1 = new CustomerArray();
        customerArray1.add("Twelve");
        customerArray1.add("Thirteen");
        customerArray.add("Fourteen");
        customerArray.addAll(customerArray1);
        System.out.println(customerArray.toString());
        System.out.println(customerArray.indexOf("Nine"));
        System.out.println(customerArray.getSize());
        System.out.println(customerArray.toString());
        System.out.println(customerArray.get(1));
        customerArray.delete(1);
        customerArray.delete("Four");
        System.out.println(customerArray.toString());
        System.out.println((customerArray.contains("Six"))? "Array contains Six": "Array doesn't contain Six");
        System.out.println( customerArray.equals( customerArray));
        System.out.println( customerArray.equals( customerArray1));
        System.out.println(customerArray.toString());
        customerArray.trim();
        System.out.println(customerArray.toString());
        customerArray.clear();
        System.out.println(customerArray.toString());

        System.out.println("Performance test");

        CustomerArray testArray1 = new CustomerArray();
        CustomerArray testArray2 = new CustomerArray();

        double start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            testArray1.add("addingText");
        }
        System.out.println(((System.nanoTime() -  start) / 1000000000)  + " time for adding with increasing length by 60%");

        start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            testArray2.addIncreaseSizeBy1("addingText");
        }
        System.out.println(((System.nanoTime() -  start) / 1000000000) + " time for adding with increasing length by 1");
    }


}
