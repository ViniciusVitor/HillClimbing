package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aresta;
import model.Grafo;
import model.No;

public class RegraMapa {
	private Grafo grafo;

	public RegraMapa() {
		this.grafo = new Grafo();
		this.criarRegra();
	}

	/*
	 * Cria a solução inicial
	 */
	/*
	 * public void criarRegra(){ No A = new No("A"); No B = new No("B"); No C = new
	 * No("C"); No D = new No("D"); No E = new No("E");
	 * 
	 * 
	 * 
	 * Aresta CB = new Aresta(C,B,300d); Aresta CD = new Aresta(C,D,200d); Aresta BE
	 * = new Aresta(B,E,200d); Aresta BA = new Aresta(B,A,350d); Aresta ED = new
	 * Aresta(E,D,150d); Aresta AB = new Aresta(A,D,750d);
	 * 
	 * List<Aresta> aresta = new ArrayList<>();
	 * 
	 * aresta.add(CB); aresta.add(CD); aresta.add(BE); aresta.add(BA);
	 * aresta.add(ED); aresta.add(AB);
	 * 
	 * 
	 * this.getGrafo().setArestas(aresta); }
	 */

	public void criarRegra() {

		No Aracaju = new No("Aracaju");
		No Belem = new No("Belem");
		No BeloHorizonte = new No("BeloHorizonte");
		No BoaVista = new No("BoaVista");
		No Brasilia = new No("Brasilia");
		No CampoGrande = new No("CampoGrande");
		No Cuiaba = new No("Cuiaba");
		No Curitiba = new No("Curitiba");
		No Florianopolis = new No("Florianopolis");
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
		No RioBranco = new No("RioBranco");
		No RioJaneiro = new No("RioJaneiro");
		No Salvador = new No("Salvador");
		No SaoLuis = new No("SaoLuis");
		No SaoPaulo = new No("SaoPaulo");
		No Teresina = new No("Teresina");
		No Vitoria = new No("Vitoria");

		List<Aresta> aresta = new ArrayList<>();

		// ARACAJU
		Aresta AracajuBelem = new Aresta(Aracaju, Belem, 1.641d);
		Aresta AracajuBeloHorizonte = new Aresta(Aracaju, BeloHorizonte, 1.248d);
		Aresta AracajuBoaVista = new Aresta(Aracaju, BoaVista, 3.022d);
		Aresta ArestaAracajuBrasilia = new Aresta(Aracaju, Brasilia, 1.292d);
		Aresta AracajuCampoGrande = new Aresta(Aracaju, CampoGrande, 2.155d);
		Aresta AracajuCuiaba = new Aresta(Aracaju, Cuiaba, 2.121d);
		Aresta AracajuCuritiba = new Aresta(Aracaju, Curitiba, 2.061d);
		Aresta AracajuFlorianopolis = new Aresta(Aracaju, Florianopolis, 2.207d);
		Aresta AracajuFortaleza = new Aresta(Aracaju, Fortaleza, 815d);
		Aresta AracajuGoiania = new Aresta(Aracaju, Goiania, 1.461d);
		Aresta AracajuJoaoPessoa = new Aresta(Aracaju, JoaoPessoa, 486d);
		Aresta AracajuMacapa = new Aresta(Aracaju, Macapa, 1.967d);
		Aresta AracajuMaceio = new Aresta(Aracaju, Maceio, 201d);
		Aresta AracajuManaus = new Aresta(Aracaju, Manaus, 2.673d);
		Aresta AracajuNatal = new Aresta(Aracaju, Natal, 604d);
		Aresta AracajuPalmas = new Aresta(Aracaju, Palmas, 1.235d);
		Aresta AracajuPortoAlegre = new Aresta(Aracaju, PortoAlegre, 2.580d);
		Aresta AracajuPortoVelho = new Aresta(Aracaju, PortoVelho, 2.946d);
		Aresta AracajuRecife = new Aresta(Aracaju, Recife, 398d);
		Aresta AracajuRioBranco = new Aresta(Aracaju, RioBranco, 3.359d);
		Aresta AracajuRioJaneiro = new Aresta(Aracaju, RioJaneiro, 1.482d);
		Aresta AracajuSalvador = new Aresta(Aracaju, Salvador, 277d);
		Aresta AracajuSaoLuis = new Aresta(Aracaju, SaoLuis, 1.226d);
		Aresta AracajuSaoPaulo = new Aresta(Aracaju, SaoPaulo, 1.731d);
		Aresta AracajuTeresina = new Aresta(Aracaju, Teresina, 903d);
		Aresta AracajuVitoria = new Aresta(Aracaju, Vitoria, 1.102d);

		// Adicinando arestas
		aresta.add(AracajuBelem);
		aresta.add(AracajuBeloHorizonte);
		aresta.add(AracajuBoaVista);
		aresta.add(ArestaAracajuBrasilia);
		aresta.add(AracajuCampoGrande);
		aresta.add(AracajuCuiaba);
		aresta.add(AracajuCuritiba);
		aresta.add(AracajuFlorianopolis);
		aresta.add(AracajuFortaleza);
		aresta.add(AracajuGoiania);
		aresta.add(AracajuJoaoPessoa);
		aresta.add(AracajuMacapa);
		aresta.add(AracajuMaceio);
		aresta.add(AracajuManaus);
		aresta.add(AracajuNatal);
		aresta.add(AracajuPalmas);
		aresta.add(AracajuPortoAlegre);
		aresta.add(AracajuPortoVelho);
		aresta.add(AracajuRecife);
		aresta.add(AracajuRioBranco);
		aresta.add(AracajuRioJaneiro);
		aresta.add(AracajuSalvador);
		aresta.add(AracajuSaoLuis);
		aresta.add(AracajuSaoPaulo);
		aresta.add(AracajuTeresina);
		aresta.add(AracajuVitoria);

		// BELEM
		Aresta BelemBeloHorizonte = new Aresta(Belem, BeloHorizonte, 2.111d);
		Aresta BelemBoaVista = new Aresta(Belem, BoaVista, 1.432d);
		Aresta BelemBrasilia = new Aresta(Belem, Brasilia, 1.592d);
		Aresta BelemCampoGrande = new Aresta(Belem, CampoGrande, 2.212d);
		Aresta BelemCuiaba = new Aresta(Belem, Cuiaba, 1.778d);
		Aresta BelemCuritiba = new Aresta(Belem, Curitiba, 2.665d);
		Aresta BelemFlorianopolis = new Aresta(Belem, Florianopolis, 2.904d);
		Aresta BelemFortaleza = new Aresta(Belem, Fortaleza, 1.133d);
		Aresta BelemGoiania = new Aresta(Belem, Goiania, 1.693d);
		Aresta BelemJoaoPessoa = new Aresta(Belem, JoaoPessoa, 1.636d);
		Aresta BelemMacapa = new Aresta(Belem, Macapa, 329d);
		Aresta BelemMaceio = new Aresta(Belem, Maceio, 1.680d);
		Aresta BelemManaus = new Aresta(Belem, Manaus, 1.292d);
		Aresta BelemNatal = new Aresta(Belem, Natal, 1.550d);
		Aresta BelemPalmas = new Aresta(Belem, Palmas, 973d);
		Aresta BelemPortoAlegre = new Aresta(Belem, PortoAlegre, 3.188d);
		Aresta BelemPortoVelho = new Aresta(Belem, PortoVelho, 1.886d);
		Aresta BelemRecife = new Aresta(Belem, Recife, 1.676d);
		Aresta BelemRioBranco = new Aresta(Belem, RioBranco, 2.333d);
		Aresta BelemRioJaneiro = new Aresta(Belem, RioJaneiro, 2.450d);
		Aresta BelemSalvador = new Aresta(Belem, Salvador, 1.687d);
		Aresta BelemSaoLuis = new Aresta(Belem, SaoLuis, 481d);
		Aresta BelemSaoPaulo = new Aresta(Belem, SaoPaulo, 2.463d);
		Aresta BelemTeresina = new Aresta(Belem, Teresina, 750d);
		Aresta BelemVitoria = new Aresta(Belem, Vitoria, 2.275d);

		aresta.add(BelemBeloHorizonte);
		aresta.add(BelemBoaVista);
		aresta.add(BelemBrasilia);
		aresta.add(BelemCampoGrande);
		aresta.add(BelemCuiaba);
		aresta.add(BelemCuritiba);
		aresta.add(BelemFlorianopolis);
		aresta.add(BelemFortaleza);
		aresta.add(BelemGoiania);
		aresta.add(BelemJoaoPessoa);
		aresta.add(BelemMacapa);
		aresta.add(BelemMaceio);
		aresta.add(BelemManaus);
		aresta.add(BelemNatal);
		aresta.add(BelemPalmas);
		aresta.add(BelemPortoAlegre);
		aresta.add(BelemPortoVelho);
		aresta.add(BelemRecife);
		aresta.add(BelemRioBranco);
		aresta.add(BelemRioJaneiro);
		aresta.add(BelemSalvador);
		aresta.add(BelemSaoLuis);
		aresta.add(BelemSaoPaulo);
		aresta.add(BelemTeresina);
		aresta.add(BelemVitoria);

		// Belo Horizonte
		Aresta BeloHorizonteBoaVista = new Aresta(BeloHorizonte, BoaVista, 3.117d);
		Aresta BeloHorizonteBrasilia = new Aresta(BeloHorizonte, Brasilia, 624d);
		Aresta BeloHorizonteCampoGrande = new Aresta(BeloHorizonte, CampoGrande, 1.118d);
		Aresta BeloHorizonteCuiaba = new Aresta(BeloHorizonte, Cuiaba, 1.372d);
		Aresta BeloHorizonteCuritiba = new Aresta(BeloHorizonte, Curitiba, 820d);
		Aresta BeloHorizonteFlorianopolis = new Aresta(BeloHorizonte, Florianopolis, 973d);
		Aresta BeloHorizonteFortaleza = new Aresta(BeloHorizonte, Fortaleza, 1.893d);
		Aresta BeloHorizonteGoiania = new Aresta(BeloHorizonte, Goiania, 666d);
		Aresta BeloHorizonteJoaoPessoa = new Aresta(BeloHorizonte, JoaoPessoa, 1.726d);
		Aresta BeloHorizonteMacapa = new Aresta(BeloHorizonte, Macapa, 2.349d);
		Aresta BeloHorizonteMaceio = new Aresta(BeloHorizonte, Maceio, 1.439d);
		Aresta BeloHorizonteManaus = new Aresta(BeloHorizonte, Manaus, 2.556d);
		Aresta BeloHorizonteNatal = new Aresta(BeloHorizonte, Natal, 1.831d);
		Aresta BeloHorizontePalmas = new Aresta(BeloHorizonte, Palmas, 1.178d);
		Aresta BeloHorizontePortoAlegre = new Aresta(BeloHorizonte, PortoAlegre, 1.341d);
		Aresta BeloHorizontePortoVelho = new Aresta(BeloHorizonte, PortoVelho, 2.477d);
		Aresta BeloHorizonteRecife = new Aresta(BeloHorizonte, Recife, 1.639d);
		Aresta BeloHorizonteRioBranco = new Aresta(BeloHorizonte, RioBranco, 2.786d);
		Aresta BeloHorizonteRioJaneiro = new Aresta(BeloHorizonte, RioJaneiro, 339d);
		Aresta BeloHorizonteSalvador = new Aresta(BeloHorizonte, Salvador, 964d);
		Aresta BeloHorizonteSaoLuis = new Aresta(BeloHorizonte, SaoLuis, 1.932d);
		Aresta BeloHorizonteSaoPaulo = new Aresta(BeloHorizonte, SaoPaulo, 489d);
		Aresta BeloHorizonteTeresina = new Aresta(BeloHorizonte, Teresina, 1.652d);
		Aresta BeloHorizonteVitoria = new Aresta(BeloHorizonte, Vitoria, 378d);

		aresta.add(BeloHorizonteBoaVista);
		aresta.add(BeloHorizonteBrasilia);
		aresta.add(BeloHorizonteCampoGrande);
		aresta.add(BeloHorizonteCuiaba);
		aresta.add(BeloHorizonteCuritiba);
		aresta.add(BeloHorizonteFlorianopolis);
		aresta.add(BeloHorizonteFortaleza);
		aresta.add(BeloHorizonteGoiania);
		aresta.add(BeloHorizonteJoaoPessoa);
		aresta.add(BeloHorizonteMacapa);
		aresta.add(BeloHorizonteMaceio);
		aresta.add(BeloHorizonteManaus);
		aresta.add(BeloHorizonteNatal);
		aresta.add(BeloHorizontePalmas);
		aresta.add(BeloHorizontePortoAlegre);
		aresta.add(BeloHorizontePortoVelho);
		aresta.add(BeloHorizonteRecife);
		aresta.add(BeloHorizonteRioBranco);
		aresta.add(BeloHorizonteRioJaneiro);
		aresta.add(BeloHorizonteSalvador);
		aresta.add(BeloHorizonteSaoLuis);
		aresta.add(BeloHorizonteSaoPaulo);
		aresta.add(BeloHorizonteTeresina);
		aresta.add(BeloHorizonteVitoria);

		// Boa Vista
		Aresta BoaVistaBrasilia = new Aresta(BoaVista, Brasilia, 2.496);
		aresta.add(BoaVistaBrasilia);

		Aresta BoaVistaCampoGrande = new Aresta(BoaVista, CampoGrande, 2.667);
		Aresta BoaVistaCuiaba = new Aresta(BoaVista, Cuiaba, 2.107);
		Aresta BoaVistaCuritiba = new Aresta(BoaVista, Curitiba, 3.370);
		Aresta BoaVistaFlorianopolis = new Aresta(BoaVista, Florianopolis, 3.620);
		Aresta BoaVistaFortaleza = new Aresta(BoaVista, Fortaleza, 2.562);
		Aresta BoaVistaGoiania = new Aresta(BoaVista, Goiania, 2.503);
		Aresta BoaVistaJoaoPessoa = new Aresta(BoaVista, JoaoPessoa, 3.067);
		Aresta BoaVistaMacapa = new Aresta(BoaVista, Macapa, 1.110);
		Aresta BoaVistaMaceio = new Aresta(BoaVista, Maceio, 3.089);
		Aresta BoaVistaManaus = new Aresta(BoaVista, Manaus, 661d);
		Aresta BoaVistaNatal = new Aresta(BoaVista, Natal, 2.983);
		Aresta BoaVistaPalmas = new Aresta(BoaVista, Palmas, 1.988);
		Aresta BoaVistaPortoAlegre = new Aresta(BoaVista, PortoAlegre, 3.785);
		Aresta BoaVistaPortoVelho = new Aresta(BoaVista, PortoVelho, 1.335);
		Aresta BoaVistaRecife = new Aresta(BoaVista, Recife, 3.103);
		Aresta BoaVistaRioBranco = new Aresta(BoaVista, RioBranco, 1.626);
		Aresta BoaVistaRioJaneiro = new Aresta(BoaVista, RioJaneiro, 3.428);
		Aresta BoaVistaSalvador = new Aresta(BoaVista, Salvador, 3.009);
		Aresta BoaVistaSaoLuis = new Aresta(BoaVista, SaoLuis, 1.913);
		Aresta BoaVistaSaoPaulo = new Aresta(BoaVista, SaoPaulo, 3.300);
		Aresta BoaVistaTeresina = new Aresta(BoaVista, Teresina, 2.169);
		Aresta BoaVistaVitoria = new Aresta(BoaVista, Vitoria, 3.394);

		aresta.add(BoaVistaBrasilia);
		aresta.add(BoaVistaCampoGrande);
		aresta.add(BoaVistaCuiaba);
		aresta.add(BoaVistaCuritiba);
		aresta.add(BoaVistaFlorianopolis);
		aresta.add(BoaVistaFortaleza);
		aresta.add(BoaVistaGoiania);
		aresta.add(BoaVistaJoaoPessoa);
		aresta.add(BoaVistaMacapa);
		aresta.add(BoaVistaMaceio);
		aresta.add(BoaVistaManaus);
		aresta.add(BoaVistaNatal);
		aresta.add(BoaVistaPalmas);
		aresta.add(BoaVistaPortoAlegre);
		aresta.add(BoaVistaPortoVelho);
		aresta.add(BoaVistaRecife);
		aresta.add(BoaVistaRioBranco);
		aresta.add(BoaVistaRioJaneiro);
		aresta.add(BoaVistaSalvador);
		aresta.add(BoaVistaSaoLuis);
		aresta.add(BoaVistaSaoPaulo);
		aresta.add(BoaVistaTeresina);
		aresta.add(BoaVistaVitoria);

		// Brasilia
		Aresta BrasiliaCampoGrande = new Aresta(Brasilia, CampoGrande, 878d);
		Aresta BrasiliaCuiaba = new Aresta(Brasilia, Cuiaba, 873d);
		Aresta BrasiliaCuritiba = new Aresta(Brasilia, Curitiba, 1.081);
		Aresta BrasiliaFlorianopolis = new Aresta(Brasilia, Florianopolis, 1.314);
		Aresta BrasiliaFortaleza = new Aresta(Brasilia, Fortaleza, 1.687);
		Aresta BrasiliaGoiania = new Aresta(Brasilia, Goiania, 173d);
		Aresta BrasiliaJoaoPessoa = new Aresta(Brasilia, JoaoPessoa, 1.716);
		Aresta BrasiliaMacapa = new Aresta(Brasilia, Macapa, 1.791);
		Aresta BrasiliaMaceio = new Aresta(Brasilia, Maceio, 1.485);
		Aresta BrasiliaManaus = new Aresta(Brasilia, Manaus, 1.932);
		Aresta BrasiliaNatal = new Aresta(Brasilia, Natal, 1.775);
		Aresta BrasiliaPalmas = new Aresta(Brasilia, Palmas, 620d);
		Aresta BrasiliaPortoAlegre = new Aresta(Brasilia, PortoAlegre, 1.619);
		Aresta BrasiliaPortoVelho = new Aresta(Brasilia, PortoVelho, 1.900);
		Aresta BrasiliaRecife = new Aresta(Brasilia, Recife, 1.657);
		Aresta BrasiliaRioBranco = new Aresta(Brasilia, RioBranco, 2.246);
		Aresta BrasiliaRioJaneiro = new Aresta(Brasilia, RioJaneiro, 933d);
		Aresta BrasiliaSalvador = new Aresta(Brasilia, Salvador, 1.060);
		Aresta BrasiliaSaoLuis = new Aresta(Brasilia, SaoLuis, 1.524);
		Aresta BrasiliaSaoPaulo = new Aresta(Brasilia, SaoPaulo, 873d);
		Aresta BrasiliaTeresina = new Aresta(Brasilia, Teresina, 1.313);
		Aresta BrasiliaVitoria = new Aresta(Brasilia, Vitoria, 947d);

		aresta.add(BrasiliaCampoGrande);
		aresta.add(BrasiliaCuiaba);
		aresta.add(BrasiliaCuritiba);
		aresta.add(BrasiliaFlorianopolis);
		aresta.add(BrasiliaFortaleza);
		aresta.add(BrasiliaGoiania);
		aresta.add(BrasiliaJoaoPessoa);
		aresta.add(BrasiliaMacapa);
		aresta.add(BrasiliaMaceio);
		aresta.add(BrasiliaManaus);
		aresta.add(BrasiliaNatal);
		aresta.add(BrasiliaPalmas);
		aresta.add(BrasiliaPortoAlegre);
		aresta.add(BrasiliaPortoVelho);
		aresta.add(BrasiliaRecife);
		aresta.add(BrasiliaRioBranco);
		aresta.add(BrasiliaRioJaneiro);
		aresta.add(BrasiliaSalvador);
		aresta.add(BrasiliaSaoLuis);
		aresta.add(BrasiliaSaoPaulo);
		aresta.add(BrasiliaTeresina);
		aresta.add(BrasiliaVitoria);

		// Campo Grande
		Aresta CampoGrandeCuiaba = new Aresta(CampoGrande, Cuiaba, 559d);
		Aresta CampoGrandeCuritiba = new Aresta(CampoGrande, Curitiba, 780d);
		Aresta CampoGrandeFlorianopolis = new Aresta(CampoGrande, Florianopolis, 1.007);
		Aresta CampoGrandeFortaleza = new Aresta(CampoGrande, Fortaleza, 2.547);
		Aresta CampoGrandeGoiania = new Aresta(CampoGrande, Goiania, 705d);
		Aresta CampoGrandeJoaoPessoa = new Aresta(CampoGrande, JoaoPessoa, 2.593);
		Aresta CampoGrandeMacapa = new Aresta(CampoGrande, Macapa, 2.309);
		Aresta CampoGrandeMaceio = new Aresta(CampoGrande, Maceio, 2.352);
		Aresta CampoGrandeManaus = new Aresta(CampoGrande, Manaus, 2.013);
		Aresta CampoGrandeNatal = new Aresta(CampoGrande, Natal, 2.654);
		Aresta CampoGrandePalmas = new Aresta(CampoGrande, Palmas, 1.320);
		Aresta CampoGrandePortoAlegre = new Aresta(CampoGrande, PortoAlegre, 1.119);
		Aresta CampoGrandePortoVelho = new Aresta(CampoGrande, PortoVelho, 1.634);
		Aresta CampoGrandeRecife = new Aresta(CampoGrande, Recife, 2.530);
		Aresta CampoGrandeRioBranco = new Aresta(CampoGrande, RioBranco, 1.827);
		Aresta CampoGrandeRioJaneiro = new Aresta(CampoGrande, RioJaneiro, 1.212);
		Aresta CampoGrandeSalvador = new Aresta(CampoGrande, Salvador, 1.905);
		Aresta CampoGrandeSaoLuis = new Aresta(CampoGrande, SaoLuis, 2.284);
		Aresta CampoGrandeSaoPaulo = new Aresta(CampoGrande, SaoPaulo, 894d);
		Aresta CampoGrandeTeresina = new Aresta(CampoGrande, Teresina, 2.132);
		Aresta CampoGrandeVitoria = new Aresta(CampoGrande, Vitoria, 1.490);

		aresta.add(CampoGrandeCuiaba);
		aresta.add(CampoGrandeCuritiba);
		aresta.add(CampoGrandeFlorianopolis);
		aresta.add(CampoGrandeFortaleza);
		aresta.add(CampoGrandeGoiania);
		aresta.add(CampoGrandeJoaoPessoa);
		aresta.add(CampoGrandeMacapa);
		aresta.add(CampoGrandeMaceio);
		aresta.add(CampoGrandeManaus);
		aresta.add(CampoGrandeNatal);
		aresta.add(CampoGrandePalmas);
		aresta.add(CampoGrandePortoAlegre);
		aresta.add(CampoGrandePortoVelho);
		aresta.add(CampoGrandeRecife);
		aresta.add(CampoGrandeRioBranco);
		aresta.add(CampoGrandeRioJaneiro);
		aresta.add(CampoGrandeSalvador);
		aresta.add(CampoGrandeSaoLuis);
		aresta.add(CampoGrandeSaoPaulo);
		aresta.add(CampoGrandeTeresina);
		aresta.add(CampoGrandeVitoria);

		// Cuiaba
		Aresta CuiabaCuritiba = new Aresta(Cuiaba, Curitiba, 1.302);
		Aresta CuiabaFlorianopolis = new Aresta(Cuiaba, Florianopolis, 1.543);
		Aresta CuiabaFortaleza = new Aresta(Cuiaba, Fortaleza, 2.329);
		Aresta CuiabaGoiania = new Aresta(Cuiaba, Goiania, 740d);
		Aresta CuiabaJoaoPessoa = new Aresta(Cuiaba, JoaoPessoa, 2.495);
		Aresta CuiabaMacapa = new Aresta(Cuiaba, Macapa, 1.822);
		Aresta CuiabaMaceio = new Aresta(Cuiaba, Maceio, 2.302);
		Aresta CuiabaManaus = new Aresta(Cuiaba, Manaus, 1.453);
		Aresta CuiabaNatal = new Aresta(Cuiaba, Natal, 2.524);
		Aresta CuiabaPalmas = new Aresta(Cuiaba, Palmas, 1.029);
		Aresta CuiabaPortoAlegre = new Aresta(Cuiaba, PortoAlegre, 1.679);
		Aresta CuiabaPortoVelho = new Aresta(Cuiaba, PortoVelho, 1.137);
		Aresta CuiabaRecife = new Aresta(Cuiaba, Recife, 2.452);
		Aresta CuiabaRioBranco = new Aresta(Cuiaba, RioBranco, 1.414);
		Aresta CuiabaRioJaneiro = new Aresta(Cuiaba, RioJaneiro, 1.575);
		Aresta CuiabaSalvador = new Aresta(Cuiaba, Salvador, 1.915);
		Aresta CuiabaSaoLuis = new Aresta(Cuiaba, SaoLuis, 1.942);
		Aresta CuiabaSaoPaulo = new Aresta(Cuiaba, SaoPaulo, 1.326);
		Aresta CuiabaTeresina = new Aresta(Cuiaba, Teresina, 1.862);
		Aresta dCuiabaVitoria = new Aresta(Cuiaba, Vitoria, 1.745);

		aresta.add(CuiabaCuritiba);
		aresta.add(CuiabaFlorianopolis);
		aresta.add(CuiabaFortaleza);
		aresta.add(CuiabaGoiania);
		aresta.add(CuiabaJoaoPessoa);
		aresta.add(CuiabaMacapa);
		aresta.add(CuiabaMaceio);
		aresta.add(CuiabaManaus);
		aresta.add(CuiabaNatal);
		aresta.add(CuiabaPalmas);
		aresta.add(CuiabaPortoAlegre);
		aresta.add(CuiabaPortoVelho);
		aresta.add(CuiabaRecife);
		aresta.add(CuiabaRioBranco);
		aresta.add(CuiabaRioJaneiro);
		aresta.add(CuiabaSalvador);
		aresta.add(CuiabaSaoLuis);
		aresta.add(CuiabaSaoPaulo);
		aresta.add(CuiabaTeresina);
		aresta.add(dCuiabaVitoria);

		// Curitiba
		Aresta CuritibaFlorianopolis = new Aresta(Curitiba, Florianopolis, 251d);
		Aresta CuritibaFortaleza = new Aresta(Curitiba, Fortaleza, 2.670);
		Aresta CuritibaGoiania = new Aresta(Curitiba, Goiania, 972d);
		Aresta CuritibaJoaoPessoa = new Aresta(Curitiba, JoaoPessoa, 2.545);
		Aresta CuritibaMacapa = new Aresta(Curitiba, Macapa, 2.836);
		Aresta CuritibaMaceio = new Aresta(Curitiba, Maceio, 2.259);
		Aresta CuritibaManaus = new Aresta(Curitiba, Manaus, 2.734);
		Aresta CuritibaNatal = new Aresta(Curitiba, Natal, 2.645);
		Aresta CuritibaPalmas = new Aresta(Curitiba, Palmas, 1.693);
		Aresta CuritibaPortoAlegre = new Aresta(Curitiba, PortoAlegre, 546d);
		Aresta CuritibaPortoVelho = new Aresta(Curitiba, PortoVelho, 2.412);
		Aresta CuritibaRecife = new Aresta(Curitiba, Recife, 2.459);
		Aresta CuritibaRioBranco = new Aresta(Curitiba, RioBranco, 2.601);
		Aresta CuritibaRioJaneiro = new Aresta(Curitiba, RioJaneiro, 675d);
		Aresta CuritibaSalvador = new Aresta(Curitiba, Salvador, 1.784);
		Aresta CuritibaSaoLuis = new Aresta(Curitiba, SaoLuis, 2.599);
		Aresta CuritibaSaoPaulo = new Aresta(Curitiba, SaoPaulo, 338d);
		Aresta CuritibaTeresina = new Aresta(Curitiba, Teresina, 2.362);
		Aresta CuritibaVitoria = new Aresta(Curitiba, Vitoria, 1.076);

		aresta.add(CuritibaFlorianopolis);
		aresta.add(CuritibaFortaleza);
		aresta.add(CuritibaGoiania);
		aresta.add(CuritibaJoaoPessoa);
		aresta.add(CuritibaMacapa);
		aresta.add(CuritibaMaceio);
		aresta.add(CuritibaManaus);
		aresta.add(CuritibaNatal);
		aresta.add(CuritibaPalmas);
		aresta.add(CuritibaPortoAlegre);
		aresta.add(CuritibaPortoVelho);
		aresta.add(CuritibaRecife);
		aresta.add(CuritibaRioBranco);
		aresta.add(CuritibaRioJaneiro);
		aresta.add(CuritibaSalvador);
		aresta.add(CuritibaSaoLuis);
		aresta.add(CuritibaSaoPaulo);
		aresta.add(CuritibaTeresina);
		aresta.add(CuritibaVitoria);

		// Florianopolis
		Aresta FlorianopolisFortaleza = new Aresta(Florianopolis, Fortaleza, 2.857);
		Aresta FlorianopolisGoiania = new Aresta(Florianopolis, Goiania, 1.215);
		Aresta FlorianopolisJoaoPessoa = new Aresta(Florianopolis, JoaoPessoa, 2.693);
		Aresta FlorianopolisMacapa = new Aresta(Florianopolis, Macapa, 3.082);
		Aresta FlorianopolisMaceio = new Aresta(Florianopolis, Maceio, 2.402);
		Aresta FlorianopolisManaus = new Aresta(Florianopolis, Manaus, 2.981);
		Aresta FlorianopolisNatal = new Aresta(Florianopolis, Natal, 2.802);
		Aresta FlorianopolisPalmas = new Aresta(Florianopolis, Palmas, 1.931);
		Aresta FlorianopolisPortoAlegre = new Aresta(Florianopolis, PortoAlegre, 376d);
		Aresta FlorianopolisPortoVelho = new Aresta(Florianopolis, PortoVelho, 2.641);
		Aresta FlorianopolisRecife = new Aresta(Florianopolis, Recife, 2.603);
		Aresta FlorianopolisRioBranco = new Aresta(Florianopolis, RioBranco, 2.809);
		Aresta FlorianopolisRioJaneiro = new Aresta(Florianopolis, RioJaneiro, 748d);
		Aresta FlorianopolisSalvador = new Aresta(Florianopolis, Salvador, 1.930);
		Aresta FlorianopolisSaoLuis = new Aresta(Florianopolis, SaoLuis, 2.821);
		Aresta FlorianopolisSaoPaulo = new Aresta(Florianopolis, SaoPaulo, 489d);
		Aresta FlorianopolisTeresina = new Aresta(Florianopolis, Teresina, 2.573);
		Aresta FlorianopolisVitoria = new Aresta(Florianopolis, Vitoria, 1.160);

		aresta.add(FlorianopolisFortaleza);
		aresta.add(FlorianopolisGoiania);
		aresta.add(FlorianopolisJoaoPessoa);
		aresta.add(FlorianopolisMacapa);
		aresta.add(FlorianopolisMaceio);
		aresta.add(FlorianopolisManaus);
		aresta.add(FlorianopolisNatal);
		aresta.add(FlorianopolisPalmas);
		aresta.add(FlorianopolisPortoAlegre);
		aresta.add(FlorianopolisPortoVelho);
		aresta.add(FlorianopolisRecife);
		aresta.add(FlorianopolisRioBranco);
		aresta.add(FlorianopolisRioJaneiro);
		aresta.add(FlorianopolisSalvador);
		aresta.add(FlorianopolisSaoLuis);
		aresta.add(FlorianopolisSaoPaulo);
		aresta.add(FlorianopolisTeresina);
		aresta.add(FlorianopolisVitoria);

		// Fortaleza
		Aresta FortalezaGoiania = new Aresta(Fortaleza, Goiania, 1.854);
		Aresta FortalezaJoaoPessoa = new Aresta(Fortaleza, JoaoPessoa, 555d);
		Aresta FortalezaMacapa = new Aresta(Fortaleza, Macapa, 1.451d);
		Aresta FortalezaMaceio = new Aresta(Fortaleza, Maceio, 730d);
		Aresta FortalezaManaus = new Aresta(Fortaleza, Manaus, 2.383);
		Aresta FortalezaNatal = new Aresta(Fortaleza, Natal, 435d);
		Aresta FortalezaPalmas = new Aresta(Fortaleza, Palmas, 1.300);
		Aresta FortalezaPortoAlegre = new Aresta(Fortaleza, PortoAlegre, 3.213);
		Aresta FortalezaPortoVelho = new Aresta(Fortaleza, PortoVelho, 2.855);
		Aresta FortalezaRecife = new Aresta(Fortaleza, Recife, 629d);
		Aresta FortalezaRioBranco = new Aresta(Fortaleza, RioBranco, 3.300);
		Aresta FortalezaRioJaneiro = new Aresta(Fortaleza, RioJaneiro, 2.190);
		Aresta FortalezaSalvador = new Aresta(Fortaleza, Salvador, 1.028);
		Aresta FortalezaSaoLuis = new Aresta(Fortaleza, SaoLuis, 652d);
		Aresta FortalezaSaoPaulo = new Aresta(Fortaleza, SaoPaulo, 2.368);
		Aresta FortalezaTeresina = new Aresta(Fortaleza, Teresina, 495d);
		Aresta FortalezaVitoria = new Aresta(Fortaleza, Vitoria, 1.855);

		aresta.add(FortalezaGoiania);
		aresta.add(FortalezaJoaoPessoa);
		aresta.add(FortalezaMacapa);
		aresta.add(FortalezaMaceio);
		aresta.add(FortalezaManaus);
		aresta.add(FortalezaNatal);
		aresta.add(FortalezaPalmas);
		aresta.add(FortalezaPortoAlegre);
		aresta.add(FortalezaPortoVelho);
		aresta.add(FortalezaRecife);
		aresta.add(FortalezaRioBranco);
		aresta.add(FortalezaRioJaneiro);
		aresta.add(FortalezaSalvador);
		aresta.add(FortalezaSaoLuis);
		aresta.add(FortalezaSaoPaulo);
		aresta.add(FortalezaTeresina);
		aresta.add(FortalezaVitoria);

		// Goiania
		Aresta GoianiaJoaoPessoa = new Aresta(Goiania, JoaoPessoa, 1.889);
		Aresta GoianiaMacapa = new Aresta(Goiania, Macapa, 1.868);
		Aresta GoianiaMaceio = new Aresta(Goiania, Maceio, 1.656);
		Aresta GoianiaManaus = new Aresta(Goiania, Manaus, 1.912);
		Aresta GoianiaNatal = new Aresta(Goiania, Natal, 1.948);
		Aresta GoianiaPalmas = new Aresta(Goiania, Palmas, 724d);
		Aresta GoianiaPortoAlegre = new Aresta(Goiania, PortoAlegre, 1.497);
		Aresta GoianiaPortoVelho = new Aresta(Goiania, PortoVelho, 1.813);
		Aresta GoianiaRecife = new Aresta(Goiania, Recife, 1.829);
		Aresta GoianiaRioBranco = new Aresta(Goiania, RioBranco, 2.138);
		Aresta GoianiaRioJaneiro = new Aresta(Goiania, RioJaneiro, 936d);
		Aresta GoianiaSalvador = new Aresta(Goiania, Salvador, 1.225);
		Aresta GoianiaSaoLuis = new Aresta(Goiania, SaoLuis, 1.662);
		Aresta GoianiaSaoPaulo = new Aresta(Goiania, SaoPaulo, 810d);
		Aresta GoianiaTeresina = new Aresta(Goiania, Teresina, 1.467);
		Aresta GoianiaVitoria = new Aresta(Goiania, Vitoria, 1.022);

		aresta.add(GoianiaJoaoPessoa);
		aresta.add(GoianiaMacapa);
		aresta.add(GoianiaMaceio);
		aresta.add(GoianiaManaus);
		aresta.add(GoianiaNatal);
		aresta.add(GoianiaPalmas);
		aresta.add(GoianiaPortoAlegre);
		aresta.add(GoianiaPortoVelho);
		aresta.add(GoianiaRecife);
		aresta.add(GoianiaRioBranco);
		aresta.add(GoianiaRioJaneiro);
		aresta.add(GoianiaSalvador);
		aresta.add(GoianiaSaoLuis);
		aresta.add(GoianiaSaoPaulo);
		aresta.add(GoianiaTeresina);
		aresta.add(GoianiaVitoria);

		// Joao Pessoa
		Aresta JoaoPessoaMacapa = new Aresta(JoaoPessoa, Macapa, 1.964);
		Aresta JoaoPessoaMaceio = new Aresta(JoaoPessoa, Maceio, 299d);
		Aresta JoaoPessoaManaus = new Aresta(JoaoPessoa, Manaus, 2.819);
		Aresta JoaoPessoaNatal = new Aresta(JoaoPessoa, Natal, 151d);
		Aresta JoaoPessoaPalmas = new Aresta(JoaoPessoa, Palmas, 1.521);
		Aresta JoaoPessoaPortoAlegre = new Aresta(JoaoPessoa, PortoAlegre, 3.066);
		Aresta JoaoPessoaPortoVelho = new Aresta(JoaoPessoa, PortoVelho, 3.200);
		Aresta JoaoPessoaRecife = new Aresta(JoaoPessoa, Recife, 104d);
		Aresta JoaoPessoaRioBranco = new Aresta(JoaoPessoa, RioBranco, 3.632);
		Aresta JoaoPessoaRioJaneiro = new Aresta(JoaoPessoa, RioJaneiro, 1.968);
		Aresta oaoPessoaSalvador = new Aresta(JoaoPessoa, Salvador, 763d);
		Aresta JoaoPessoaSaoLuis = new Aresta(JoaoPessoa, SaoLuis, 1.162);
		Aresta JoaoPessoaSaoPaulo = new Aresta(JoaoPessoa, SaoPaulo, 2.216);
		Aresta JoaoPessoaTeresina = new Aresta(JoaoPessoa, Teresina, 905d);
		Aresta JoaoPessoaVitoria = new Aresta(JoaoPessoa, Vitoria, 1.581);

		aresta.add(JoaoPessoaMacapa);
		aresta.add(JoaoPessoaMaceio);
		aresta.add(JoaoPessoaManaus);
		aresta.add(JoaoPessoaNatal);
		aresta.add(JoaoPessoaPalmas);
		aresta.add(JoaoPessoaPortoAlegre);
		aresta.add(JoaoPessoaPortoVelho);
		aresta.add(JoaoPessoaRecife);
		aresta.add(JoaoPessoaRioBranco);
		aresta.add(JoaoPessoaRioJaneiro);
		aresta.add(oaoPessoaSalvador);
		aresta.add(oaoPessoaSalvador);
		aresta.add(JoaoPessoaSaoPaulo);
		aresta.add(JoaoPessoaTeresina);
		aresta.add(JoaoPessoaVitoria);

		// Macapa
		Aresta MacapaMaceio = new Aresta(Macapa, Maceio, 2.009);
		Aresta MacapaManaus = new Aresta(Macapa, Manaus, 1.054);
		Aresta MacapaNatal = new Aresta(Macapa, Natal, 1.874);
		Aresta MacapaPalmas = new Aresta(Macapa, Palmas, 1.177);
		Aresta MacapaPortoAlegre = new Aresta(Macapa, PortoAlegre, 3.341);
		Aresta MacapaPortoVelho = new Aresta(Macapa, PortoVelho, 1.724);
		Aresta MacapaRecife = new Aresta(Macapa, Recife, 2.005);
		Aresta MacapaRioBranco = new Aresta(Macapa, RioBranco, 2.159);
		Aresta MacapaRioJaneiro = new Aresta(Macapa, RioJaneiro, 2.687);
		Aresta MacapaSalvador = new Aresta(Macapa, Salvador, 2.000);
		Aresta MacapaSaoLuis = new Aresta(Macapa, SaoLuis, 803d);
		Aresta MacapaSaoPaulo = new Aresta(Macapa, SaoPaulo, 2.664);
		Aresta MacapaTeresina = new Aresta(Macapa, Teresina, 1.079);
		Aresta MacapaVitoria = new Aresta(Macapa, Vitoria, 2.545);

		aresta.add(MacapaMaceio);
		aresta.add(MacapaManaus);
		aresta.add(MacapaNatal);
		aresta.add(MacapaPalmas);
		aresta.add(MacapaPortoAlegre);
		aresta.add(MacapaPortoVelho);
		aresta.add(MacapaRecife);
		aresta.add(MacapaRioBranco);
		aresta.add(MacapaRioJaneiro);
		aresta.add(MacapaSalvador);
		aresta.add(MacapaSaoLuis);
		aresta.add(MacapaSaoPaulo);
		aresta.add(MacapaTeresina);
		aresta.add(MacapaVitoria);

		// Maceio
		Aresta MaceioManaus = new Aresta(Maceio, Manaus, 2.778);
		Aresta MaceioNatal = new Aresta(Maceio, Natal, 434d);
		Aresta MaceioPalmas = new Aresta(Maceio, Palmas, 1.383);
		Aresta MaceioPortoAlegre = new Aresta(Maceio, PortoAlegre, 2.775);
		Aresta MaceioPortoVelho = new Aresta(Maceio, PortoVelho, 3.090);
		Aresta MaceioRecife = new Aresta(Maceio, Recife, 202d);
		Aresta MaceioRioBranco = new Aresta(Maceio, RioBranco, 3.510);
		Aresta MaceioRioJaneiro = new Aresta(Maceio, RioJaneiro, 1.671);
		Aresta MaceioSalvador = new Aresta(Maceio, Salvador, 475d);
		Aresta MaceioSaoLuis = new Aresta(Maceio, SaoLuis, 1.234);
		Aresta MaceioSaoPaulo = new Aresta(Maceio, SaoPaulo, 1.928);
		Aresta MaceioTeresina = new Aresta(Maceio, Teresina, 929d);
		Aresta MaceioVitoria = new Aresta(Maceio, Vitoria, 1.282);

		aresta.add(MaceioManaus);
		aresta.add(MaceioNatal);
		aresta.add(MaceioPalmas);
		aresta.add(MaceioPortoAlegre);
		aresta.add(MaceioPortoVelho);
		aresta.add(MaceioRecife);
		aresta.add(MaceioRioBranco);
		aresta.add(MaceioRioJaneiro);
		aresta.add(MaceioSalvador);
		aresta.add(MaceioSaoLuis);
		aresta.add(MaceioSaoPaulo);
		aresta.add(MaceioTeresina);
		aresta.add(MaceioVitoria);

		// Manaus
		Aresta ManausNatal = new Aresta(Manaus, Natal, 2.765);
		Aresta ManausPalmas = new Aresta(Manaus, Palmas, 1.509);
		Aresta ManausPortoAlegre = new Aresta(Manaus, PortoAlegre, 3.132);
		Aresta ManausPortoVelho = new Aresta(Manaus, PortoVelho, 761d);
		Aresta ManausRecife = new Aresta(Manaus, Recife, 2.833);
		Aresta ManausRioBranco = new Aresta(Manaus, RioBranco, 1.149);
		Aresta ManausRioJaneiro = new Aresta(Manaus, RioJaneiro, 2.849);
		Aresta ManausSalvador = new Aresta(Manaus, Salvador, 2.605);
		Aresta ManausSaoLuis = new Aresta(Manaus, SaoLuis, 1.746);
		Aresta ManausSaoPaulo = new Aresta(Manaus, SaoPaulo, 2.689);
		Aresta ManausTeresina = new Aresta(Manaus, Teresina, 1.921);
		Aresta ManausVitoria = new Aresta(Manaus, Vitoria, 2.865);

		aresta.add(ManausNatal);
		aresta.add(ManausPalmas);
		aresta.add(ManausPortoAlegre);
		aresta.add(ManausPortoVelho);
		aresta.add(ManausRecife);
		aresta.add(ManausRioBranco);
		aresta.add(ManausRioJaneiro);
		aresta.add(ManausSalvador);
		aresta.add(ManausSaoLuis);
		aresta.add(ManausSaoPaulo);
		aresta.add(ManausTeresina);
		aresta.add(ManausVitoria);

		// Natal
		Aresta NatalPalmas = new Aresta(Natal, Palmas, 1.527);
		Aresta NatalPortoAlegre = new Aresta(Natal, PortoAlegre, 3.172);
		Aresta NatalPortoVelho = new Aresta(Natal, PortoVelho, 3.179);
		Aresta NatalRecife = new Aresta(Natal, Recife, 253d);
		Aresta NatalRioBranco = new Aresta(Natal, RioBranco, 3.616);
		Aresta NatalRioJaneiro = new Aresta(Natal, RioJaneiro, 2.085);
		Aresta NatalSalvador = new Aresta(Natal, Salvador, 875d);
		Aresta NatalSaoLuis = new Aresta(Natal, SaoLuis, 1.071);
		Aresta NatalSaoPaulo = new Aresta(Natal, SaoPaulo, 2.320);
		Aresta NatalTeresina = new Aresta(Natal, Teresina, 843d);
		Aresta NatalVitoria = new Aresta(Natal, Vitoria, 1.706);

		aresta.add(NatalPalmas);
		aresta.add(NatalPortoAlegre);
		aresta.add(NatalPortoVelho);
		aresta.add(NatalRecife);
		aresta.add(NatalRioBranco);
		aresta.add(NatalRioJaneiro);
		aresta.add(NatalSalvador);
		aresta.add(NatalSaoLuis);
		aresta.add(NatalSaoPaulo);
		aresta.add(NatalTeresina);
		aresta.add(NatalVitoria);

		// Palmas
		Aresta PalmasPortoAlegre = new Aresta(Palmas, PortoAlegre, 2.222);
		Aresta PalmasPortoVelho = new Aresta(Palmas, PortoVelho, 1.711);
		Aresta PalmasRecife = new Aresta(Palmas, Recife, 1.498);
		Aresta PalmasRioBranco = new Aresta(Palmas, RioBranco, 2.127);
		Aresta PalmasRioJaneiro = new Aresta(Palmas, RioJaneiro, 1.512);
		Aresta PalmasSalvador = new Aresta(Palmas, Salvador, 1.114);
		Aresta PalmasSaoLuis = new Aresta(Palmas, SaoLuis, 964d);
		Aresta PalmasSaoPaulo = new Aresta(Palmas, SaoPaulo, 1.493);
		Aresta PalmasTeresina = new Aresta(Palmas, Teresina, 835d);
		Aresta PalmasVitoria = new Aresta(Palmas, Vitoria, 1.413);

		aresta.add(PalmasPortoAlegre);
		aresta.add(PalmasPortoVelho);
		aresta.add(PalmasRecife);
		aresta.add(PalmasRioBranco);
		aresta.add(PalmasRioJaneiro);
		aresta.add(PalmasSalvador);
		aresta.add(PalmasSaoLuis);
		aresta.add(PalmasSaoPaulo);
		aresta.add(PalmasTeresina);
		aresta.add(PalmasVitoria);

		// Porto Alegre
		Aresta PortoAlegrePortoVelho = new Aresta(PortoAlegre, PortoVelho, 2.706);
		Aresta PortoAlegreRecife = new Aresta(PortoAlegre, Recife, 2.977);
		Aresta PortoAlegreRioBranco = new Aresta(PortoAlegre, RioBranco, 2.814);
		Aresta PortoAlegreRioJaneiro = new Aresta(PortoAlegre, RioJaneiro, 1.123);
		Aresta PortoAlegreSalvador = new Aresta(PortoAlegre, Salvador, 2.303);
		Aresta PortoAlegreSaoLuis = new Aresta(PortoAlegre, SaoLuis, 3.142);
		Aresta PortoAlegreSaoPaulo = new Aresta(PortoAlegre, SaoPaulo, 852d);
		Aresta PortoAlegreTeresina = new Aresta(PortoAlegre, Teresina, 2.909);
		Aresta PortoAlegreVitoria = new Aresta(PortoAlegre, Vitoria, 1.536);

		aresta.add(PortoAlegrePortoVelho);
		aresta.add(PortoAlegreRecife);
		aresta.add(PortoAlegreRioBranco);
		aresta.add(PortoAlegreRioJaneiro);
		aresta.add(PortoAlegreSalvador);
		aresta.add(PortoAlegreSaoLuis);
		aresta.add(PortoAlegreSaoPaulo);
		aresta.add(PortoAlegreTeresina);
		aresta.add(PortoAlegreVitoria);

		// Porto Velho
		Aresta PortoVelhoRecife = new Aresta(PortoVelho, Recife, 3.190);
		Aresta PortoVelhoRioBranco = new Aresta(PortoVelho, RioBranco, 449d);
		Aresta PortoVelhoRioJaneiro = new Aresta(PortoVelho, RioJaneiro, 2.707);
		Aresta PortoVelhoSalvador = new Aresta(PortoVelho, Salvador, 2.808);
		Aresta PortoVelhoSaoLuis = new Aresta(PortoVelho, SaoLuis, 2.274);
		Aresta PortoVelhoSaoPaulo = new Aresta(PortoVelho, SaoPaulo, 2.463);
		Aresta PortoVelhoTeresina = new Aresta(PortoVelho, Teresina, 2.362);
		Aresta PortoVelhoVitoria = new Aresta(PortoVelho, Vitoria, 2.835);

		aresta.add(PortoVelhoRecife);
		aresta.add(PortoVelhoRioBranco);
		aresta.add(PortoVelhoRioJaneiro);
		aresta.add(PortoVelhoSalvador);
		aresta.add(PortoVelhoSaoLuis);
		aresta.add(PortoVelhoSaoPaulo);
		aresta.add(PortoVelhoTeresina);
		aresta.add(PortoVelhoVitoria);

		// Recife
		Aresta RecifeRioBranco = new Aresta(Recife, RioBranco, 3.618);
		Aresta RecifeRioJaneiro = new Aresta(Recife, RioJaneiro, 1.874);
		Aresta RecifeSalvador = new Aresta(Recife, Salvador, 675d);
		Aresta RecifeSaoLuis = new Aresta(Recife, SaoLuis, 1.209);
		Aresta RecifeSaoPaulo = new Aresta(Recife, SaoPaulo, 2.128);
		Aresta RecifeTeresina = new Aresta(Recife, Teresina, 934d);
		Aresta RecifeVitoria = new Aresta(Recife, Vitoria, 1.483);

		aresta.add(RecifeRioBranco);
		aresta.add(RecifeRioJaneiro);
		aresta.add(RecifeSalvador);
		aresta.add(RecifeSaoLuis);
		aresta.add(RecifeSaoPaulo);
		aresta.add(RecifeTeresina);
		aresta.add(RecifeVitoria);

		// RioBranco
		Aresta RioBrancoRioJaneiro = new Aresta(RioBranco, RioJaneiro, 2.982);
		Aresta RioBrancoSalvador = new Aresta(RioBranco, Salvador, 3.206);
		Aresta RioBrancoSaoLuis = new Aresta(RioBranco, SaoLuis, 2.726);
		Aresta RioBrancoSaoPaulo = new Aresta(RioBranco, SaoPaulo, 2.704);
		Aresta RioBrancoTeresina = new Aresta(RioBranco, Teresina, 2.806);
		Aresta RioBrancoVitoria = new Aresta(RioBranco, Vitoria, 3.156);

		aresta.add(RioBrancoRioJaneiro);
		aresta.add(RioBrancoSalvador);
		aresta.add(RioBrancoSaoLuis);
		aresta.add(RioBrancoSaoPaulo);
		aresta.add(RioBrancoTeresina);
		aresta.add(RioBrancoVitoria);

		// Rio de Janeiro
		Aresta RioJaneiroSalvador = new Aresta(RioJaneiro, Salvador, 1.209);
		Aresta RioJaneiroSaoLuis = new Aresta(RioJaneiro, SaoLuis, 2.266);
		Aresta RioJaneiroSaoPaulo = new Aresta(RioJaneiro, SaoPaulo, 357d);
		Aresta RioJaneiroTeresina = new Aresta(RioJaneiro, Teresina, 1.979);
		Aresta RioJaneiroVitoria = new Aresta(RioJaneiro, Vitoria, 412d);

		aresta.add(RioJaneiroSalvador);
		aresta.add(RioJaneiroSaoLuis);
		aresta.add(RioJaneiroSaoPaulo);
		aresta.add(RioJaneiroTeresina);
		aresta.add(RioJaneiroVitoria);

		// Salvador
		Aresta SalvadorSaoLuis = new Aresta(Salvador, SaoLuis, 1.323);
		Aresta SalvadorSaoPaulo = new Aresta(Salvador, SaoPaulo, 1.453);
		Aresta SalvadorTeresina = new Aresta(Salvador, Teresina, 994d);
		Aresta SalvadorVitoria = new Aresta(Salvador, Vitoria, 839d);

		aresta.add(SalvadorSaoLuis);
		aresta.add(SalvadorSaoPaulo);
		aresta.add(SalvadorTeresina);
		aresta.add(SalvadorVitoria);

		// Sao Luis
		Aresta SaoLuisSaoPaulo = new Aresta(SaoLuis, SaoPaulo, 2.348);
		Aresta SaoLuisTeresina = new Aresta(SaoLuis, Teresina, 329d);
		Aresta SaoLuisVitoria = new Aresta(SaoLuis, Vitoria, 2.023);

		aresta.add(SaoLuisSaoPaulo);
		aresta.add(SaoLuisTeresina);
		aresta.add(SaoLuisVitoria);

		// Sao Paulo
		Aresta SaoPauloTeresina = new Aresta(SaoPaulo, Teresina, 2.091);
		Aresta SaoPauloVitoria = new Aresta(SaoPaulo, Vitoria, 741d);

		aresta.add(SaoPauloTeresina);
		aresta.add(SaoPauloVitoria);

		// Teresina
		Aresta TeresinaVitoria = new Aresta(Teresina, Vitoria, 1.713);

		aresta.add(TeresinaVitoria);

		this.getGrafo().setArestas(aresta);

	}

