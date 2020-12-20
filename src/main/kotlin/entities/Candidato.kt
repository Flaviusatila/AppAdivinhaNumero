package entities

import java.util.*

open class Candidato(
    val id: Int, val nome: String,
    val dataNascimento: Date, val email: String,
    val listArquivos: () -> List<Arquivos>
) {
    override fun toString(): String {
        return "$id"
    }
}