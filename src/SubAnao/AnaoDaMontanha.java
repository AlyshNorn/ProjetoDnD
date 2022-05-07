package SubAnao;

import Racas.Anao;

public final class AnaoDaMontanha extends Anao{
    
    
    public AnaoDaMontanha(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setForca(ValoresAtributo()+2);
        setConstituicao(ValoresAtributo()+2);
    }
    
    @Override
    public void subBonusRacial(){
        setForca(ValoresAtributo()-2);
        setConstituicao(ValoresAtributo()-2);
    }
    
}
