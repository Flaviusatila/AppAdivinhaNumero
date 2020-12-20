package entities

import enum.Cargo
import enum.TecnologiaVaga

open class Entrevistador(val nome: String,val cargo: Cargo,val tecnologiaVaga: TecnologiaVaga,val tempoEmpresa: String) {
}