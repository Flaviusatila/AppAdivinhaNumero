package entities

import java.time.LocalDateTime
import java.util.*

open class Entrevista(
    val id: Int,
    val dataEHora: LocalDateTime,
    val candidato: Candidato,
    val entrevistador: Entrevistador,
    val listComentarios: AbstractList<Comentarios>?
) {
}