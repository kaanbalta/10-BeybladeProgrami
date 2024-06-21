public class Dragon extends Beyblade{

    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int dönüşHızı, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, dönüşHızı, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavariOrtayaCıkar() {
        super.kutsalCanavariOrtayaCıkar();
        System.out.println("Kutsal canavar : " + kutsalCanavar);
        System.out.println("Gizli yetenek : " + gizliYetenek);
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar : " + kutsalCanavar);
        System.out.println(getBeybladeci() + " in kutsal saldırısı : Hayalet kasırgası");
    }
}
