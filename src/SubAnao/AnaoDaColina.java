package SubAnao;

import Racas.Anao;

public final class AnaoDaColina extends Anao{

    public AnaoDaColina(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setConstituicao(ValoresAtributo()+2);
	setSabedoria(ValoresAtributo()+1);
    }
    
    @Override
    public void subBonusRacial(){
        setConstituicao(ValoresAtributo()-2);
	setSabedoria(ValoresAtributo()-1);
    }
    
}
