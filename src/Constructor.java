public class Constructor {

    private String hesapNo;
    private double bakiye;


    private String isim;

    private String email;
    private String telefonNO;

    public Constructor(String hesapNo, String s, String samil_nugay, String email, String telefonNO) {

        System.out.println("Kendi yazdigimiz constructor ");
    }
    public Constructor(String hesapNo, double bakiye, String isim, String email, String telefonNO) {

        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNO = telefonNO;


    }

    public void paraYatir(double miktar) {
        bakiye += miktar;

        System.out.println("Yeni Bakiye = " +bakiye);
    }

    public void paraCekme(double miktar) {

        if(miktar > 1500) {
            System.out.println("Bir günde 1.500 tlden fazla para çekemezsiniz ");
        }
        if (bakiye -  miktar < 0) {
            System.out.println("Yeterli bakiye yok . Bakiye = " + bakiye);
        }
        else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye = " + bakiye);
        }
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNO() {
        return telefonNO;
    }

    public void setTelefonNO(String telefonNO) {
        this.telefonNO = telefonNO;
    }



}
