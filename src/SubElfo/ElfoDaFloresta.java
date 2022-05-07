package SubElfo;

import Racas.Elfo;

public final class ElfoDaFloresta extends Elfo{

    public ElfoDaFloresta(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setDestreza(ValoresAtributo()+2);
	setSabedoria(ValoresAtributo()+1);
    }   
    
    @Override
    public void subBonusRacial(){
        setDestreza(ValoresAtributo()-2);
	setSabedoria(ValoresAtributo()-1);
    }   
    
}
