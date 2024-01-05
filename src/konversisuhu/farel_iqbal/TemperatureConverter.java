
package konversisuhu.farel_iqbal;

/*
author : Farel Iqbal Mahardika
nim :  32602200010

Berikan penjelasan kode ini baris perbaris dengan komentar, bagian interface
*/

// Deklarasi antarmuka TemperatureConverter
public interface TemperatureConverter {
    // Metode untuk mengkonversi suhu
    double convert(double input);

    // Metode untuk mendapatkan satuan suhu
    String getUnit();
}
