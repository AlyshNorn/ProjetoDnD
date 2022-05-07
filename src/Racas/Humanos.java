package Racas;

public final class Humanos extends Racas {
    
    public Humanos(){
        Criar();
    }
    
    @Override
    public void addBonusRacial(){
        setForca(ValoresAtributo()+1);
        setDestreza(ValoresAtributo()+1);
	setConstituicao(ValoresAtributo()+1);
	setInteligencia(ValoresAtributo()+1);
	setSabedoria(ValoresAtributo()+1);
	setCarisma(ValoresAtributo()+1);
    }
    
    @Override
    public void subBonusRacial(){
        setForca(ValoresAtributo()-1);
        setDestreza(ValoresAtributo()-1);
	setConstituicao(ValoresAtributo()-1);
	setInteligencia(ValoresAtributo()-1);
	setSabedoria(ValoresAtributo()-1);
	setCarisma(ValoresAtributo()-1);
    }
    
}
