/**
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */

package main.java.br.ufg.inf.es.integracao.serializacao.atividade2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Beatriz
 */
public class SerializacaoDeserializacao {
    
    public static void main(String[] args) {
        Produto produto = new Produto(args[0], args[1]);
        byte[] bytes;

        try {
            bytes = serializacao(produto);
            Produto deserializado = deserializacao(bytes);
            System.out.println(deserializado.getNome());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
        public static byte[] serializacao(Produto p) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(p);
        oos.close();
        byte[] bytes = baos.toByteArray();
        return bytes;
    }
        
    public static Produto deserializacao(byte[] bytes) throws IOException, ClassNotFoundException {
       
        ByteArrayInputStream arquivo = new ByteArrayInputStream(bytes);
        ObjectInputStream b = new ObjectInputStream(arquivo);

        Produto p = null;
        p = (Produto) b.readObject();
        b.close();
        return p;
    }

}
