package projetotv;

import java.util.Scanner;

public class ProjetoTV {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, opcaoCanal, retorno, opcaoTv;
        
        
        Televisao TVsala = new Televisao();
        Televisao TVquarto = new Televisao();
        
        do{
        System.out.println("Digite qual TV você quer usar: 1 - Tv da Sala ou 2 - Tv do Quarto ou 3 para finalizar");
        opcaoTv = teclado.nextInt();
        
        if (opcaoTv == 1){
            do{
            
            System.out.println("======= TV SALA =======");
            System.out.println("Status: " +  TVsala.isLigada());
            System.out.println("Volume: " + TVsala.getVolume());
            System.out.println("Canal: " + TVsala.getCanal());
            System.out.println("=======================");
            
            System.out.println("1 - LigarDesligar");
            System.out.println("2 - Alterar o canal");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Encerrar");
            
            System.out.println("Digite a opcao desejada: ");
            
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    TVsala.LigarDesligar();		
                    break;
                case 2:
                    System.out.println("Digite o canal que deseja: ");
                    opcaoCanal = teclado.nextInt();
    		    retorno = TVsala.AlterarCanal(opcaoCanal);
                    if (retorno == -2){
                        System.out.println("O cana não pode ser alterado com a TV desligada!");
                    }else{
                        if ( retorno == -1){
                            System.out.println("O canal desejado é invalido!");
                        }else{
                            System.out.println("Canal Alterado! Novo canal: " + TVsala.getCanal() );
                        }
                    }                    
                    break;
                case 3:
    		        TVsala.AumentarVolume();
                    break;
                case 4:
                    TVsala.DiminuirVolume();
    		        break;
    		    case 5:
                    System.out.println("Até mais...");
    		        break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            
            
    	}while (opcao != 5);
	
    }else{
            if(opcaoTv == 2){
                do{
            
            System.out.println("======= TV Quarto =======");
            System.out.println("Status: " +  TVquarto.isLigada());
            System.out.println("Volume: " + TVquarto.getVolume());
            System.out.println("Canal: " + TVquarto.getCanal());
            System.out.println("=======================");
            
            System.out.println("1 - LigarDesligar");
            System.out.println("2 - Alterar o canal");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Encerrar");
            
            System.out.println("Digite a opcao desejada: ");
            
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    TVsala.LigarDesligar();		
                    break;
                case 2:
                    System.out.println("Digite o canal que deseja: ");
                    opcaoCanal = teclado.nextInt();
    		    retorno = TVsala.AlterarCanal(opcaoCanal);
                    if (retorno == -2){
                        System.out.println("O cana não pode ser alterado com a TV desligada!");
                    }else{
                        if ( retorno == -1){
                            System.out.println("O canal desejado é invalido!");
                        }else{
                            System.out.println("Canal Alterado! Novo canal: " + TVsala.getCanal() );
                        }
                    }                    
                    break;
                case 3:
    		        TVsala.AumentarVolume();
                    break;
                case 4:
                    TVsala.DiminuirVolume();
    		        break;
    		    case 5:
                    System.out.println("Até mais...");
    		        break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            
                   
    	}while (opcao != 5);
	
    }
            }
            
        }while (opcaoTv != 3);
        System.out.println("Operação Finalizada");
        
        }
    
        
}
