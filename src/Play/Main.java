package Play;

import Generic.Menu;
import Generic.MetierProduitImpl;
import Generic.Produit;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MetierProduitImpl mtp = new MetierProduitImpl();

        mtp.add(new Produit(1L, "Laptop", "Dell", 1200, "Gaming Laptop", 5));
        mtp.add(new Produit(2L, "Smartphone", "Samsung", 800, "Android Phone", 10));
        mtp.add(new Produit(3L, "Tablet", "Apple", 900, "iPad Pro", 7));
        mtp.add(new Produit(4L, "Smartwatch", "Garmin", 300, "Fitness Tracker", 15));
        mtp.add(new Produit(5L, "Headphones", "Sony", 250, "Noise Cancelling", 12));
        mtp.add(new Produit(6L, "Gaming Console", "Sony", 500, "PlayStation 5", 8));
        mtp.add(new Produit(7L, "Camera", "Canon", 1100, "Professional DSLR", 4));
        mtp.add(new Produit(8L, "Printer", "HP", 200, "Wireless Printer", 9));
        mtp.add(new Produit(9L, "Monitor", "LG", 350, "4K UHD Display", 6));
        mtp.add(new Produit(10L, "Mouse", "Logitech", 60, "Wireless Gaming Mouse", 20));
        mtp.add(new Produit(11L, "Keyboard", "Corsair", 120, "Mechanical RGB Keyboard", 14));
        mtp.add(new Produit(12L, "External SSD", "Samsung", 180, "1TB Portable SSD", 11));
        mtp.add(new Produit(13L, "USB Flash Drive", "SanDisk", 40, "128GB USB 3.0", 25));
        mtp.add(new Produit(14L, "Power Bank", "Anker", 90, "20000mAh Battery", 18));
        mtp.add(new Produit(15L, "Smart TV", "Samsung", 1500, "55-inch OLED 4K", 5));
        mtp.add(new Produit(16L, "Router", "TP-Link", 130, "WiFi 6 Router", 17));
        mtp.add(new Produit(17L, "VR Headset", "Meta", 400, "Oculus Quest 2", 6));
        mtp.add(new Produit(18L, "E-Reader", "Amazon", 140, "Kindle Paperwhite", 10));
        mtp.add(new Produit(19L, "Projector", "Epson", 700, "4K Home Theater", 3));
        mtp.add(new Produit(20L, "Gaming Chair", "Secretlab", 450, "Ergonomic Gaming Chair", 7));

        do {
    menu.menuS();
    switch (menu.getOption()){
        case 1: mtp.getAll(); break;
        case 2: mtp.findById(mtp.getIdd()); break;
        case 3: mtp.delete(mtp.getIdd()); break;
        case 4: System.out.println("Exit Program"); break;

    }


}
        while (menu.getOption() != 4);
    }
}