import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ulangprogram; // Tipe data char dan variabel (contoh: ulangprogram)

        Scanner input = new Scanner(System.in);

        while (true) {
            int n; // Tipe data int dan variabel (contoh: n)

            // Sintaks output pada java menggunakan print dan println untuk end line
            System.out.println("+====== Program Java Menghitung Rata-rata =======+");
            System.out.println();
            System.out.print("Masukkan jumlah nilai : ");

            // Sintaks input pada java menggunakan input.nextTipeData
            n = input.nextInt();

            //Array pada java
            int[] nilai = new int[n];
            int total = 0;

            // Sintaks end line pada java menggunakan println
            System.out.println();

            // Sintaks for pada java
            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan nilai ke-" + (i+1) + " : ");
                nilai[i] = input.nextInt();
                total += nilai[i];
            }

            double rata_rata = (double) total / n;
            System.out.println("Rata-rata nilai adalah: " + rata_rata);

            System.out.println();

            System.out.print("Hitung ulang (y/n) : ");
            ulangprogram = input.next().charAt(0);

            // Sintaks if-else pada java
            if (ulangprogram == 'y' || ulangprogram == 'Y') {
                System.out.println("+======Ulang Program======+");
            } else {
                // Menghentikan program
                break;
            }
        }

        input.close();
    }
}
