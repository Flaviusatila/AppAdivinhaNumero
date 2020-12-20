package enum

import enum.InterfaceEnum.ValoresPorCargo

enum class Cargo( val cargo: String): ValoresPorCargo {
    ESTAGIARIO("Beccario"),
    JUNIOR("Junior"),
    PLENO("Pleno"),
    SENIOR("Senior");

}