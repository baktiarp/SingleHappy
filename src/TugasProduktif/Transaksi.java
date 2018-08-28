/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProduktif;

/**
 *
 * @author USER
 */
class Transaksi extends Pembeli {
    private static int jumlah;
    private String tot;
    
    public Transaksi(int idBarang, String namaBarang, int harga, String merk, int idPembeli, String namaPembeli, String alamat, String noTelp, int Jumlah) {
        super(idBarang, namaBarang, harga, merk, idPembeli, namaPembeli, alamat, noTelp);
        this.jumlah = jumlah;
    }
    public void setTotal (String total){
        tot = total;
    }
    public String getTotal(){
        return tot;
    }
    public void TotalTran(){
        System.out.println("Total Harga   : "+getTotal());
    }
    
    public void tampilkan(){
        super.tampilkan();
       
    }
    public static void main(String[] args) {
        Transaksi tr = new Transaksi(12, "Pensil", 50000, "Faster", 22, "Eko", "Jl Salak", "089602851443", 2);
        tr.tampilkan();
        tr.setTotal("Rp.50.000");
        tr.TotalTran();
    }
    
}
