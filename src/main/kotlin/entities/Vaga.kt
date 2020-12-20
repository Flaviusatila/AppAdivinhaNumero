package entities

import enum.Cargo
import enum.TecnologiaVaga
import enum.TipoVaga

class Vaga(
   val id: Int, val salario: Double,val tecnologiaVaga: TecnologiaVaga,
   val tipoVaga: TipoVaga, val cargo: Cargo,val quantidade: Int
) {
}