package okulproje;

public class ogretmen2 extends kisi2 {

    private String bolum;
    private  int sicilno;
public ogretmen2(){

}

    public ogretmen2(String addsoyad, String kimlikno, int yas, String bolum, int sicilno) {
        super(addsoyad, kimlikno, yas);
        this.bolum = bolum;
        this.sicilno = sicilno;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilno() {
        return sicilno;
    }

    public void setSicilno(int sicilno) {
        this.sicilno = sicilno;
    }

    @Override
    public String toString() {
        return "ogretmen2{" +
                "bolum='" + bolum + '\'' +
                ", sicilno=" + sicilno +
                '}'+super.toString();
    }
}
