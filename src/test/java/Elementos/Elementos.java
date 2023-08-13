package Elementos;

import org.openqa.selenium.By;

public class Elementos { 
	
	private By btnGerarPessoa = By.id("bt_gerar_pessoa");
	private By campoCp = By.id("cpf");
	
	private By logoInicial = By.xpath("//*[@id=\"__next\"]/div[1]/header/div/div/div[1]/div/div/a/svg");
    private By campoCpf = By.name("cpf");
    
	public By getBtnGerarPessoa() {
		return btnGerarPessoa;
	}
	public void setBtnGerarPessoa(By btnGerarPessoa) {
		this.btnGerarPessoa = btnGerarPessoa;
	}
	public By getCampoCp() {
		return campoCp;
	}
	public void setCampoCp(By campoCp) {
		this.campoCp = campoCp;
	}
	public By getLogoInicial() {
		return logoInicial;
	}
	public void setLogoInicial(By logoInicial) {
		this.logoInicial = logoInicial;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public void setCampoCpf(By campoCpf) {
		this.campoCpf = campoCpf;
	}
    
}
