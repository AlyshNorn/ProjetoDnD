package Racas;

public final class Meio_Orc extends Racas{

    public Meio_Orc(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setForca(ValoresAtributo()+2);
        setConstituicao(ValoresAtributo()+1);
    }
    
    @Override
    public void subBonusRacial(){
        setForca(ValoresAtributo()-2);
        setConstituicao(ValoresAtributo()-1);
    }
    
}
