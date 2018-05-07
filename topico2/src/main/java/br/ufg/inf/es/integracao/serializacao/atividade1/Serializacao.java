package main.java.br.ufg.inf.es.integracao.serializacao.atividade1;

/**
 *
 * @author Beatriz    
}*/

import main.java.br.ufg.inf.es.integracao.serializacao.atividade1.Produto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializacao {
    public static void main(String[] args) {
        Produto prodt = new Produto(args[0], args[1]);
        Produto[] produtos = { prodt };
        Compra person = new Compra(args[2], produtos);

        try {
            int tamanho = TamanhoEmBytes(person);
            System.out.println(tamanho);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static int TamanhoEmBytes(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();
        return baos.toByteArray().length;
    }
    
}
