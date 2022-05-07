package SubHalfling;

import Racas.Halfling;

public final class Robusto extends Halfling {

    public Robusto(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setDestreza(ValoresAtributo()+2);
	setConstituicao(ValoresAtributo()+1);
    }
    
    @Override
    public void subBonusRacial(){
        setDestreza(ValoresAtributo()-2);
	setConstituicao(ValoresAtributo()-1);
    }
    
}
