package br.ufg.inf.es.integracao;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aluno on 04/06/18.
 */
public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = null;

        MongoClientURI uri = new MongoClientURI("mongodb://beatriz:123qwe@ds247690.mlab.com:47690/cadastro");
        MongoClient cli = new MongoClient(uri);
        MongoDatabase db = cli.getDatabase(uri.getDatabase());

        MongoCollection<Document> user =  db.getCollection("user");
        MongoCursor<Document> cursor = user.find().iterator();

        Document novoUser = new Document("name","iiiii");
        user.insertOne(novoUser);



        try {
            while (cursor.hasNext()){
                Document doc = cursor.next();
                System.out.println(doc.get("name"));
            }
        } catch (Exception e){
            System.out.println(e);
        }


    }
}
