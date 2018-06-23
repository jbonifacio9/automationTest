package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import resource.webPage;


public class FaleConosco extends webPage {
    

    static RemoteWebDriver resultados = browser;
 
    WebElement nome               = resultados.findElementById("nome");
    WebElement Empresa            = resultados.findElementById("Empresa");
    WebElement Dominioo           = resultados.findElementById("Dominio0");
    WebElement duvidapara         = resultados.findElementById("duvidapara");
    WebElement horarioparacontato = resultados.findElementById("Horário para contato");
    WebElement telDDD             = resultados.findElementById("ddd");
    WebElement tel                = resultados.findElementById("telefone");
    WebElement email              = resultados.findElementById("email");
    WebElement submit             = resultados.findElementById("Enviar");
    
    
    public void inserirvalor(WebElement valor, String dados) throws Exception  {
    	
    	valor.sendKeys(dados);
    }

    public FaleConosco() throws Exception {
    	super();
    	//TODO Auto-generated constructor stub
    }
    

}

    
    
    
    
    
