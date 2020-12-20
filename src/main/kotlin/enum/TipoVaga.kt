package enum

import enum.InterfaceEnum.TempoExperiencia

enum class TipoVaga(nome: String): TempoExperiencia {
    DESENVOLVEDOR("Desenvolvedor"),
    GESTOR("Gestor"),
    QA("Analista de Testes Automatizados"),
    SUPORTE("Suporte ao cliente"),
    GERENTE("Gerente"),
    ARQUITETO("Arquiteto"),
    ANALISTA("Analista de Negocios");
}