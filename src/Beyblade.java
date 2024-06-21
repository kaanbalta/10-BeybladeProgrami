public class Beyblade {

    private String beybladeci;
    private int dönüşHızı;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int dönüşHızı, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.dönüşHızı = dönüşHızı;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDönüşHızı() {
        return dönüşHızı;
    }

    public void setDönüşHızı(int dönüşHızı) {
        this.dönüşHızı = dönüşHızı;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public void saldir(){
        System.out.println(beybladeci + " " + saldiriGucu + " ve " + dönüşHızı + " ile saldırıyor");
    }

    public void kutsalCanavariOrtayaCıkar(){
        System.out.println("Bu beybladenin kutsal canavarı bulunmamakta");
    }

    public void bilgileriGoster(){
        System.out.println("Beybladeci ismi : " + beybladeci);
        System.out.println("Saldırı gücü : " + saldiriGucu);
        System.out.println("Dönüş hızı : " + dönüşHızı);
    }
}
