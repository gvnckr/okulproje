package okulproje;

public class ogrenci2 extends kisi2 {


      private  String ogrencino;
      private  String sinif;

      public ogrenci2(String addsoyad, String kimlikno, int yas, String ogrencino, String sinif) {
            super(addsoyad, kimlikno, yas);
            this.ogrencino = ogrencino;
            this.sinif = sinif;
      }

public ogrenci2(){

}

      public String getOgrencino() {
            return ogrencino;
      }

      public void setOgrencino(String ogrencino) {
            this.ogrencino = ogrencino;
      }

      @Override
      public String toString() {
            return "ogrenci2{" +
                    "ogrencino='" + ogrencino + '\'' +
                    ", sinif='" + sinif + '\'' +
                    '}'+super.toString();
      }
}




