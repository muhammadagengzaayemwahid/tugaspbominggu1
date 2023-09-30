#include <iostream>
using namespace std;

//Main program pada C++
int main() {
    char ulangprogram; //Tipe data char dan varidi C++ variabel (ex ulangprogram)

	//Sintaks while di C++
    while (true) {
        int n; //Tipe data int di C++ dan variabel (ex n)
        
        //Sintaks output pada C++ menggunakan cout
        cout << "+====== Program C++ Menghitung Rata-rata =======+" << endl;
        cout << endl;
        cout << "Masukkan jumlah nilai : ";
        
        //Sintaks input pada C++ menggunakan cin
        cin >> n;

        int nilai[n];
        int total = 0;
		
		//Sintaks end line pada C++ menggunakan fungsi endl
        cout << endl;

		//Sintaks for pada C++
        for (int i = 0; i < n; i++) {
            cout << "Masukkan nilai ke-" << i+1 << " :";
            cin >> nilai[i];
            total += nilai[i];
        }

        double rata_rata = static_cast<double>(total) / n;
        cout << "Rata-rata nilai adalah: " << rata_rata << endl;

        cout << endl;

        cout << "Hitung ulang (y/n) : ";
        cin >> ulangprogram;

		//sitakas if else pada C++
        if (ulangprogram == 'y' || ulangprogram == 'Y') {
            // Perintah untuk membersihkan layar 
            system("cls");
        } else {
        	// Menghentikan program
            break;
        }
    }

    return 0;
}

