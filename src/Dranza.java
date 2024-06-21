public class Dranza extends Beyblade{

    private String kutsalCanavar;

    public Dranza(String beybladeci, int dönüşHızı, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, dönüşHızı, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavariOrtayaCıkar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar : " + kutsalCanavar);
        System.out.println(getBeybladeci() + " in kutsal saldırısı : Alev kılıcı");
    }

}
