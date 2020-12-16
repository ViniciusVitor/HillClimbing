package view;

import java.util.ArrayList;
import java.util.List;

import model.No;
import controller.RegraMapa;
import controller.Vizinho;

public class HillClimb {

	private List<No> atual;
	private List<No> proximo;
	private Vizinho vizinho;

	public static void main(String[] args) {

		RegraMapa mapa = new RegraMapa();
		mapa.criarRegra();

		HillClimb climp = new HillClimb();
		List<No> nos = new ArrayList<>();
		int contador = 0;

		climp.setAtual(climp.retornaAtual());

		System.out.println("\n" + ":::::::::::::::::::::::::::MINHA ENTRADA::::::::::::::::::::::::::: " + "\n"
				+ climp.getAtual());

		while (contador < 10) {

			List<No> proximaSolucao = climp.vizinho.gerarVizinho(new ArrayList<>(climp.atual));
			Double atual = mapa.valorFuncaoSolucao(climp.getAtual());
			Double proximo = mapa.valorFuncaoSolucao(proximaSolucao);

			if (atual > proximo) {
				System.out.println("\n" + contador + " - " + "Meu nó atual agora tem e peguei o (proximo): ");
				System.out.println(climp.getAtual() + "\n" + " Valor: " + proximo);
				climp.setAtual(proximaSolucao);
			} else {
				System.out.println("\n" + contador + " - " + "Meu nó atual agora tem (atual): ");
				System.out.println(climp.getAtual() + "\n" + " Valor: " + atual);
			}
			contador++;

		}
		System.out.println("\n" + contador + " ************************************************** " + "Solução Final "
				+ " ************************************************** ");
		System.out.println(climp.getAtual() + mapa.valorFuncaoSolucao(climp.getAtual()).toString());
		System.out.println("Valor solução: " + mapa.valorFuncaoSolucao(climp.getAtual()).toString());

	}

	public List<No> retornaAtual() {

		No Aracaju = new No("Aracaju");
		No Belem = new No("Belem");
		No BeloHorizonte = new No("BeloHorizonte");
		No BoaVista = new No("BoaVista");
		No Brasilia = new No("Brasilia");
		No CampoGrande = new No("CampoGrande");
		No Cuiaba = new No("Cuiaba");
		No Curitiba = new No("Curitiba");
		No Fortaleza = new No("Fortaleza");
		No Goiania = new No("Goiania");
		No JoaoPessoa = new No("JoaoPessoa");
		No Macapa = new No("Macapa");
		No Maceio = new No("Maceio");
		No Manaus = new No("Manaus");
		No Natal = new No("Natal");
		No Palmas = new No("Palmas");
		No PortoAlegre = new No("PortoAlegre");
		No PortoVelho = new No("PortoVelho");
		No Recife = new No("Recife");
		No RioBranco = new No("Rio Branco");
		No RioJaneiro = new No("RioJaneiro");
		No Salvador = new No("Salvador");
		No SaoLuis = new No("SaoLuis");
		No SaoPaulo = new No("SaoPaulo");
		No Teresina = new No("Teresina");
		No Vitoria = new No("Vitoria");
		No Florianopolis = new No("Florianopolis");

		List<No> atual = new ArrayList<>();

		atual.add(Aracaju);
		atual.add(Belem);
		atual.add(BeloHorizonte);
		atual.add(BoaVista);
		atual.add(Brasilia);
		atual.add(CampoGrande);
		atual.add(Cuiaba);
		atual.add(Curitiba);
		atual.add(Fortaleza);
		atual.add(Goiania);
		atual.add(JoaoPessoa);
		atual.add(Macapa);
		atual.add(Maceio);
		atual.add(Manaus);
		atual.add(Natal);
		atual.add(Palmas);
		atual.add(PortoAlegre);
		atual.add(PortoVelho);
		atual.add(Recife);
		atual.add(RioBranco);
		atual.add(RioJaneiro);
		atual.add(Salvador);
		atual.add(SaoLuis);
		atual.add(SaoPaulo);
		atual.add(Teresina);
		atual.add(Vitoria);
		atual.add(Florianopolis);

		return atual;

	}

	public HillClimb() {
		this.vizinho = new Vizinho();
	}

	public List<No> getAtual() {
		return atual;
	}

	public void setAtual(List<No> atual) {
		this.atual = atual;
	}

	public List<No> getProximo() {
		return proximo;
	}

	public void setProximo(List<No> proximo) {
		this.proximo = proximo;
	}

}