	/*
	 * Verifica se uma dada solução é um caminho válido no grafo
	 */
	public boolean verificarSolucaoPossivel(List<No> solucao) {

		byte resultado = 0;
		byte tamanhoSolucao = (byte) solucao.size();
		byte tamanhoGrafo = (byte) this.getGrafo().getArestas().size();
		for (byte i = 1; i < tamanhoSolucao; i++) {
			for (byte j = 0; j < tamanhoGrafo; j++) {
				if (solucao.get(i - 1).getDescricao()
						.equals(this.getGrafo().getArestas().get(j).getPontoEsquerdo().getDescricao())) {
					if (solucao.get(i).getDescricao()
							.equals(this.getGrafo().getArestas().get(j).getPontoDireito().getDescricao())) {
						resultado++;
					}
				}

				if (solucao.get(i - 1).getDescricao()
						.equals(this.getGrafo().getArestas().get(j).getPontoDireito().getDescricao())) {
					if (solucao.get(i).getDescricao()
							.equals(this.getGrafo().getArestas().get(j).getPontoEsquerdo().getDescricao())) {
						resultado++;
					}
				}

			}

		}
		return resultado >= 4;

	}

	/*
	 * Retorna o valor da função objetiva da solução
	 */
	public Double valorFuncaoSolucao(List<No> solucao) {

		List<String> resultadosVisto = new ArrayList<>();
		Double resultado = 0d;
		byte tamanhoSolucao = (byte) solucao.size();
		byte tamanhoGrafo = (byte) this.getGrafo().getArestas().size();
		for (byte i = 1; i < tamanhoSolucao; i++) {
			for (byte j = 0; j < tamanhoGrafo; j++) {

				String primeira = solucao.get(i - 1).getDescricao();
				String segunda = solucao.get(i).getDescricao();

				if (solucao.get(i - 1).getDescricao()
						.equals(this.getGrafo().getArestas().get(j).getPontoEsquerdo().getDescricao())) {
					if (solucao.get(i).getDescricao()
							.equals(this.getGrafo().getArestas().get(j).getPontoDireito().getDescricao())) {
						if (this.alteraValorResultado(solucao.get(i - 1).getDescricao(), solucao.get(i).getDescricao(),
								resultadosVisto)) {
							resultadosVisto.add(primeira + segunda);
							resultadosVisto.add(segunda + primeira);
							resultado += this.getGrafo().getArestas().get(j).getPeso();
						}
					}
				}

				if (solucao.get(i - 1).getDescricao()
						.equals(this.getGrafo().getArestas().get(j).getPontoDireito().getDescricao())) {
					if (solucao.get(i).getDescricao()
							.equals(this.getGrafo().getArestas().get(j).getPontoEsquerdo().getDescricao())) {
						if (this.alteraValorResultado(solucao.get(i - 1).getDescricao(), solucao.get(i).getDescricao(),
								resultadosVisto)) {
							resultadosVisto.add(primeira + segunda);
							resultadosVisto.add(segunda + primeira);
							resultado += this.getGrafo().getArestas().get(j).getPeso();
						}
					}
				}

			}
		}
		return resultado;
	}

	/*
	 * Método auxiliar
	 */
	public boolean alteraValorResultado(String primeira, String segunda, List<String> resultadosVisto) {
		String valorAtual = segunda + primeira;
		Boolean valor = resultadosVisto.contains(valorAtual);
		if (!valor) {
			return true;
		}
		return false;
	}

	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

}
