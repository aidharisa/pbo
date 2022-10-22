class Apotek{
    private double harga;
    private double TotalBayar;

    public Apotek() {
        harga = 0;
        TotalBayar = 0;
    }

    public Apotek(double harga) {
        this.harga = harga;
    }

    public Apotek(double harga, int jumlah){
        this.harga = harga;
        this.TotalBayar = harga * (double)jumlah;

    }

    public Apotek(double harga, double jumlah){
        this.harga = harga;
        this.TotalBayar = harga * jumlah;
    }

    public double getTotalBayar(){
        return TotalBayar;
    }
}

public class Main {
    public static void main (String[] args){
        Apotek a1 = new Apotek();
        Apotek a2 = new Apotek(20000);
        Apotek a3 = new Apotek(30000, 2);
        Apotek a4 = new Apotek(40000, 2);

        System.out.println("Total Bayar 1 : " + a1.getTotalBayar());
        System.out.println("Total Bayar 2 : " + a2.getTotalBayar());
        System.out.println("Total Bayar 3 : " + a3.getTotalBayar());
        System.out.println("Total Bayar 4 : " + a4.getTotalBayar());
    }
}class Apotek{
    private double harga;
    private double TotalBayar;

    public Apotek() {
        harga = 0;
        TotalBayar = 0;
    }

    public Apotek(double harga) {
        this.harga = harga;
    }

    public Apotek(double harga, int jumlah){
        this.harga = harga;
        this.TotalBayar = harga * (double)jumlah;

    }

    public Apotek(double harga, double jumlah){
        this.harga = harga;
        this.TotalBayar = harga * jumlah;
    }

    public double getTotalBayar(){
        return TotalBayar;
    }
    
}

public class Main {
    public static void main (String[] args){
        Apotek a1 = new Apotek();
        Apotek a2 = new Apotek(20000);
        Apotek a3 = new Apotek(30000, 2);
        Apotek a4 = new Apotek(40000, 2);

        System.out.println("Total Bayar 1 : " + a1.getTotalBayar());
        System.out.println("Total Bayar 2 : " + a2.getTotalBayar());
        System.out.println("Total Bayar 3 : " + a3.getTotalBayar());
        System.out.println("Total Bayar 4 : " + a4.getTotalBayar());
    }
}