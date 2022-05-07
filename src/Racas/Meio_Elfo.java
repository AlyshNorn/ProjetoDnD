package Racas;

public final class Meio_Elfo extends Racas{
    
    public Meio_Elfo(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setCarisma(ValoresAtributo()+2);
    }
    
    @Override
    public void subBonusRacial(){
        setCarisma(ValoresAtributo()-2);
    }
    
}
