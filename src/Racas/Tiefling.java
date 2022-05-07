package Racas;

public final class Tiefling extends Racas{

    public Tiefling(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setInteligencia(ValoresAtributo()+1);
        setCarisma(ValoresAtributo()+2);
    }
    
    @Override
    public void subBonusRacial(){
        setInteligencia(ValoresAtributo()-1);
        setCarisma(ValoresAtributo()-2);
    }
    
    
}
