package br.ufg.inf.es.integracao;

import java.util.List;
import java.util.Scanner;

/**
 * Created by aluno on 08/06/18.
 */
public class InteracaoUser {

    public static Individuo solicitarInformacaoUser() {
        Individuo individuo = new Individuo();
        //Certidão
        String tipo_certidao = "";
        String cartorio = "";
        String livro = "";
        String folha = "";
        String termo = "";

        //Comunicação
        String meio = "";
        String preferencia = "";
        String detalhe = "";
        String uso_comunicacao = "";

        //CTPS
        String serie = "";
        String estado_ctps = "";

        //Dado Demográfico
        //    String data_obito = ""; //////////////////////////
        //    String data_nascimento = "";////////////////////
        //    String nacionalidade = "";///////////////
        String sexo = "";
        String nome_da_mae = "";
        String nome_do_pai = "";
        String situacao_familiar = "";
        String raca_cor = "";
        String comentario = "";
        String fonte_notificacao_obito = "";
        String nascimento_pluralidade = "";
        String nascimento_ordem = "";
        String nascimento_seguimento = "";

        //Data
        String data = "";
        String acuracia = "";

        //Endereço
        String key_endereco = "";
        //    String data_inicio_endereco = ""; /////
        //    String data_fim_endereco = "";//////
        //    String linha_endereco = "";///////
        String bairro = "";
        String distrito = "";
        String codigo_municipio = "";
        String estado_endereco = "";
        String CEP = "";
        String caixa_postal = "";
        String pais_endereco = "";
        String tipo_endereco = "";

        //Identificador
        String key_identificador = "";
        //    String CTPS = ""; /////
        //    String certidao = "";/////
        //    String titulo_eleitoral = "";//////
        //    String vinculo_identificador = "";/////
        String designacao = "";
        String area = "";
        String emissor = "";
        String data_identificador = "";
        String tipo_identificador = "";

        //Indivíduo
        String key_individuo = "";
        //    String[] endereco;//////////
        //    String dado_demografico = "";//////////
        //    String[] comunicacao;///////////
        //    String[] nome;////////////////
        //    String[] identificador;////////////
        //    String[] vinculo;///////////////////

        //Linha de Endereço
        String ordem = "";
        String linha = "";

        //Nacionalidade
        String municipio = "";
        String estado = "";
        String pais = "";
        String data_entrada_pais = "";

        //Nome
        String key_nome = "";
        //    String utilizacao_nome = "";/////////////
        //    String representacao = "";/////////////////
        String titulos = "";
        String nomes = "";
        String sobrenomes = "";
        String sufixos = "";
        String preferido = "";
        String uso_condicional = "";

        //Representação
        String utilizacao = "";
        String alternativa = "";

        //Titulo de Eleitor
        String secao = "";
        String zona = "";

        //Utilização
        String uso = "";
        String data_icial_utilizacao = "";
        String data_final_utilizacao = "";

        //Vinculo
        String relacionamento = "";
        String data_inicio_vinculo = "";
        String data_fim_vinculo = "";

/**
 Scanner informacao = new Scanner(System.in);

 //Certidão
 System.out.println("Digite o ... \n");
 tipo_certidao = informacao.nextLine();
 System.out.println("Digite o ... \n");
 cartorio = informacao.nextLine();
 System.out.println("Digite o ... \n");
 livro = informacao.nextLine();
 System.out.println("Digite o ... \n");
 folha = informacao.nextLine();
 System.out.println("Digite o ... \n");
 termo = informacao.nextLine();


 //Comunicação
 System.out.println("Digite o ... \n");
 meio = informacao.nextLine();
 System.out.println("Digite o ... \n");
 preferencia = informacao.nextLine();
 System.out.println("Digite o ... \n");
 detalhe = informacao.nextLine();
 System.out.println("Digite o ... \n");
 uso_comunicacao = informacao.nextLine();


 //CTPS
 System.out.println("Digite o ... \n");
 serie = informacao.nextLine();
 System.out.println("Digite o ... \n");
 estado_ctps = informacao.nextLine();


 //Dado Demográfico
 //    String data_obito = ""; //////////////////////////
 //    String data_nascimento = "";////////////////////
 //    String nacionalidade = "";///////////////
 System.out.println("Digite o ... \n");
 sexo = informacao.nextLine();
 System.out.println("Digite o ... \n");
 nome_da_mae = informacao.nextLine();
 System.out.println("Digite o ... \n");
 nome_do_pai = informacao.nextLine();
 System.out.println("Digite o ... \n");
 situacao_familiar = informacao.nextLine();
 System.out.println("Digite o ... \n");
 raca_cor = informacao.nextLine();
 System.out.println("Digite o ... \n");
 comentario = informacao.nextLine();
 System.out.println("Digite o ... \n");
 fonte_notificacao_obito = informacao.nextLine();
 System.out.println("Digite o ... \n");
 nascimento_pluralidade = informacao.nextLine();
 System.out.println("Digite o ... \n");
 nascimento_ordem = informacao.nextLine();
 System.out.println("Digite o ... \n");
 nascimento_seguimento = informacao.nextLine();


 //Data
 System.out.println("Digite o ... \n");
 data = informacao.nextLine();
 System.out.println("Digite o ... \n");
 acuracia = informacao.nextLine();


 //Endereço
 System.out.println("Digite o ... \n");
 key_endereco = informacao.nextLine();

 //    String data_inicio_endereco = ""; /////
 //    String data_fim_endereco = "";//////
 //    String linha_endereco = "";///////
 System.out.println("Digite o ... \n");
 bairro = informacao.nextLine();
 System.out.println("Digite o ... \n");
 distrito = informacao.nextLine();
 System.out.println("Digite o ... \n");
 codigo_municipio = informacao.nextLine();
 System.out.println("Digite o ... \n");
 estado_endereco = informacao.nextLine();
 System.out.println("Digite o ... \n");
 CEP = informacao.nextLine();
 System.out.println("Digite o ... \n");
 caixa_postal = informacao.nextLine();
 System.out.println("Digite o ... \n");
 pais_endereco = informacao.nextLine();
 System.out.println("Digite o ... \n");
 tipo_endereco = informacao.nextLine();


 //Identificador
 System.out.println("Digite o ... \n");
 key_identificador = informacao.nextLine();

 //    String CTPS = ""; /////
 //    String certidao = "";/////
 //    String titulo_eleitoral = "";//////
 //    String vinculo_identificador = "";/////
 System.out.println("Digite o ... \n");
 designacao = informacao.nextLine();
 System.out.println("Digite o ... \n");
 area = informacao.nextLine();
 System.out.println("Digite o ... \n");
 emissor = informacao.nextLine();
 System.out.println("Digite o ... \n");
 data_identificador = informacao.nextLine();
 System.out.println("Digite o ... \n");
 tipo_identificador = informacao.nextLine();


 //Indivíduo
 System.out.println("Digite o ... \n");
 key_individuo = informacao.nextLine();

 //    String[] endereco;//////////
 //    String dado_demografico = "";//////////
 //    String[] comunicacao;///////////
 //    String[] nome;////////////////
 //    String[] identificador;////////////
 //    String[] vinculo;///////////////////

 //Linha de Endereço
 System.out.println("Digite o ... \n");
 ordem = informacao.nextLine();
 System.out.println("Digite o ... \n");
 linha = informacao.nextLine();


 //Nacionalidade
 System.out.println("Digite o ... \n");
 municipio = informacao.nextLine();
 System.out.println("Digite o ... \n");
 estado = informacao.nextLine();
 System.out.println("Digite o ... \n");
 pais = informacao.nextLine();
 System.out.println("Digite o ... \n");
 data_entrada_pais = informacao.nextLine();


 //Nome
 System.out.println("Digite o ... \n");
 key_nome = informacao.nextLine();

 //    String utilizacao_nome = "";/////////////
 //    String representacao = "";/////////////////
 System.out.println("Digite o ... \n");
 titulos = informacao.nextLine();
 System.out.println("Digite o ... \n");
 nomes = informacao.nextLine();
 System.out.println("Digite o ... \n");
 sobrenomes = informacao.nextLine();
 System.out.println("Digite o ... \n");
 sufixos = informacao.nextLine();
 System.out.println("Digite o ... \n");
 preferido = informacao.nextLine();
 System.out.println("Digite o ... \n");
 uso_condicional = informacao.nextLine();


 //Representação
 System.out.println("Digite o ... \n");
 utilizacao = informacao.nextLine();
 System.out.println("Digite o ... \n");
 alternativa = informacao.nextLine();


 //Titulo de Eleitor
 System.out.println("Digite o ... \n");
 secao = informacao.nextLine();
 System.out.println("Digite o ... \n");
 zona = informacao.nextLine();


 //Utilização
 System.out.println("Digite o ... \n");
 uso = informacao.nextLine();
 System.out.println("Digite o ... \n");
 data_icial_utilizacao = informacao.nextLine();
 System.out.println("Digite o ... \n");
 data_final_utilizacao = informacao.nextLine();


 //Vinculo
 System.out.println("Digite o ... \n");
 relacionamento = informacao.nextLine();
 System.out.println("Digite o ... \n");
 data_inicio_vinculo = informacao.nextLine();
 System.out.println("Digite o ... \n");
 data_fim_vinculo = informacao.nextLine();
 */

        /*
    Comunicacao
    private String meio;
    private String preferencia;
    private String detalhes;
    private String uso;

    DadoDemografico
    private Data nascimento;
    private Data obito;
    private Nacionalidade nacionalidade;
    private String sexo;
    private String nomeMae;
    private String nomePai;
    private String situacaoFamiliar;
    private String raca;
    private String comentario;
    private String fonteNotificacaoObito;
    private String nascimentoPluralidade;
    private String nascimentoOrdem;
    private String nascimentoseguinte;

    Endereco
    private List<LinhaEndereco> linhaEndereco;
    private Data dataInicio;
    private Data dataFim;
    private String bairro;
    private String distrito;
    private int codigoMunicipio;
    private String estado;
    private String cep;
    private String caixaPostal;
    private String pais;
    private String tipo;

    Identificador
    private String designacao;
    private String area;
    private String emissor;
    private Calendar data;
    private String tipo;
    private Utilizacao utilizacao;
    private Vinculo vinculo;
    private Ctps ctps;
    private Certidao certidao;
    private TituloEleitoral tituloEleitoral;

    Nome

    private List<Representacao> representacao;
    private List<Utilizacao> utilizacoe;
    private String titulos;
    private String nomes;
    private String sobrenomes;
    private String sufixos;
    private String prefereido;
    private String usoCondicional;


    Vinculo
    private String relacionamento;
    private Calendar dataInicio;
    private Calendar dataFim;

         */


        Comunicacao cmnik = new Comunicacao();
//        cmnik.setDetalhes(detalhe);
//        cmnik.setMeio(meio);
//        cmnik.setPreferencia(preferencia);
//        cmnik.setUso(uso_comunicacao);

        List<Comunicacao> novaComunicacao = null;
//        novaComunicacao.add(cmnik);

        DadoDemografico novoDadoDemografico = new DadoDemografico();

        Endereco novoEdc = new Endereco();
        List<Endereco> novoEndereco = null;
//        novoEndereco.add(novoEdc);

        Identificador novoId = new Identificador();
        List<Identificador> novoIdentificador = null;
//        novoIdentificador.add(novoId);

        Nome novoN = new Nome();
        List<Nome> novoNome = null;
//        novoNome.add(novoN);

        Vinculo novoV = new Vinculo();
        List<Vinculo> novoVinculo = null;
//        novoVinculo.add(novoV);



        individuo.setComunicacoes(novaComunicacao);
        individuo.setDadoDemografico(novoDadoDemografico);
        individuo.setEnderecos(novoEndereco);
        individuo.setIdentificadores(novoIdentificador);
        individuo.setNomes(novoNome);
        individuo.setVinculos(novoVinculo);

        return individuo;
    }

