package konversisuhu.farel_iqbal;


/*

author : Farel Iqbal Mahardika
nim :  32602200010

berikan penjelasan kode ini baris perbaris dengan komentar
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class TemperatureMain {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan suhu dalam Celsius
        System.out.print("Enter temperature in Celsius: ");
        double inputValue = scanner.nextDouble();

        // Membuat instance (objek) dari kelas CelciusConverter, FahrenheitConverter, dan KelvinConverter
        CelciusConverter celsiusConverter = new CelciusConverter(inputValue);
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter(inputValue);
        KelvinConverter kelvinConverter = new KelvinConverter(inputValue);

        // Menampilkan hasil konversi ke layar konsol
        System.out.println("Celsius: " + celsiusConverter.convert(inputValue));
        System.out.println("Fahrenheit: " + fahrenheitConverter.convert(inputValue));
        System.out.println("Kelvin: " + kelvinConverter.convert(inputValue));
    }
}
