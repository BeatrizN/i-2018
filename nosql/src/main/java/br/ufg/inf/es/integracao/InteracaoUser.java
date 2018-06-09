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
        int folha = null;
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
        //    Data data_obito = ""; //////////////////////////
        //    Data data_nascimento = "";////////////////////
        //    Nacionalidade nacionalidade = "";///////////////
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
        Data data = "";
        String acuracia = "";

        //Endereço
        String key_endereco = "";
        //    Data data_inicio_endereco = ""; /////
        //    Data data_fim_endereco = "";//////
        //    String linha_endereco = "";///////
        String bairro = "";
        String distrito = "";
        int codigo_municipio = "";
        String estado_endereco = "";
        String CEP = "";
        String caixa_postal = "";
        String pais_endereco = "";
        String tipo_endereco = "";

        //Identificador
        String key_identificador = "";
        //    Ctps CTPS = ""; /////
        //    Certidao certidao = "";/////
        //    TituloEleitoral titulo_eleitoral = "";//////
        //    Vinculo vinculo_identificador = "";/////
        //    Utilizacao utilizacaoId = "";/////
        String designacao = "";
        String area = "";
        String emissor = "";
        Calendar data_identificador = "";
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
        int ordem = "";
        int linha = "";

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

/**********************************************************************************************************/

        Scanner informacao = new Scanner(System.in);
        
        //Certidão
        System.out.println("Digite o tipo da certidão. \n");
        tipo_certidao = informacao.nextLine();
        System.out.println("Digite o nome do cartório. \n");
        cartorio = informacao.nextLine();
        System.out.println("Digite o nome (ou identificador) do livro. \n");
        livro = informacao.nextLine();
        System.out.println("Digite o número da folha do livro. \n");
        folha = informacao.nextLine();
        System.out.println("Digite o termo. \n");
        termo = informacao.nextLine();
        
        //Comunicação
        System.out.println("Digite o meio de comunicação. \n");
        meio = informacao.nextLine();
        System.out.println("Digite a preferencia de meio de comunicação. \n");
        preferencia = informacao.nextLine();
        System.out.println("Digite detalhes do meio de comunicação. \n");
        detalhe = informacao.nextLine();
        System.out.println("Digite quando fazer uso do meio de comunicação. \n");
        uso_comunicacao = informacao.nextLine();
        
        //CTPS
        System.out.println("Digite a série do CTPS. \n");
        serie = informacao.nextLine();
        System.out.println("Digite o estado do CTPS. \n");
        estado_ctps = informacao.nextLine();
        
        //Dado Demográfico
        //    String data_obito = ""; //////////////////////////
        //    String data_nascimento = "";////////////////////
        //    String nacionalidade = "";///////////////
        System.out.println("Digite o sexo/gênero. \n");
        sexo = informacao.nextLine();
        System.out.println("Digite o nome da mãe. \n");
        nome_da_mae = informacao.nextLine();
        System.out.println("Digite o nome do pai. \n");
        nome_do_pai = informacao.nextLine();
        System.out.println("Digite a situação familiar. \n");
        situacao_familiar = informacao.nextLine();
        System.out.println("Digite raça/cor. \n");
        raca_cor = informacao.nextLine();
        System.out.println("Digite algum comentário. \n");
        comentario = informacao.nextLine();
        System.out.println("Digite a fonte de notificação de óbito. \n");
        fonte_notificacao_obito = informacao.nextLine();
        System.out.println("Digite o nascimento (pluraridade). \n");
        nascimento_pluralidade = informacao.nextLine();
        System.out.println("Digite o nascimento (ordem). \n");
        nascimento_ordem = informacao.nextLine();
        System.out.println("Digite o nascimento (seguimento). \n");
        nascimento_seguimento = informacao.nextLine();
        
        //Data
        System.out.println("Digite a data. \n");
        data = informacao.nextLine();
        System.out.println("Digite a acurácia da data. \n");
        acuracia = informacao.nextLine();
        
        //Endereço
        System.out.println("Digite a chave de identificação do endereço. \n");
        key_endereco = informacao.nextLine();
        //    String data_inicio_endereco = ""; /////
        //    String data_fim_endereco = "";//////
        //    String linha_endereco = "";///////
        System.out.println("Digite o nome do bairro. \n");
        bairro = informacao.nextLine();
        System.out.println("Digite o distrito. \n");
        distrito = informacao.nextLine();
        System.out.println("Digite o código do municipio. \n");
        codigo_municipio = informacao.nextLine();
        System.out.println("Digite o estado. \n");
        estado_endereco = informacao.nextLine();
        System.out.println("Digite o CEP. \n");
        CEP = informacao.nextLine();
        System.out.println("Digite o código da caixa postal. \n");
        caixa_postal = informacao.nextLine();
        System.out.println("Digite o pais. \n");
        pais_endereco = informacao.nextLine();
        System.out.println("Digite o tipo de endereço. \n");
        tipo_endereco = informacao.nextLine();
        
        //Identificador
        System.out.println("Digite a chave de identificação do identificador. \n");
        key_identificador = informacao.nextLine();
        //    String CTPS = ""; /////
        //    String certidao = "";/////
        //    String titulo_eleitoral = "";//////
        //    String vinculo_identificador = "";/////
        System.out.println("Digite a designação do identificador. \n");
        designacao = informacao.nextLine();
        System.out.println("Digite a área do identificador. \n");
        area = informacao.nextLine();
        System.out.println("Digite o emissor do identificador. \n");
        emissor = informacao.nextLine();
        System.out.println("Digite a data do identificador. \n");
        data_identificador = informacao.nextLine();
        System.out.println("Digite o tipo do identificador. \n");
        tipo_identificador = informacao.nextLine();
        
        //Indivíduo
        System.out.println("Digite a chave de identificação do individuo. \n");
        key_individuo = informacao.nextLine();
        //    String[] endereco;//////////
        //    String dado_demografico = "";//////////
        //    String[] comunicacao;///////////
        //    String[] nome;////////////////
        //    String[] identificador;////////////
        //    String[] vinculo;///////////////////
        
        //Linha de Endereço
        System.out.println("Digite a ordem do endereço. \n");
        ordem = informacao.nextLine();
        System.out.println("Digite a linha do endereço. \n");
        linha = informacao.nextLine();
        
        //Nacionalidade
        System.out.println("Digite o municipio de nacionalidade. \n");
        municipio = informacao.nextLine();
        System.out.println("Digite o o estado de nacionalidade. \n");
        estado = informacao.nextLine();
        System.out.println("Digite o pais de nacionalidade. \n");
        pais = informacao.nextLine();
        System.out.println("Digite o digite a data de estrada no país (Brasil), caso não seja brasileiro. \n");
        data_entrada_pais = informacao.nextLine();
        
        //Nome
        System.out.println("Digite a chave de identificação do nome. \n");
        key_nome = informacao.nextLine();
        //    String utilizacao_nome = "";/////////////
        //    String representacao = "";/////////////////
        System.out.println("Digite o título do nome. \n");
        titulos = informacao.nextLine();
        System.out.println("Digite o nome. \n");
        nomes = informacao.nextLine();
        System.out.println("Digite o sobrenome. \n");
        sobrenomes = informacao.nextLine();
        System.out.println("Digite o sufixo. \n");
        sufixos = informacao.nextLine();
        System.out.println("Digite o nome de preferencia da vona pessoa cadastrada. \n");
        preferido = informacao.nextLine();
        System.out.println("Digite em qual condição deve ser feito o uso desse nome. \n");
        uso_condicional = informacao.nextLine();
        
        //Representação
        System.out.println("Digite a utilização da representação. \n");
        utilizacao = informacao.nextLine();
        System.out.println("Digite a alternativa da representação.. \n");
        alternativa = informacao.nextLine();
        
        //Titulo de Eleitor
        System.out.println("Digite a Seção do título de eleitor. \n");
        secao = informacao.nextLine();
        System.out.println("Digite a zona do título de eleitor. \n");
        zona = informacao.nextLine();
        
        //Utilização
        System.out.println("Digite o uso da utilização. \n");
        uso = informacao.nextLine();
        System.out.println("Digite a data de inicio da utilização. \n");
        data_icial_utilizacao = informacao.nextLine();
        System.out.println("Digite a data de finalização da utilização. \n");
        data_final_utilizacao = informacao.nextLine();
        
        //Vinculo
        System.out.println("Digite o relacionamento de vinculo. \n");
        relacionamento = informacao.nextLine();
        System.out.println("Digite a data de inicio do vinculo. \n");
        data_inicio_vinculo = informacao.nextLine();
        System.out.println("Digite a data de finalização do vinculo. \n");
        data_fim_vinculo = informacao.nextLine();

        
 /*********************************************************************************************************/
        Certidao i_certidao = new Certidao();
        i_certidao.setTipo(tipo_certidao);
        i_certidao.setCartorio(cartorio);
        i_certidao.setLivro(livro);
        i_certidao.setFolha(folha);
        i_certidao.setTermo(termo);
        
        Comunicacao i_comunicacao = new Comunicacao();
        i_comunicacao.setDetalhes(detalhe);
        i_comunicacao.setMeio(meio);
        i_comunicacao.setPreferencia(preferencia);
        i_comunicacao.setUso(uso_comunicacao);

        Ctps i_ctps = new Ctps();
        i_ctps.setSerie(serie);
        i_ctps.setEstado(estado_ctps);
        
        DadoDemografico i_dadoDemografico = new DadoDemografico();
        //i_dadoDemografico.setNascimento(data_nascimento);
        //i_dadoDemografico.setObito(data_obito);
        //i_dadoDemografico.setNacionalidade(nacionalidade);
        i_dadoDemografico.setSexo(sexo);
        i_dadoDemografico.setNomeMae(nome_da_mae);
        i_dadoDemografico.setNomePai(nome_do_pai);
        i_dadoDemografico.setSituacaoFamiliar(situacao_familiar);
        i_dadoDemografico.setRaca(raca_cor);
        i_dadoDemografico.setComentario(comentario);
        i_dadoDemografico.setFonteNotificacaoObito(fonte_notificacao_obito);
        i_dadoDemografico.setNascimentoPluralidade(nascimento_pluralidade);
        i_dadoDemografico.setNascimentoOrdem(nascimento_ordem);
        i_dadoDemografico.setNascimentoseguinte(nascimento_seguimento);

        Data i_data = new Data();
        i_data.setData(data);
        i_data.setAcuracia(acuracia);
        
        Endereco i_endereco = new Endereco();
        //i_endereco.set linhaEndereco(linha_endereco);
        //i_endereco.setDataInicio(data_inicio_endereco);
        //i_endereco.setDataFim(data_fim_endereco);
        i_endereco.setBairro(bairro);
        i_endereco.setDistrito(distrito);
        i_endereco.setCodigoMunicipio(codigo_municipio);
        i_endereco.setEstado(estado_endereco);
        i_endereco.setCep(CEP);
        i_endereco.setCaixaPostal(caixa_postal);
        i_endereco.setPais(pais_endereco);
        i_endereco.setTipo(tipo_endereco);

        Identificador i_identificador = new Identificador();
        i_identificador.setDesignacao(designacao);
        i_identificador.setArea(area);
        i_identificador.setEmissor(emissor);
        i_identificador.setData(data_identificador);
        i_identificador.setTipo(tipo_identificador);
        //i_identificador.setUtilizacao(utilizacaoId);
        //i_identificador.setVinculo(vinculo_identificador);
        //i_identificador.setCtps(CTPS);
        //i_identificador.setCertidao(certidao);
        //i_identificador.setTituloEleitoral(titulo_eleitoral);
        
        LinhaEndereco i_linhaEndereco = new LinhaEndereço();
        i_linhaEndereco.setOrdem(ordem);
        i_linhaEndereco.setLinha(linha);
        
        /*
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

 /*********************************************************************************************************/

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
}
