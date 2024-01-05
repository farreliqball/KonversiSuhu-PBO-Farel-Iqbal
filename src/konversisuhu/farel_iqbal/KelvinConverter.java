
package konversisuhu.farel_iqbal;

/*
author : Farel Iqbal Mahardika
nim :  32602200010

Berikan penjelasan kode ini baris perbaris dengan komentar, bagian polimorfisme, getter setter, constructor, inheritance
*/

public class KelvinConverter implements TemperatureConverter {
    // Deklarasi variabel private untuk menyimpan suhu dalam Kelvin
    private double kelvin;

    // Konstruktor untuk inisialisasi objek dengan nilai suhu dalam Kelvin
    public KelvinConverter(double kelvin) {
        this.kelvin = kelvin;
    }

    // Implementasi metode convert dari antarmuka TemperatureConverter
    @Override
    public double convert(double input) {
        // Melakukan konversi suhu dari Kelvin ke Celsius
        return input - 273.15;
    }

    // Implementasi metode getUnit dari antarmuka TemperatureConverter
    @Override
    public String getUnit() {
        return "Kelvin";  // Mengembalikan satuan suhu yang diterima oleh kelas ini
    }

    // Getter untuk mendapatkan nilai suhu dalam Kelvin
    public double getKelvin() {
        return kelvin;
    }

    // Setter untuk mengatur nilai suhu dalam Kelvin
    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
}
