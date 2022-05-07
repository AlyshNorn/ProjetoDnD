package dndinterfacefx;
    
import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
    
public class MainController implements Initializable {
    
    Random random = new Random();
    ListasSubRacas SR = new ListasSubRacas();
    final FileChooser FC = new FileChooser();
    
    @FXML private ListView<String>  lvStatus;
    @FXML private ComboBox<String>  bxRaca;
    @FXML private ComboBox<String>  bxSubRaca;
    @FXML private ComboBox<String>  bxClasse;
    @FXML private Button btSubRaca;
    @FXML private Label txSubRaca;
    @FXML private Button btTrocaForca;
    @FXML private Button btTrocaDestreza;
    @FXML private Button btTrocaConstituicao;
    @FXML private Button btTrocaInteligencia;
    @FXML private Button btTrocaSabedoria;
    @FXML private Button btTrocaCarisma;
    @FXML private ImageView icPersornagem;
    
    private final String [] Raca = {"Anão","Elfo","Halfling","Humano","Draconato","Gnomo","Meio-Elfo","Meio-Orc","Tiefling"};
    private final String [] Classe = {"Bárbaro","Bardo","Bruxo","Clérigo","Druida","Feiticeiro","Guerreiro","Ladino","Mago","Monge","Paladino","Patrulheiro"};
    private String [] Status;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setSubRacaInvisivel();
        bxRaca.getItems().addAll(Raca);
        bxClasse.getItems().addAll(Classe);
        aleatorizarStatus();
    }    
    
    @FXML private void SelecionarImagemPersornagem (ActionEvent event){
        FC.setTitle("Selecione a Imagem do Seu Persornagem");
        FC.setInitialDirectory(new File(System.getProperty("user.home")));
        FC.getExtensionFilters().clear();
        FC.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg"));
        
        File file = FC.showOpenDialog(null);
        
        if(file != null){
            icPersornagem.setImage(new Image(file.toURI().toString()));
        }else{
            System.out.println("Arquivo invalido!");
        }
    }
    
    public void subRacas(ActionEvent event){
        String raca = bxRaca.getValue();
        switch(raca){
            case "Anão":
                setSubRacaVisivel();
                bxSubRaca.getItems().clear();
                bxSubRaca.getItems().addAll(SR.getAnao());
                break;
            case "Elfo":
                setSubRacaVisivel();
                bxSubRaca.getItems().clear();                
                bxSubRaca.getItems().addAll(SR.getElfo());
                break;
            case "Halfling":
                setSubRacaVisivel();
                bxSubRaca.getItems().clear();
                bxSubRaca.getItems().addAll(SR.getHalfling());
                break;
            case "Draconato":
                setSubRacaVisivel();
                bxSubRaca.getItems().clear();
                bxSubRaca.getItems().addAll(SR.getDraconato());
                break;
            case "Gnomo":
                setSubRacaVisivel();
                bxSubRaca.getItems().clear();
                bxSubRaca.getItems().addAll(SR.getGnomo());
                break;
            default:
                bxSubRaca.getItems().clear();
                setSubRacaInvisivel();
        }
        
    }
    
    public void setSubRacaInvisivel (){
        txSubRaca.setVisible(false);
        btSubRaca.setVisible(false);
        bxSubRaca.setVisible(false);
    }
    public void setSubRacaVisivel (){
        txSubRaca.setVisible(true);
        btSubRaca.setVisible(true);
        bxSubRaca.setVisible(true);
    }
    
    public void superRandomize(){
        aleatorizarRacas();
        aleatorizarClasse();
        if(("Anão".equals(bxRaca.getValue())) 
                || ("Elfo".equals(bxRaca.getValue()))
                || ("Halfling".equals(bxRaca.getValue()))
                || ("Draconato".equals(bxRaca.getValue()))
                || ("Gnomo".equals(bxRaca.getValue()))
                ){
            aleatorizarSubRacas();
        }
        aleatorizarStatus();
    }
    
    public void aleatorizarRacas(){ 
        bxRaca.setValue(escolherUma(Raca));
    }
    public void aleatorizarClasse(){ 
        bxClasse.setValue(escolherUma(Classe));
    }
    public void aleatorizarStatus(){
        lvStatus.getItems().clear(); 
        Status = TS.TirareOrganizarInfo();
        lvStatus.getItems().addAll(Status);
    }
    public void aleatorizarSubRacas(){
        String raca = bxRaca.getValue();
        switch(raca){
            case "Anão":
                bxSubRaca.setValue(escolherUma(SR.getAnao()));
                break;
            case "Elfo":
                bxSubRaca.setValue(escolherUma(SR.getElfo()));
                break;
            case "Halfling":
                bxSubRaca.setValue(escolherUma(SR.getHalfling()));
                break;
            case "Draconato":
                bxSubRaca.setValue(escolherUma(SR.getDraconato()));
                break;
            case "Gnomo":
                bxSubRaca.setValue(escolherUma(SR.getGnomo()));
                break;   
            default:
                System.out.println("Nada Aq");
        } 
    }
    

    public void atualizarStatus(){
        lvStatus.getItems().clear(); 
        Status = TS.OrganizarInfo();
        lvStatus.getItems().addAll(Status);
    }
    
    public String escolherUma(String [] sr) {
		return sr [random.nextInt(sr.length)];
    }

}
