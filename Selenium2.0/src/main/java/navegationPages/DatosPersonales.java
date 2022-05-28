package navegationPages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DatosPersonales {
	
	public DatosPersonales(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id="cliente_nombre")
	private WebElement NombreTxt;
	@FindBy (id="cliente_segundoNombre")
	private WebElement SegundoNomTxt;
	@FindBy (id="cliente_apellidoPaterno")
	private WebElement ApePaternoTxt;
	@FindBy (id="cliente_apellidoMaterno")
	private WebElement ApellMatTxt;
	@FindBy (id="emailCliente_emailPersonal")
	private WebElement EmailTxt;
	@FindBy (id="telefonoCliente_telefonoCelular")
	private WebElement TelInt;
	
	@FindBy (xpath="//*[@id=\"barraIconos\"]/div[12]/div[7]/div/button")
	private WebElement bttnSMSEnviado;
	
	@FindBy (id="cliente_codigoVerificacion")
	private WebElement CodigoTxt;
	@FindBy (id="telefonoCliente_telefonoCasa")
	private WebElement TelCasaInt;
	@FindBy (id="cliente_fechaDeNacimiento_dia")
	private WebElement DropdwnDiaFN;
	@FindBy (id="cliente_fechaDeNacimiento_mes")
	private WebElement DropdwnMesFN;
	@FindBy (id="cliente_fechaDeNacimiento_anio")
	private WebElement DropdwnAñoFN;
	@FindBy (id="cliente_genero")
	private WebElement DropDwnGenero;
	@FindBy (id="cliente_nacionalidad")
	private WebElement DropDwnNacionalidad;
	@FindBy (id="cliente_lugarDeNacimiento")
	private WebElement DropDwnEstado;
	@FindBy (id="cliente_curp")
	private WebElement CURPTxt;
	@FindBy (id="cliente_rfc")
	private WebElement RFCTxt;
	@FindBy (id="siguiente")
	private WebElement bttnSiguiente;
	
	public void DatosBCliente(String Pnombre, String Snombre, String Apaterno, String AMaterno, String Mail, String tel) {
		
		
		NombreTxt.sendKeys(Pnombre);
		SegundoNomTxt.sendKeys(Snombre);
		ApePaternoTxt.sendKeys(Apaterno);
		ApellMatTxt.sendKeys(AMaterno);
		EmailTxt.sendKeys(Mail);
		TelInt.sendKeys(tel);
		
	}
	
	public void popup() {
		
		bttnSMSEnviado.click();
	}
	
	public void SiguientesDatos(String CV, String TalCas, String DropdwnDiaFN1, String DropdwnMesFN2, String DropdwnAñoFN3, String DropDwnGenero4, String DropDwnNacionalidad5, String DropDwnEstado6) {
		
		Select DropdwDiaFN = new Select(DropdwnDiaFN);
		Select DropdwMesFN = new Select(DropdwnMesFN);
		Select DropdwAñoFN = new Select(DropdwnAñoFN);
		Select DropDwGenero = new Select(DropDwnGenero);
		Select DropDwNacionalidad = new Select (DropDwnNacionalidad);
		Select DropDwEstado = new Select (DropDwnEstado);
		
		CodigoTxt.sendKeys(CV);
		TelCasaInt.sendKeys(TalCas);
		DropdwnDiaFN.sendKeys(DropdwnDiaFN1);
		DropdwnMesFN.sendKeys(DropdwnMesFN2);
		DropdwnAñoFN.sendKeys(DropdwnAñoFN3);
		DropDwnGenero.sendKeys(DropDwnGenero4);
		DropDwnNacionalidad.sendKeys(DropDwnNacionalidad5);
		DropDwnEstado.sendKeys(DropDwnEstado6);
		
		bttnSiguiente.click();	
		
	}
	
	

}
