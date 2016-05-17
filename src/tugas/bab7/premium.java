public class premium extends Salon {
    public premium(String nama) {
        super(nama);
    }
    @Override
    public double getHrgPerawatan() {
        return HrgPerawatan;
    }
    @Override
    public double getHrgProduk() {
        return HrgProduk;
    }
    public void JenisProduk(){
        System.out.println("Jenis-jenis Produk : ");
System.out.println("1. Shampo");
System.out.println("2. Masker");
System.out.println("3. Body Scrub");
System.out.println("4. Vitamin Rambut");
System.out.println("5. Cream");
        System.out.print("Jenis Produk yang Anda inginkan : ");
        int pilih = in.nextInt();
        if (pilih == 1) {
            HrgProduk = HrgProduk + 35000;
        } else if (pilih == 2) {
            HrgProduk = HrgProduk + 40000;
        } else if (pilih == 3) {
            HrgProduk = HrgProduk + 60000;
        } else if (pilih == 4) {
            HrgProduk = HrgProduk + 30000;
        } else if (pilih == 5) {
            HrgProduk = HrgProduk + 50000;
        }
    }
    public void JenisPerawatan(){
        System.out.println("Jenis-jenis Perawatan : ");
System.out.println("1. Potong Rambut dan Creambath");
System.out.println("2. Lulur");
System.out.println("3. Facial");
        System.out.print("Jenis Perawatan yang Anda Inginkan  : ");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:
                HrgPerawatan = HrgPerawatan + 80000;
                break;
            case 2:
                HrgPerawatan = HrgPerawatan + 150000;
                break;
            case 3:
                HrgPerawatan = HrgPerawatan + 200000;
                break;
        }
    }
    @Override
    public double getHrgTotal() {
        return (HrgPerawatan - (HrgPerawatan * 0.2)) + (HrgProduk - (HrgProduk * 0.1));
    }
    @Override
    public void akhir() {
        System.out.println("Harga Total : Rp. " + getHrgTotal());
    }
}
