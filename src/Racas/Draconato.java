package Racas;

public final class Draconato extends Racas{
    
    public Draconato(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setForca(ValoresAtributo()+2);
        setCarisma(ValoresAtributo()+1);
    }
    
    @Override
    public void subBonusRacial(){
        setForca(ValoresAtributo()-2);
        setCarisma(ValoresAtributo()-1);
    }
    
    
}
