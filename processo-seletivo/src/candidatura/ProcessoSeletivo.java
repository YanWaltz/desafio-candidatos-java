package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
      selecaoCandidatos();
    }

        static void selecaoCandidatos(){
            String [] candidatos = {"Yan", "Paulo", "Igor", "Letícia", "Bruno", "Marcelle", "Lucas", "Pablo", "Sérgio", "Liz", "Mateus"};

                int candidatosSelecionados = 0;
                int candidatosAtual =0;
                double salarioBase = 2000.0;

            while(candidatosSelecionados<5 && candidatosAtual<candidatos.length){
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();

                    System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
                        if(salarioBase >= salarioPretendido){
                            System.out.println("O candidato " + candidato + " foi selecionado"); 
                            
                            candidatosSelecionados++;

                        }
                        
            candidatosAtual++;
        
        }       
    }

    static double valorPretendido(){return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}
