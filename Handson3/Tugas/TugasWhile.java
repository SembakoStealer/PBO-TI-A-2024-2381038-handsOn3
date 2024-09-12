package Handson3.Tugas;

public class TugasWhile {
    public static void main(String[] args) {

        int i = 0;
        while(i <= 20 ){
            if(i==15){
                break;
            } else if (i%3==0) {
                i++;
                continue;
            }

            System.out.println("Angka ke-" +i);
            i++;
        }
    }
}
