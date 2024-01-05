
package konversisuhu.farel_iqbal;

/*
author : Farel Iqbal Mahardika
nim :  32602200010


Berikan penjelasan kode ini baris perbaris dengan komentar, bagian polimorfisme, getter setter, constructor, inheritance
*/public class FahrenheitConverter implements TemperatureConverter {
    // Deklarasi variabel private untuk menyimpan suhu dalam Fahrenheit
    private double fahrenheit;

    // Konstruktor untuk inisialisasi objek dengan nilai suhu dalam Fahrenheit
    public FahrenheitConverter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // Implementasi metode convert dari antarmuka TemperatureConverter
    @Override
    public double convert(double input) {
        // Melakukan konversi suhu dari Fahrenheit ke Celsius
        return (input - 32) * 5 / 9;
    }

    // Implementasi metode getUnit dari antarmuka TemperatureConverter
    @Override
    public String getUnit() {
        return "Fahrenheit";  // Mengembalikan satuan suhu yang diterima oleh kelas ini
    }

    // Getter untuk mendapatkan nilai suhu dalam Fahrenheit
    public double getFahrenheit() {
        return fahrenheit;
    }

    // Setter untuk mengatur nilai suhu dalam Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
