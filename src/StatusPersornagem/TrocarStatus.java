package StatusPersornagem;

public class TrocarStatus extends TirarStatus {
    
    private int ValorSubstituicaoStatus = 0;
    private int ValorSubstituicaoModStatus = 0;
    private boolean trocaDisponivel =true; 
    private String StatusTroca = "";
    
    public void trocarForca (){
        if(isTrocaDisponivel()){
            setValorSubstituicaoStatus(getForca());
            setValorSubstituicaoModStatus(getMODForca());
            setTrocaDisponivel(false);
            setStatusTroca("Força");
        }else{
            switch(getStatusTroca()){
                case "Destreza":
                    setDestreza(getForca());
                    setMODDestreza(getMODForca());
                    setForca(getValorSubstituicaoStatus());
                    setMODForca(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Constituição":
                    setConstituicao(getForca());
                    setMODConstituicao(getMODForca());
                    setForca(getValorSubstituicaoStatus());
                    setMODForca(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Inteligência":
                    setInteligencia(getForca());
                    setMODInteligencia(getMODForca());
                    setForca(getValorSubstituicaoStatus());
                    setMODForca(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Sabedoria":
                    setSabedoria(getForca());
                    setMODSabedoria(getMODForca());
                    setForca(getValorSubstituicaoStatus());
                    setMODForca(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Carisma":
                    setCarisma(getForca());
                    setMODCarisma(getMODForca());
                    setForca(getValorSubstituicaoStatus());
                    setMODForca(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
            }
        }
    }
    public void trocarDestreza (){
        if(isTrocaDisponivel()){
            setValorSubstituicaoStatus(getDestreza());
            setValorSubstituicaoModStatus(getMODDestreza());
            setTrocaDisponivel(false);
            setStatusTroca("Destreza");
        }else{
            switch(getStatusTroca()){
                case "Força":
                    setForca(getDestreza());
                    setMODForca(getMODDestreza());
                    setDestreza(getValorSubstituicaoStatus());
                    setMODDestreza(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Constituição":
                    setConstituicao(getDestreza());
                    setMODConstituicao(getMODDestreza());
                    setDestreza(getValorSubstituicaoStatus());
                    setMODDestreza(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Inteligência":
                    setInteligencia(getDestreza());
                    setMODInteligencia(getMODDestreza());
                    setDestreza(getValorSubstituicaoStatus());
                    setMODDestreza(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Sabedoria":
                    setSabedoria(getDestreza());
                    setMODSabedoria(getMODDestreza());
                    setDestreza(getValorSubstituicaoStatus());
                    setMODDestreza(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Carisma":
                    setCarisma(getDestreza());
                    setMODCarisma(getMODDestreza());
                    setDestreza(getValorSubstituicaoStatus());
                    setMODDestreza(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
            }
        }
    }
    public void trocarConstituicao (){
        if(isTrocaDisponivel()){
            setValorSubstituicaoStatus(getConstituicao());
            setValorSubstituicaoModStatus(getMODConstituicao());
            setTrocaDisponivel(false);
            setStatusTroca("Constituição");
        }else{
            switch(getStatusTroca()){
                case "Destreza":
                    setDestreza(getConstituicao());
                    setMODDestreza(getMODConstituicao());
                    setConstituicao(getValorSubstituicaoStatus());
                    setMODConstituicao(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Força":
                    setForca(getConstituicao());
                    setMODForca(getMODConstituicao());
                    setConstituicao(getValorSubstituicaoStatus());
                    setMODConstituicao(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Inteligência":
                    setInteligencia(getConstituicao());
                    setMODInteligencia(getMODConstituicao());
                    setConstituicao(getValorSubstituicaoStatus());
                    setMODConstituicao(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Sabedoria":
                    setSabedoria(getConstituicao());
                    setMODSabedoria(getMODConstituicao());
                    setConstituicao(getValorSubstituicaoStatus());
                    setMODConstituicao(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Carisma":
                    setCarisma(getConstituicao());
                    setMODCarisma(getMODConstituicao());
                    setConstituicao(getValorSubstituicaoStatus());
                    setMODConstituicao(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true); 
                    break;
            }
        }
    }
    public void trocarInteligencia (){
        if(isTrocaDisponivel()){
            setValorSubstituicaoStatus(getInteligencia());
            setValorSubstituicaoModStatus(getMODInteligencia());
            setTrocaDisponivel(false);
            setStatusTroca("Inteligência");
        }else{
            switch(getStatusTroca()){
                case "Destreza":
                    setDestreza(getInteligencia());
                    setMODDestreza(getMODInteligencia());
                    setInteligencia(getValorSubstituicaoStatus());
                    setMODInteligencia(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Constituição":
                    setConstituicao(getInteligencia());
                    setMODConstituicao(getMODInteligencia());
                   setInteligencia(getValorSubstituicaoStatus());
                    setMODInteligencia(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Força":
                    setForca(getInteligencia());
                    setMODForca(getMODInteligencia());
                    setInteligencia(getValorSubstituicaoStatus());
                    setMODInteligencia(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Sabedoria":
                    setSabedoria(getInteligencia());
                    setMODSabedoria(getMODInteligencia());
                    setInteligencia(getValorSubstituicaoStatus());
                    setMODInteligencia(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Carisma":
                    setCarisma(getInteligencia());
                    setMODCarisma(getMODInteligencia());
                    setInteligencia(getValorSubstituicaoStatus());
                    setMODInteligencia(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
            }
        }
    }
    public void trocarSabedoria (){
        if(isTrocaDisponivel()){
            setValorSubstituicaoStatus(getSabedoria());
            setValorSubstituicaoModStatus(getMODSabedoria());
            setTrocaDisponivel(false);
            setStatusTroca("Sabedoria");
        }else{
            switch(getStatusTroca()){
                case "Destreza":
                    setDestreza(getSabedoria());
                    setMODDestreza(getMODSabedoria());
                    setSabedoria(getValorSubstituicaoStatus());
                    setMODSabedoria(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Constituição":
                    setConstituicao(getSabedoria());
                    setMODConstituicao(getMODSabedoria());
                    setSabedoria(getValorSubstituicaoStatus());
                    setMODSabedoria(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Inteligência":
                    setInteligencia(getSabedoria());
                    setMODInteligencia(getMODSabedoria());
                    setSabedoria(getValorSubstituicaoStatus());
                    setMODSabedoria(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Força":
                    setForca(getSabedoria());
                    setMODForca(getMODSabedoria());
                    setSabedoria(getValorSubstituicaoStatus());
                    setMODSabedoria(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Carisma":
                    setCarisma(getSabedoria());
                    setMODCarisma(getMODSabedoria());
                    setSabedoria(getValorSubstituicaoStatus());
                    setMODSabedoria(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
            }
        }
    }
    public void trocarCarisma (){
        if(isTrocaDisponivel()){
            setValorSubstituicaoStatus(getCarisma());
            setValorSubstituicaoModStatus(getMODCarisma());
            setTrocaDisponivel(false);
            setStatusTroca("Carisma");
        }else{
            switch(getStatusTroca()){
                case "Destreza":
                    setDestreza(getCarisma());
                    setMODDestreza(getMODCarisma());
                    setCarisma(getValorSubstituicaoStatus());
                    setMODCarisma(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Constituição":
                    setConstituicao(getCarisma());
                    setMODConstituicao(getMODCarisma());
                    setCarisma(getValorSubstituicaoStatus());
                    setMODCarisma(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Inteligência":
                    setInteligencia(getCarisma());
                    setMODInteligencia(getMODCarisma());
                    setCarisma(getValorSubstituicaoStatus());
                    setMODCarisma(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Sabedoria":
                    setSabedoria(getCarisma());
                    setMODSabedoria(getMODCarisma());
                    setCarisma(getValorSubstituicaoStatus());
                    setMODCarisma(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
                case "Força":
                    setForca(getCarisma());
                    setMODForca(getMODCarisma());
                    setCarisma(getValorSubstituicaoStatus());
                    setMODCarisma(getValorSubstituicaoModStatus());
                    setTrocaDisponivel(true);
                    break;
            }
        }
    }
    
        
    public int getValorSubstituicaoStatus() {
        return ValorSubstituicaoStatus;
    }
    public void setValorSubstituicaoStatus(int ValorSubstituicaoStatus) {
        this.ValorSubstituicaoStatus = ValorSubstituicaoStatus;
    }
    
    public int getValorSubstituicaoModStatus() {
        return ValorSubstituicaoModStatus;
    }
    public void setValorSubstituicaoModStatus(int ValorSubstituicaoModStatus) {
        this.ValorSubstituicaoModStatus = ValorSubstituicaoModStatus;
    }
    
    public boolean isTrocaDisponivel() {
        return trocaDisponivel;
    }
    public void setTrocaDisponivel(boolean trocaDisponivel) {
        this.trocaDisponivel = trocaDisponivel;
    }
    
    public String getStatusTroca() {
        return StatusTroca;
    }
    public void setStatusTroca(String StatusTroca) {
        this.StatusTroca = StatusTroca;
    }
    
}
