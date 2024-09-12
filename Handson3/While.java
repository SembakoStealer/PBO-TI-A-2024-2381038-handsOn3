package Handson3;

public class While {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String [] {"Apel", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        while(counter < kumpulanBuah.length){
            System.out.println("Element ke - "+ (counter + 1) +": " + kumpulanBuah[counter]);
            counter++;
        }
    }
}
