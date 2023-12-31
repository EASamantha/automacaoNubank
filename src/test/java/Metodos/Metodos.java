package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void pausar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void validarTexto(By elemento, String texto) {
		String TextoTela = driver.findElement(elemento).getText();
		System.out.println(TextoTela);
		assertEquals(texto, TextoTela);
	}

	public void pegarTexto(By elemento) {
		String TextoTela = driver.findElement(elemento).getText();
		System.out.println(TextoTela);
	}

}