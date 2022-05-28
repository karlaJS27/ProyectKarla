package navegationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaginaInicio {
	
	public PaginaInicio(WebDriver driver){
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//*[@id=\"barraIconos\"]/div[5]/div[1]/div/div[1]/div")
	private WebElement btnPerfilador;
	@FindBy(id="clienteNo")
	private WebElement btnClienteNo;
	@FindBy(id="tipoDeDocumento")
	private WebElement drpdwnTdoc;
	@FindBy(id="avanzarPerfilador")
	private WebElement siguentePerfilador;
	
	public void SeleccionPerfil() {
		
		btnPerfilador.click();
	}

	public void ProspectoClinete(String recibonom) {
		
		Select drpdwnTdoc1 = new Select(drpdwnTdoc); 
		
		btnClienteNo.click();
		
		drpdwnTdoc1.selectByValue(recibonom);
		
		siguentePerfilador.click();
		
	}
}
