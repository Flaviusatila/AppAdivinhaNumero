import builders.AdicionarArquivos
import entities.Arquivos
import enum.Cargo

fun main() {

    var cargo = Cargo.ESTAGIARIO.getSalarioBecario()

    var teste = AdicionarArquivos()

    println(teste.candidato.toString())

}