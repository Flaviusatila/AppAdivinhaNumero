package builders

import entities.Arquivos
import entities.Candidato
import enum.TipoDocumento
import java.util.*

class AdicionarArquivos {



    val iniciarArquivos = fun(): List<Arquivos> {
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
        return listOf<Arquivos>(arquivos1,arquivos2,arquivos3,arquivos4)
    }

    val listaArquivos = iniciarArquivos

    val candidato:Candidato = Candidato(
            1, "Jose", Date(19931012),
            "jose@gmail.com", listaArquivos)



    override fun toString(): String {
        return "${candidato.id}, ${candidato.nome}, ${candidato.dataNascimento}, ${candidato.listArquivos}"
    }

}