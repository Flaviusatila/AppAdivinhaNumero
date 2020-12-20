package entities

import enum.TipoDocumento
import java.util.*


class Arquivos(
    val id: Int,val nome: String, val tipoDocumento: TipoDocumento?,
    val dataEnvioDoc: Date
)