    public static void cadastrar() {
        //Certidão
        String tipo_certidao = "";
        String cartorio = "";
        String livro = "";
        String folha = "";
        String termo = "";

        //Comunicação
        String meio = "";
        String preferencia = "";
        String detalhe = "";
        String uso_comunicacao = "";

        //CTPS
        String serie = "";
        String estado_ctps = "";

        //Dado Demográfico
        //    String data_obito = ""; //////////////////////////
        //    String data_nascimento = "";////////////////////
        //    String nacionalidade = "";///////////////
        String sexo = "";
        String nome_da_mae = "";
        String nome_do_pai = "";
        String situacao_familiar = "";
        String raca_cor = "";
        String comentario = "";
        String fonte_notificacao_obito = "";
        String nascimento_pluralidade = "";
        String nascimento_ordem = "";
        String nascimento_seguimento = "";

        //Data
        String data = "";
        String acuracia = "";

        //Endereço
        String key_endereco = "";
        //    String data_inicio_endereco = ""; /////
        //    String data_fim_endereco = "";//////
        //    String linha_endereco = "";///////
        String bairro = "";
        String distrito = "";
        String codigo_municipio = "";
        String estado_endereco = "";
        String CEP = "";
        String caixa_postal = "";
        String pais_endereco = "";
        String tipo_endereco = "";

        //Identificador
        String key_identificador = "";
        //    String CTPS = ""; /////
        //    String certidao = "";/////
        //    String titulo_eleitoral = "";//////
        //    String vinculo_identificador = "";/////
        String designacao = "";
        String area = "";
        String emissor = "";
        String data_identificador = "";
        String tipo_identificador = "";

        //Indivíduo
        String key_individuo = "";
        //    String[] endereco;//////////
        //    String dado_demografico = "";//////////
        //    String[] comunicacao;///////////
        //    String[] nome;////////////////
        //    String[] identificador;////////////
        //    String[] vinculo;///////////////////

        //Linha de Endereço
        String ordem = "";
        String linha = "";

        //Nacionalidade
        String municipio = "";
        String estado = "";
        String pais = "";
        String data_entrada_pais = "";

        //Nome
        String key_nome = "";
        //    String utilizacao_nome = "";/////////////
        //    String representacao = "";/////////////////
        String titulos = "";
        String nomes = "";
        String sobrenomes = "";
        String sufixos = "";
        String preferido = "";
        String uso_condicional = "";

        //Representação
        String utilizacao = "";
        String alternativa = "";

        //Titulo de Eleitor
        String secao = "";
        String zona = "";

        //Utilização
        String uso = "";
        String data_icial_utilizacao = "";
        String data_final_utilizacao = "";

        //Vinculo
        String relacionamento = "";
        String data_inicio_vinculo = "";
        String data_fim_vinculo = "";

    }
}
