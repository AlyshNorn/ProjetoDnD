package StatusPersornagem;

import java.util.Random;

public class TirarStatus {
    
    Random escolha = new Random();
	
	private int Forca;
	private int Destreza;
	private int Constituicao;
	private int Inteligencia;
	private int Sabedoria;
	private int Carisma;
	
	private int MODForca;
	private int MODDestreza;
	private int MODConstituicao;
	private int MODInteligencia;
	private int MODSabedoria;
	private int MODCarisma;
	
        public String [] TirareOrganizarInfo (){
            tirarAtributos();
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
        
        public String [] OrganizarInfo (){
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
        
	public int ValoresAtributo() {
		int [] atributo = new int [4];
		for(int cont = 0; cont<4; cont++) {
			atributo[cont] = D6();//tirar 4 numeros aleatorios
		}
		
		int menor=Math.min(Math.min(atributo[0], atributo[1]), Math.min(atributo[2], atributo[3]));//procurando o menor valor
		
		int [] neoatributos = new int [3];//criando uma nova "caixa" para os valores
		int neocont=0;
		boolean chave = false;
		
		for(int cont = 0; cont<4; cont++) {
			if(atributo[cont]!=menor || chave==true) {
				neoatributos[neocont]=atributo[cont];//adicionando todos os numeros da "caixa" antiga na nova caixa menos o menor valor
				neocont++;
			}else {
				chave=true;
			}
		}
		
		int somaAtributo = 0;
		
		for(int cont = 0; cont<3; cont++) {
			somaAtributo+=neoatributos[cont];
		}
		
		return somaAtributo;
	}
	public void tirarAtributos() {
		setForca(ValoresAtributo());
		setDestreza(ValoresAtributo());
		setConstituicao(ValoresAtributo());
		setInteligencia(ValoresAtributo());
		setSabedoria(ValoresAtributo());
		setCarisma(ValoresAtributo());
	}
	public int ValoresModificadores(int valor) {
		double valorF = valor-10;
		double MODF;
		MODF=Math.floor(valorF/2);
		int MOD=(int)MODF;
		return MOD;
	}
	public void calcularModificadores() {
		setMODForca(ValoresModificadores(this.getForca()));
		setMODDestreza(ValoresModificadores(this.getDestreza()));
		setMODConstituicao(ValoresModificadores(this.getConstituicao()));
		setMODInteligencia(ValoresModificadores(this.getInteligencia()));
		setMODSabedoria(ValoresModificadores(this.getSabedoria()));
		setMODCarisma(ValoresModificadores(this.getCarisma()));	
	}
	public int D6 () {
		return escolha.nextInt(5)+1;
	}
	
 	public int getDestreza() {
		return Destreza;
	}
	public void setDestreza(int destreza) {
		Destreza = destreza;
	}
	
	public int getConstituicao() {
		return Constituicao;
	}
	public void setConstituicao(int constituicao) {
		Constituicao = constituicao;
	}
	
	public int getInteligencia() {
		return Inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		Inteligencia = inteligencia;
	}
	
	public int getSabedoria() {
		return Sabedoria;
	}
	public void setSabedoria(int sabedoria) {
		Sabedoria = sabedoria;
	}
	
	public int getCarisma() {
		return Carisma;
	}
	public void setCarisma(int carisma) {
		Carisma = carisma;
	}
	
	public int getMODForca() {
		return MODForca;
	}
	public void setMODForca(int mODForca) {
		MODForca = mODForca;
	}
	
	public int getMODDestreza() {
		return MODDestreza;
	}
	public void setMODDestreza(int mODDestreza) {
		MODDestreza = mODDestreza;
	}
	
	public int getMODConstituicao() {
		return MODConstituicao;
	}
	public void setMODConstituicao(int mODConstituicao) {
		MODConstituicao = mODConstituicao;
	}
	
	public int getMODInteligencia() {
		return MODInteligencia;
	}
	public void setMODInteligencia(int mODInteligencia) {
		MODInteligencia = mODInteligencia;
	}
	
	public int getMODSabedoria() {
		return MODSabedoria;
	}
	public void setMODSabedoria(int mODSabedoria) {
		MODSabedoria = mODSabedoria;
	}
	
	public int getMODCarisma() {
		return MODCarisma;
	}
	public void setMODCarisma(int mODCarisma) {
		MODCarisma = mODCarisma;
	}
	
	public int getForca() {
		return Forca;
	}
	public void setForca(int forca) {
		Forca = forca;
	}
    
}
