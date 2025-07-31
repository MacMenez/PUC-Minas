using System;

namespace Lista3_ATVD2{
    class Calendario{

        public Calendario(int dia, int mes, int ano){
            Dia = dia;
            Mes = mes;
            Ano = ano;
        }

        public int Dia { get; set; }
        public int Mes { get; set; }

        public int Ano { get; set; }

    }
}
