package SubGnomo;

import Racas.Gnomo;

public final class GnomoDaFloresta extends Gnomo{

    public GnomoDaFloresta(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setDestreza(ValoresAtributo()+1);
	setInteligencia(ValoresAtributo()+2);
    }
    
    @Override
    public void subBonusRacial(){
        setDestreza(ValoresAtributo()-1);
	setInteligencia(ValoresAtributo()-2);
    }
    
}
