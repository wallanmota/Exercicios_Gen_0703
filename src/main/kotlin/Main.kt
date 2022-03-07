fun main() {
    /*
    Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais duas opções
    de construtores conforme sua percepção, com os atributos:
    nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.

    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
     */

    try {
        var cliente1 = Cliente("Fulano de Tal", "Rua 123", "99999999" )
        println("Quanto Items deseja cadastrar para o cliente:  $cliente1?")
        val qtdItens = readLine()!!.toInt()

        for(i in 1..qtdItens){
            print("Digite o ${i}º item: ")
            val item = readLine()!!
            cliente1.addItem(item)
        }

        println("Segue abaixo a lista com os itens cadastrados do cliente: $cliente1")
        cliente1.listarItens()

        println("Deseja remover algum item da lista? (S/N)")
        var remover = readLine()!!
        while(remover != "S" && remover != "s" && remover != "N" && remover != "n"){
            print("Opção invalida: Digite (S ou N): ")
            remover = readLine()!!
        }
        if(remover == "s" || remover == "S"){
            print("Digite o item que deseja remover: ")
            val item = readLine()!!
            cliente1.removeItem(item)
        }
        println("Segue abaixo a lista atualizada:")
        cliente1.listarItens()

    }catch (e: Exception){
        println(e.message)
    }

}