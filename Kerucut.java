package tugas3.ruang;

public class Kerucut implements MenghitungRuang{
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * this.jariJari * this.jariJari * this.tinggi) / 3;
    }

    @Override
    public double hitungLuasPermukaan() {
        return Math.PI * this.jariJari * (this.jariJari + getGarisPelukis());
    }
    
    public double getGarisPelukis(){
        return Math.sqrt(Math.pow(this.jariJari, 2) + Math.pow(this.tinggi, 2));
    }
   
}
