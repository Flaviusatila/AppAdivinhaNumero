package builders

import entities.Arquivos
import entities.Candidato
import enum.TipoDocumento
import java.text.SimpleDateFormat
import java.util.*

fun Date.formatToViewDateTimeDefaults(): String{
    val sdf= SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault())
    return sdf.format(this) }


class AdicionarArquivos {


    fun iniciarArquivos(): List<Arquivos> {
        val arquivos1 = Arquivos(
            1, "Copia CPF",
            TipoDocumento.CPF, Date(20201212)
        )
        val arquivos2 = Arquivos(
            2, "CERTIFICADO1",
            TipoDocumento.CERTIFICADO, Date(20201212)
        )
        val arquivos3 = Arquivos(
            3, "CERTIFICADO2",
            TipoDocumento.CERTIFICADO, Date(20201212)
        )
        val arquivos4 = Arquivos(
            4, "Curriculo",
            TipoDocumento.CURRICULO, Date(20201212)
        )
        return listOf(arquivos1,arquivos2,arquivos3,arquivos4)
    }

//    override fun toString(): String {
//        return "${candidato.id}, ${candidato.nome}, ${candidato.dataNascimento.formatToViewDateTimeDefaults()}"
//    }

    fun mostrarArquivos(listaArquivos:List<Arquivos>){
        listaArquivos.forEach{
                arquivo -> print(" ${arquivo.id},\n ${arquivo.nome},\n ${arquivo.tipoDocumento},\n ${arquivo.dataEnvioDoc.formatToViewDateTimeDefaults()}")
        }


    }

//    fun listarCandidatos(candidato: Candidato): MutableList<Candidato> {
//        val candidato1:Candidato = Candidato(
//            1, "Jose", "10/12/1993",
//            "jose@gmail.com", listaArquivos)
//        var list =  mutableListOf<Candidato>(candidato1)
//        list.add(candidato)
//        return list
//    }

}


