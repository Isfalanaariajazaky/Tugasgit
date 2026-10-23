public class Persediaan {
    public static int kurangiStok(int stok, int jumlah) {
        if (stok < 0 || jumlah <= 0 || jumlah > stok) {
            throw new IllegalArgumentException("Data tidak valid");
        }
        return stok - jumlah;
    }
}
