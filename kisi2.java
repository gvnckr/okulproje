package okulproje;

public class kisi2 {

   private String addsoyad;
  private   String kimlikno;
  private   int yas;

    public kisi2(String addsoyad, String kimlikno, int yas) {
        this.addsoyad = addsoyad;
        this.kimlikno = kimlikno;
        this.yas = yas;
    }

    public kisi2() {
    }

    public String getAddsoyad() {
        return addsoyad;
    }

    public void setAddsoyad(String addsoyad) {
        this.addsoyad = addsoyad;
    }

    public String getKimlikno() {
        return kimlikno;
    }

    public void setKimlikno(String kimlikno) {
        this.kimlikno = kimlikno;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "kisi2{" +
                "addsoyad='" + addsoyad + '\'' +
                ", kimlikno='" + kimlikno + '\'' +
                ", yas=" + yas +
                '}';
    }
}
