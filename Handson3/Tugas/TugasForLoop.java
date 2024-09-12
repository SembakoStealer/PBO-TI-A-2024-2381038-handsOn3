    package Handson3.Tugas;

    public class TugasForLoop {
        public static void main(String[] args) {
            for(int i = 0; i<=20; i ++){
                if(i==15){
                    break;
                }  if (i%3==0){
                    continue;
                }
                System.out.println("Angka ke-" + i);
            }
        }
    }
