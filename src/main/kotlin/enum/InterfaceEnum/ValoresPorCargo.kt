package enum.InterfaceEnum

interface ValoresPorCargo {
        fun getSalarioBecario():Double{
            return 1000.00
        }

        fun getSalarioJunior():Double{
            return 1500.00
        }
        fun getSalarioPleno():Double{
            return 2500.00
        }
        fun getSalarioSenior():Double{
            return 4500.00
        }
        fun getSalarioExpecialista():Double{
            return 8000.00
        }

}