public class Main {
    public static void main(String[] args)  {
        //instance / pembuatan objek dari class
        //namaClass namaObjek = new construktor()
        Dosen dosen = new Dosen();

        dosen.id = 1;
        dosen.nama = "Aznur Riska Aswaranty";
        dosen.nik = "18631105";
        dosen.nilai = 3.9;
        dosen.alamat = "Banjarbaru";
        dosen.tampilData();

        Dosen dosen1 = new Dosen (2, "18630230", "Fiah", 3.1, "banjarbaru");
        dosen1.tampilDataDenganGaris(  "------------------------------");

        double hasilReturnValue = dosen.getNilai();
 //       System.out.println("Hasil return value : " + hasilReturnValue);

 //       dosen.tampilDataDenganGaris("========================");
 //       dosen.tampilDataDenganGaris("************************");
 //       dosen.hitungLuasPersegiPanajng(5,3);
 //       dosen.hitungLuasPersegiPanajng(7,3);
 //       dosen.hitungLuasPersegiPanajng(8,4);
 //       dosen.hitungLuasPersegiPanajng(9,2);

    }
}
