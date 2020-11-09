package tugas3.bidang;

import tugas3.ruang.Kerucut;

public class Lingkaran extends Kerucut implements MenghitungBidang{    

    public Lingkaran(double jariJari, double tinggi) {
        super(jariJari, tinggi);
    }

    @Override
    public double hitungLuas() {
        return Math.PI * super.getJariJari() * super.getJariJari();
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * super.getJariJari();
    }
}
