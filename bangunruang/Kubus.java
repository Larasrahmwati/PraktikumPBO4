 package bangunruang;
    
class Kubus extends BangunRuang {
    double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    double hitungVolume() {
        return Math.pow(sisi, 3);
    }
    
    @Override
    double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}


