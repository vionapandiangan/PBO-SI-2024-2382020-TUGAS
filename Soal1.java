import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Panjang Array: ");
        int n = scanner.nextInt();

        int array[] = new int[n];

        System.out.println("Elemen array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int jumlah = 0;
        for (int i = 0; i < array.length; i++) {
            jumlah += array[i];
        }
        System.out.println("Jumlah elemen array adalah "+ jumlah);
    }
}
