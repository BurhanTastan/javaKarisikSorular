package JavaSorular;

public class Questions {
    public static void main(String[] args) {

        int[] arr = {3, 6, 5, 7, 8, 8, 3, 6};

        int girilenEleman = 6;

    }

    public static class Q_210123 {
        public static void main(String[] args) {

            //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
            //kullanildigini yazdiran bir method olusturun.

            int[] arr = {3, 6, 5, 7, 8, 8, 3, 6};

            int girilenEleman = 6;

            tekerrur(arr,girilenEleman);

        }

        private static void tekerrur(int[] arr, int girilenEleman) {

            int sayac=0;
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i]==girilenEleman){
                    sayac++;
                }

            }
            if (sayac==0){
                System.out.println("Girilen sayi bulunamamistir");
            }else System.out.println("Girilensayi Arrayde "+ sayac+" defa tekrar etmistir.");
        }
    }
}
