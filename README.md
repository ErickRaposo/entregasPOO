# 1ª Atividade POO

Os serviços de correio expresso internacionais, como FedEx, DHL e UPS, oferecem várias opções de entrega de pacotes, cada qual com custos específicos.

Crie uma hierarquia de herança para representar vários tipos de pacotes. Utilize Pacote como a classe básica da hierarquia, e inclua as clases PacoteDoisDias e PacoteNoturno que herdam de Pacote.

Defina uma classe Endereco para representar o endereço do remetente ou do destinatário de um pacote. Um endereço deve ter logradouro (nome da rua, avenida, praça, etc.), número, complemento, bairro, cidade, estado e CEP.

A superclasse Pacote deve incluir atributos para representar o nome e o endereço tanto do remetente como do destinatário do pacote, além de variáveis de instância que armazenam o peso (em quilos) e o custo por quilo para a entrega do pacote. O construtor da classe Pacote deve inicializar esses membros de dados. Assegure que o peso e o custo por quilo contenham valores positivos.

Pacote deve fornecer um método público calculaCusto que retorna o custo associado com a entrega do pacote multiplicando o peso e o custo por quilo.

A subclasse PacoteDoisDias deve herdar a funcionalidade da classe básica Pacote, mas deve também incluir um atributo que representa uma taxa fixa que a empresa de entrega cobra pelo serviço de entrega em dois dias. O construtor da classe PacoteDoisDias deve receber um valor para inicializar esse atributo, além dos demais atributos. PacoteDoisDias deve redefinir o método calculaCusto para que ele calcule o custo de entrega adicionando a taxa fixa ao custo baseado em peso calculado pelo método calculaCusto da classe Pacote.

A classe PacoteNoturno deve herdar diretamente da classe Pacote e conter um atributo adicional para representar uma taxa adicional por quilo cobrado pelo serviço de entrega noturno. PacoteNoturno deve redefinir o método calculaCusto para que seja acrescenteada a taxa adicional por quilo ao custo-padrão por quilo antes de calcular o custo da entrega.

Escreva um programa para processar vários pacotes, exibindo as informações de endereço de rementente e destinatário da maneira que apareceriam nos pacotes dos correios, e o custo de entrega
de cada pacote. Calcule e exiba também o custo total de entrega de todos os pacotes. O programa deve usar uma estrutura de dados polimórfica contendo referências para objetos que representam pacotes de diferentes tipos. A estrutura de dados deve ser processada em um laço de repetição que visita cada pacote, usando polimorfismo e ligação dinâmica.