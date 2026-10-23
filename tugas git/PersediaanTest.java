import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersediaanTest {

    // 1. Kasus Normal: Input valid
    @Test
    void stokBerkurangSesuaiJumlah() {
        int hasil = Persediaan.kurangiStok(10, 3);
        assertEquals(7, hasil); // Berharap hasilnya 7
    }

    // 2. Kasus Batas: Mengurangi dengan jumlah yang sama persis dengan stok
    @Test
    void stokHabisSesuaiBatas() {
        int hasil = Persediaan.kurangiStok(10, 10);
        assertEquals(0, hasil); // Berharap hasilnya 0
    }

    // 3. Kasus Tidak Valid: Jumlah yang dikurangi 0
    @Test
    void jumlahNolDitolak() {
        assertThrows(IllegalArgumentException.class,
            () -> Persediaan.kurangiStok(10, 0));
    }

    // 4. Kasus Tidak Valid: Jumlah yang dikurangi negatif
    @Test
    void jumlahNegatifDitolak() {
        assertThrows(IllegalArgumentException.class,
            () -> Persediaan.kurangiStok(10, -1));
    }

    // 5. Kasus Tidak Valid: Jumlah melebihi stok yang ada
    @Test
    void jumlahMelebihiStokDitolak() {
        assertThrows(IllegalArgumentException.class,
            () -> Persediaan.kurangiStok(10, 11));
    }

    // 6. Kasus Tidak Valid: Stok awal sudah negatif
    @Test
    void stokNegatifDitolak() {
        assertThrows(IllegalArgumentException.class,
            () -> Persediaan.kurangiStok(-1, 1));
    }
}
