package bangunruang;

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok(5, 3, 2);
        Kubus kubus = new Kubus(4);
        
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
        
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
