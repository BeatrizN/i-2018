/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static br.ufg.inf.es.integracao.InteracaoUser.solicitarInformacaoUser;

/**
 * Created by aluno on 04/06/18.
 *
 * Casos de Uso:
 * Criar identificação. Uma nova identificação é produzida para um indivíduo a
 * ser assistido pela instituição. Observe que é possível que o indivíduo já
 * esteja devidamente identificado pela instituição em questão e, neste caso,
 * trata-se do acréscimo de uma identificação para tal indivíduo.
 *
 * Atualizar identificação. Elementos de uma identificação existente são
 * alterados para refletir, por exemplo, o novo endereço de um paciente ou
 * o acréscimo de um contato.
 *
 * Localizar identificação. A busca por uma identificação ocorre, por exemplo,
 * quando um paciente procura por assistência. Em geral, nome, nome da mãe,
 * data de nascimento e sexo são alguns dos elementos empregados para a busca
 * e suficientes para localizar um único indivíduo. A busca, portanto, deve
 * contemplar vários outros campos.
 *
 * Consultar identificação. Dado um indivíduo, o usuário deve consultar as
 * informações correspondentes.
 */

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        banco(); //chama o metodo banco

        int opcao = 1;

        while (opcao != 0) {

            System.out.println("Selecione 1 para consultar os dados de um usuário.\n" +
                    "Selecione 2 para registrar um novo usuário.\n" +
                    "Selecione 3 para atualizar os dados de um usuário.\n" +
                    "Selecione 0 para sair.\n");
            opcao = ler.nextInt();


            switch (opcao) {
                case 1:
                    consultarCadastro();
                    break;

                case 2:
                    criarCadastro();
                    break;

                case 3:
                    atualizarCadastro();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Valor inválido");
            }

        }

    }

    public static void consultarCadastro() {



    }

    public static void criarCadastro() {

        Individuo individuoii = new Individuo();
        individuoii = solicitarInformacaoUser();


        MongoClient mongoClient = null;

        MongoClientURI uri = new MongoClientURI("mongodb://beatriz:123qwe@ds247690.mlab.com:47690/cadastro");
        MongoClient cli = new MongoClient(uri);
        MongoDatabase db = cli.getDatabase(uri.getDatabase());

        MongoCollection<Document> user =  db.getCollection("user");
        MongoCursor<Document> cursor = user.find().iterator();

        Document novoUser = new Document("Individuo",individuoii);
        user.insertOne(novoUser);
    }

    public static void atualizarCadastro() {

    }

    public static void banco() {

        /********************************************************/
        MongoClient mongoClient = null;

        MongoClientURI uri = new MongoClientURI("mongodb://beatriz:123qwe@ds247690.mlab.com:47690/cadastro");
        MongoClient cli = new MongoClient(uri);
        MongoDatabase db = cli.getDatabase(uri.getDatabase());

        MongoCollection<Document> user =  db.getCollection("user");
        MongoCursor<Document> cursor = user.find().iterator();

//        Document novoUser = new Document("individuo","individuo");
//        user.insertOne(novoUser);

//        Document updDocument = new Document("name", "Alii");
//        individuos.updateOne(updDocument, new Document("$set", new Document("idade", 2)));

        try {
            while (cursor.hasNext()){
                Document doc = cursor.next();
                System.out.println(doc.get("name"));
                //System.out.println(doc.get("nacionalidade"));
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
