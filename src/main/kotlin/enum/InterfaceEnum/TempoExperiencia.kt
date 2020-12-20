package enum.InterfaceEnum

interface TempoExperiencia {
        fun getTempoBecario():String{
            return "Sem Experiencia"
        }

        fun getTempoJunior():String{
            return "Um ano de experiencia"
        }
        fun getTempoPleno():String{
            return "Dois anos de experiencia"
        }
        fun getTempoSenior():String{
            return "Cinco anos experiencia"
        }
        fun getTempoExpecialista():String{
            return "Mais de dez anos experiencia"
        }

}