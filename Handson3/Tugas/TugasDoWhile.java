package Handson3.Tugas;

public class TugasDoWhile {
    public static void main(String[] args) {
        int listNomor [] = new int[21];
        int penghitung = 0;

        for(int i=0; i<=20; i++){
            listNomor[i] = i;
        }
        do {
            if(listNomor[penghitung]==15){
                break;
            } else if(listNomor[penghitung]%3==0){
                penghitung++;
                continue;

            }
            System.out.println("Angka ke-" +listNomor[penghitung]);
            penghitung++;
        }while (penghitung < listNomor.length);
    }
}
