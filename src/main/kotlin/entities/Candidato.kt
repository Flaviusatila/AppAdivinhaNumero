package entities

import java.util.*

class Candidato(
    val id: Int, var nome: String,
    var dataNascimento: String, var email: String,
    val listArquivos: List<Arquivos>
) {
    constructor() : this(-1,"","","", emptyList())
}