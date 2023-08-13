package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que esteja no site {string}")
	public void queEstejaNoSite(String url) {
		m.abrirNavegador(url);
	}

	@Given("pegue os dados de uma pessoa")
	public void pegueOsDadosDeUmaPessoa() {
		m.clicar(e.getBtnGerarPessoa());
		m.pegarTexto(e.getCampoCp());
	}

	@When("estiver no site")
	public void estiverNoSite() {
	}

	@When("preencha o campo CPF")
	public void preenchaOCampoCpf() {
	}

	@Then("realizo o cadastro")
	public void realizoOCadastro() {
	}

	@Then("valido que as informacoes foram enviadas")
	public void validoQueAsInformacoesForamEnviadas() {
	}

}
