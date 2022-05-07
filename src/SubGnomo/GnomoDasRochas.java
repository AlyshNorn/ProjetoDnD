package SubGnomo;

import Racas.Gnomo;

public final class GnomoDasRochas extends Gnomo {

    public GnomoDasRochas(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setConstituicao(ValoresAtributo()+1);
	setInteligencia(ValoresAtributo()+2);
    }
    
    @Override
    public void subBonusRacial(){
        setConstituicao(ValoresAtributo()-1);
	setInteligencia(ValoresAtributo()-2);
    }
    
    
}
