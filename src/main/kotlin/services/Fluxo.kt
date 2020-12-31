package services

import builders.AdicionarArquivos
import entities.Candidato
import services.Fluxo
import java.util.*

object Fluxo {

    var adicionarArquivos = AdicionarArquivos()

    var candidato = Candidato()

    fun createCandidato() {
        val scanner = Scanner(System.`in`)
        val candidato1 = Candidato().let {
            println("Digite o nome do candidato")
            scanner.next().also { candidato.nome = it }
        }.let {
            println("Digite a data de nascimento do candidato")
            scanner.next().also { candidato.dataNascimento = it }
        }.let {
            println("Digite o email do candidato")
            scanner.next().also { candidato.email = it }
        }.let {
            var list:MutableList<Candidato>  = listarCandidatos(candidato)
            list.forEach{
                    c -> println("${c.nome} \n ${c.email} \n ${c.dataNascimento}")
            }.let {
                separador()
                println("Lista de candidatos cadastrados")
                adicionarArquivos.mostrarArquivos(adicionarArquivos.iniciarArquivos())
            }
        }
    }

    private fun listarCandidatos(candidato: Candidato): MutableList<Candidato> {
            val candidato1:Candidato = Candidato(
                1, "Jose", "10/12/1993",
                "jose@gmail.com", adicionarArquivos.iniciarArquivos())
            var list =  mutableListOf<Candidato>(candidato1)
                list.add(candidato)
            return list
    }

    fun separador(){
        println("____________________//_______________________")
    }

}