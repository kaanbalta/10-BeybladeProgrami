public class BeybladeFabrikasi {

    private String beybladeTuru;

    public BeybladeFabrikasi(String beybladeTuru) {
        this.beybladeTuru = beybladeTuru;

        if(beybladeTuru.equals("Dragon")){
            Dragon dragon = new Dragon("Kaan",6,5,"ejderha","hasarsızlık");
            dragon.bilgileriGoster();
        }
        else if(beybladeTuru.equals("Dranza")){
            Dranza dranza = new Dranza("akif",8,7,"Pençe");
            dranza.bilgileriGoster();
        }
        else if(beybladeTuru.equals("Drayga")){
            Drayga drayga = new Drayga("ahmet",9,3,"Kılıç");
            drayga.bilgileriGoster();

        }
    }
}


