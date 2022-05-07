package Racas;

import StatusPersornagem.TirarStatus;

public class Racas extends TirarStatus {

    public void addBonusRacial (){
        
    }
    
    public void subBonusRacial (){
        
    }
    
    public void Criar (){
        tirarAtributos();
        addBonusRacial();
        calcularModificadores();
    }
    
    @Override
    public String [] TirareOrganizarInfo (){
            tirarAtributos();
            addBonusRacial();
            calcularModificadores();
            String [] Status = {
                getForca()+" ("+getMODForca()+")",
                getDestreza()+" ("+getMODDestreza()+")",
                getConstituicao()+" ("+getMODConstituicao()+")",
                getInteligencia()+" ("+getMODInteligencia()+")",
                getSabedoria()+" ("+getMODSabedoria()+")",
                getCarisma()+" ("+getMODCarisma()+")"
            };
            return Status;
        }
    
}
