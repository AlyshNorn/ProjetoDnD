package SubElfo;

import Racas.Elfo;

public final class HighElves extends Elfo{

    public HighElves(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setDestreza(ValoresAtributo()+2);
	setInteligencia(ValoresAtributo()+1);
    }
    
    @Override
    public void subBonusRacial(){
        setDestreza(ValoresAtributo()-2);
	setInteligencia(ValoresAtributo()-1);
    }
    
}
