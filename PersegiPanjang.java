package tugas3.bidang;

import tugas3.ruang.Balok;

public class PersegiPanjang extends Balok implements MenghitungBidang{
    
    public PersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);
    }

    @Override
    public double hitungLuas() {
        return super.getPanjang() * super.getLebar();
    }

    @Override
    public double hitungKeliling() {
        return 2 * (super.getPanjang() + super.getLebar());
    }
    
}
