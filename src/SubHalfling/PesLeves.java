package SubHalfling;

import Racas.Halfling;

public final class PesLeves extends Halfling{

    public PesLeves(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setDestreza(ValoresAtributo()+2);
	setCarisma(ValoresAtributo()+1);
    }
    
    @Override
    public void subBonusRacial(){
        setDestreza(ValoresAtributo()-2);
	setCarisma(ValoresAtributo()-1);
    }
    
}
