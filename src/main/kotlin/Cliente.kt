data class Cliente(private var nome: String) {

    init {
        if(nome.isEmpty()){
            throw Exception("Classe sendo instanciada de maneira incorreta!")
        }else{
            println("Classe instanciada!")
        }
    }

    private var endereco = ""
    private var fone = ""
    private var listaDeCompras = mutableListOf<String>()

    constructor(
        nome: String,
        endereco: String,
        fone: String
    ): this(nome){
        this.endereco = endereco
        this.fone = fone
    }
    constructor(
        nome: String,
        endereco: String,
        fone: String,
        listaDeCompras: MutableList<String>
    ): this(nome, endereco, fone){
        this.listaDeCompras = listaDeCompras
    }

    fun addItem(item: String){

        if(item.isEmpty()){
            println("Item Inválido")
        }else{
            listaDeCompras.add(item)
        }

    }

    fun removeItem(item: String){
        if(item.isEmpty()){
            println("Item inválido")
        }else if(listaDeCompras.contains(item)){
            listaDeCompras.remove(item)
            println("Item removido com sucesso")
        }else{
            println("Esse item não existe na lista")
        }
    }

    fun listarItens(){
        listaDeCompras.forEach {
            println(it)
        }
    }
}


