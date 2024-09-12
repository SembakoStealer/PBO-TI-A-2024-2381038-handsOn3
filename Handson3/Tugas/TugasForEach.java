package Handson3.Tugas;

public class TugasForEach {
    public static void main(String[] args) {
        int[] listNomor = new int[21];

        for(int i=0; i<=20; i ++){
            listNomor[i] = i;
        }

        for(int number : listNomor){
            if(number == 15) {
                break;
            } else if(number%3 == 0){
                continue;
            }
            System.out.println("Angka ke- "+number);
        }

    }
}
