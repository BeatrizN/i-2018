/*
 * Copyright (c) 2018.
 * Beatriz Nogueira Carvalho da Silveira
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.questao2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Classe que recebe um arquivo XML e disponibiliza
 * uma lista de calçados, conforme o conteúdo do 
 * documento carregado.
 */
public class Questao2 {

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException, XMLStreamException, IOException{
        Sapataria sapataria = new Sapataria();
        XMLStreamReader arquivo = null;
        XmlMapper mapper = new XmlMapper();
        arquivo = recuperarDados(args[0]);
        sapataria = carregarObjetos(arquivo, mapper);
       
    }

    /**
     * Método que carregar os objetos para disponibiliza-los.
     */
    public static Sapataria carregarObjetos(XMLStreamReader arquivo, XmlMapper mapper) throws
            XMLStreamException, IOException {
        Sapataria sapataria = new Sapataria();
        int linha = arquivo.next();
        ArrayList<Sapatos> listaSapatos = new ArrayList<Sapatos>();
        ArrayList<Tenis> listaTenis = new ArrayList<Tenis>();
        int iTenis = 0;
        int iSapatos = 0;
        while (linha != XMLStreamConstants.END_DOCUMENT) {
            if (linha == XMLStreamConstants.START_ELEMENT) {
                String calcados = arquivo.getLocalName();
                if (calcados.equals("sapatos")) {
                    Sapatos sapatos = mapper.readValue(arquivo, Sapatos.class);
                    listaSapatos.add(iSapatos, sapatos);
                    iSapatos++;
                } else {
                    Tenis tenis = mapper.readValue(arquivo, Tenis.class);
                    listaTenis.add(iTenis, tenis);
                    iTenis++;
                }
            }
            linha = arquivo.next();
        }
        sapataria.setSapatos( listaSapatos);
        sapataria.setTenis(listaTenis);

        return sapataria;
    }

    /**
     * Método que recebe e retorna dados do arquivo passado como parametro.
     */
    public static XMLStreamReader recuperarDados(String arquivo) throws FileNotFoundException, XMLStreamException {
        if (arquivo.equals(null) || arquivo.trim().isEmpty()){
            throw new IllegalArgumentException("Arquivo invalido!");
        }
        FileInputStream file = new FileInputStream(arquivo);
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader arqv = factory.createXMLStreamReader(file);
        return arqv;
    }
}
