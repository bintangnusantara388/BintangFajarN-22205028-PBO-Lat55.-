/*
 * Nama : Bintang Fajar Nusantara
 * Nim : 22205028
 * Prodi : Teknik Informatika
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package hanphone55;

public class Handphone55 {

    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone55(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.println("Manufacture : " + manufacture);
        System.out.println("OS\t: " + operatingSystem);
        System.out.println("Model\t: " + model);
        System.out.println("Harga\t: " + harga);
    }
}

class BlackBerry extends Handphone55 {

    private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("PIN : " + pinBB);
        System.out.println("");
    }
}

class Android extends Handphone55 {

    private String keyStore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Android KeyStore : " + keyStore);
        System.out.println("");
    }
}

class WindowsPhone extends Handphone55 {

    private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Wp Key Store : " + wpKeyStore);
    }
}

    class Main {
    public static void main(String[] args) {
        Android andro = new Android("Samsung", "Android", "Grand", 3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();

        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();

        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 3500000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
    }
}
