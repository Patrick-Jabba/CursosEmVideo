POO - 
Exemplo Caneta

Classe Caneta
coisas que eu tenho ATRIBUTOS - CARACTERISTICAS
modelo: Caractere => BIC CRISTAL
cor: Caractere => Azul
ponta: Real => 0.5
carga: Inteiro => 90%
tampada: Logico => falso

coisas que eu faço METODOS - COMPORTAMENTOS
System.out.print
rabiscar Metodo rabiscar()
	if (tampada) entao
		escreva(ERRO)
	else
		escreva(RABISCO)
	
pintar
FIM METODO
tampar Metodo tampar()
destampar

como eu estou agora? ESTADO ou Status
Destampada
Azul
90% de carga

INSTANCIAR 
Quando tenho uma classe e quero transformar ela num objeto
Eu gero um objeto a partir de uma classe.

Ex: c1 = new Caneta
	c1.cor = "Azul"
	c1.ponta = 0.5;
	c1.tampada = false;
	c1.rabiscar(); //o parenteses indica um metodo, sem ele é atributo
	
	c2 = new Caneta;
	c2.cor = "Vermelha";
	c2.ponta = 1.0;
	c2.tampada = false;
	c2.tampar();
	
CLASSE
Define os atributos e métodos comuns que serão compartilhados por
um objeto.

OBJETO
É a instância de uma classe.

Modificadores de Visibilidade:
Indicam o nivel de acesso aos componentes internos de uma classe
+ public
A classe atual e todas as classes podem ter acesso a ela.

- private
Somente a classe atual pode acessar.

# protected (minha mae e todos os filhos dela)
Acesso a classe atual e a todas as subclasses dela

default 


Métodos Especiais:

Métodos ACESSORES, isto é, dão acesso GETTER
Getters = pega alguma informação, acessa determinado atributo mantendo
a segurança dele sem poder mexer, alterar, etc.

e = new Estante
total = e.get.totDoc();

Métodos MODIFICADORES ou MUTANTES SETTER
Setters = modificam coisas que estão dentro do objeto mantendo da mesma
forma a segurança do atributo.
metodo inseguro => e.totDoc = e.totDoc + 1
metodo seguro => e.setTotDoc(doc); <= um parametro pra modificar

Metodo CONSTRUTOR CONSTRUCT
Toda vez que eu crio uma caneta eu quero que ela venha tampada
Sempre que eu instanciar um objeto ele vai 

Classe Caneta 
atributos etc.

Metodo construtor();
		tampar();
		cor = "Azul";
		
Assim que eu instanciar uma classe para objeto usando o metodo construtor
esse objeto já trará os métodos e atributos e ate PARAMETROS
exemplo :
Metodo construtor 
		(m: Caractere,
		 c: Caractere;
		 p: Real)
		 
	setModelo(m)
	setCor(c)
	setPonta(p)
	tampar()
	
c1 = new Caneta ("BIC", "AZUL", 0.5)

CONJUNTOS DE PROPRIEDADES, METODOS E ESTADO ATUAL

INTERFACE:
Nenhuma interface possui atributos, apenas métodos sempre abstratos e quase sempre públicos.

Polimorfimsmo de SOBREPOSIÇÃO e de SOBRECARGA

Polimorfimsmo de SOBREPOSIÇÃO acontece quando substituimos um metodo de uma superclasse na sua subclasse, usando a mesma assinatura.

Polimorfimsmo de SOBRECARGA acontece com metodos com o mesmo nome na mesma classe, com parametros/assinaturas diferentes


Abstração 

Reuso

Encapsulamento


Pense sempre no presente e se for necessário faça manutenções evolutivas no futuro, acrescentando caracteristicas posteriormente.

Unidade mínima e básica da POO, uma estrutura que abstrai um conjunto de objetos 
com características similares. É o MOLDE que define comportamento, atraves de metodos
e caracteristicas atraves dos atributos.

Atributo é o elemento de uma classe responsavel por definir sua estrutura de dados.
E esses atributos farão parte dos objetos criados a partir da classe
Normalmente atributos são definidos como substantivos: carro, computador, viagem

Método é uma porção de código(sub-rotina) que é disponibilizada pela classe.
Visibilidade;
Retorno;
Nome;
Parâmetros;

Normalmente métodos são definidos como verbos: frear, ligar, comprar

Métodos Especiais:
Construtor e Destrutor
Construtor: constrói objetos a partir das classes
Carro()

Destrutor: Auxilia a destruição a objetos.
Ex: void finalize(){}

Sobrecarga: mudar a assinatura de acordo com a necessidade
m1()
m1(int i)
m1(flot f)
m1(String s, long l)
m1(long 1, String s)
Por que usar sobrecarga? para evoluir, mudar, acrescer, metodos


Tipos de heranças:
simples e multiplas
Java e C# nao aceitam heranças multiplas
Classe A extends B 
Python e C++ aceitam heranças multiplas
classe A(B, C)

Upcast e Downcast:
subir ou descer na hierarquia de classes da mais generica para a mais generica
Upcast
A a = new B();
Downcast
B a = (B) new A(); nao é mto util usar o downcast, é uma operacao perigosa
diferente do upcast que é mto utilizada

Polimorfismo:
A mesma ação, se comportando diferente.
Pagamento{ processar()}
Boleto {processar()}

Interface: define um contrato que deve ser seguido pela classe que a implementa
Quando uma classe implementa uma interface ela se compromete a realizar todos os comportamentos que a interface disponibiliza



	
	