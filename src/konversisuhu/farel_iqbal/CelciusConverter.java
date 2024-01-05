
package konversisuhu.farel_iqbal;
/*
author : Farel Iqbal Mahardika
nim :  32602200010


Berikan penjelasan kode ini baris perbaris dengan komentar, bagian polimorfisme, getter setter, constructor, inheritance
*/
public class CelciusConverter implements TemperatureConverter {
    // Deklarasi variabel private untuk menyimpan suhu dalam Celsius
    private double celsius;

    // Konstruktor untuk inisialisasi objek dengan nilai suhu dalam Celsius
    public CelciusConverter(double celsius) {
        this.celsius = celsius;
    }

    // Implementasi metode convert dari antarmuka TemperatureConverter
    @Override
    public double convert(double input) {
        return input;  // Mengembalikan nilai input tanpa perubahan, tidak ada konversi yang dilakukan
    }

    // Implementasi metode getUnit dari antarmuka TemperatureConverter
    @Override
    public String getUnit() {
        return "Celsius";  // Mengembalikan satuan suhu yang diterima oleh kelas ini
    }

    // Getter untuk mendapatkan nilai suhu dalam Celsius
    public double getCelsius() {
        return celsius;
    }

    // Setter untuk mengatur nilai suhu dalam Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
