# Exercícios sobre JSON

1. Quais são os valores (“literais”) admitidos em JSON? Não confunda com aqueles escritos entre aspas (sequências de caracteres).  
<pre>Number, true, false e null.</pre>  
  
2. Qual é o MIME type para arquivo contendo dados no formato JSON?  
<pre>application/json</pre>  
  
3. Você consegue identificar o problema no arquivo JSON abaixo?  
<pre>{
  "a":[1,3], 
	"bool": true,
	"null": nil,
	"n":123,
	"o":{"a":"b","c":"d" },
	"str":"a"
}

Apesar de não ser um valor literal o nil não está entre aspas.
</pre>    
  
4. Qual seria um possível arquivo JSON contendo dados correspondentes a uma instância de um objeto da classe Bicycle (disponível aqui)?  
<pre>{
  "cadence": 80,
  "gear": 12,
  "speed": 45
}</pre>  
  
5. Qual seria a representação em JSON de um objeto contendo as seguintes propriedades (e valores correspondentes)? Propriedades seguem em negrito.  
  
* lista de cidades: Goiânia e Trindade;
* salada: alface;
* altura: 2,3;
* sabor preferido: (nenhum valor fornecido para esta propriedade);  
   
<pre>{ "cidades": ["Goiânia", "Trindade"] }

{ "salada": "alface" }

{ "altura": [2,3] }

{ "sabor-preferido": null }</pre>  
  
6. Por meio do portal de serviços http://www.jsontest.com/ várias requisições podem ser realizadas e cujas respostas seguem no formato JSON. Por exemplo, o comando curl http://headers.jsontest.com produz como resultado, em formato JSON, todos os headers enviados na requisição. Usando o curl com a opção -v é possível verificar que, de fato, todos os headers enviados são retornados no formato JSON. Outra requisição é curl http://ip.jsontest.com que retorna o endereço IP da origem da requisição. Exercite os serviços oferecidos por esse portal.  
<pre></pre>  
  
  
7. O GitHub oferece uma API cujas informações enviadas e recebidas seguem o formato JSON. Por exemplo, curl https://api.github.com/users/kyriosdata fornece detalhes desse usuário, por meio de dados no formato JSON, sem necessidade de autenticação. De fato, muitas informações podem ser obtidas conforme a API. A documentação da API está disponível em https://developer.github.com/v3/.  
Faça um programa que recupera a imagem associada ao usuário (avatar) e a persiste localmente em um arquivo. Sugestão: (a) usar HttpUrlConnection para recuperar tanto o JSON do Github quanto a imagem. Observe que a informação desejada será obtida pelo InputStream obtido pelo método getInputStream; (b) recuperar o valor da chave “avatar_url” pode ser feito usando Jackson ou Gson.  
<pre></pre>  
