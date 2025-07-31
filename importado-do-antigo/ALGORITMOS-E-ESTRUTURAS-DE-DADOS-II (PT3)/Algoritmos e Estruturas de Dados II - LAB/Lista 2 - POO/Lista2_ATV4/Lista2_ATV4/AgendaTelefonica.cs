using System;

namespace Lista2_ATV4{
    class AgendaTelefonica{
        private Contato[] agenda;
        private int quant;

        public AgendaTelefonica(int tam){
            agenda = new Contato[tam];
            quant = 0;
        }

        public void InserirNovoContato(Contato contato){
            if(quant < agenda.Length){
                agenda[quant] = contato;
                quant++;
            }
        }

        public Contato BuscarContatoNome(String nome){
            for(int i = 0; i < quant; i++){
                if(agenda[i].Nome == nome){
                    return agenda[i];
                }
            }
            return null;
        }

        public void ImprimirAgenda() {
            Contato temp;
            Data dataTemp;

            for(int i = 0; i < quant; i++){

                temp = agenda[i];

                Console.WriteLine("-----------------------------");
                Console.WriteLine(temp.Nome);
                Console.WriteLine(temp.Celular);
                Console.WriteLine(temp.Email);

                dataTemp = temp.Aniversario;

                Console.WriteLine(dataTemp.Dia);
                Console.WriteLine(dataTemp.Mes);
                Console.WriteLine("-----------------------------");
            }
        }
    }
}
