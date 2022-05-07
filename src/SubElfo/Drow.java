package SubElfo;

import Racas.Elfo;

public final class Drow extends Elfo {
    
    public Drow(){
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
