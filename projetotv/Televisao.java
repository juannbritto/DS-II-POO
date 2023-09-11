
package projetotv;

public class Televisao {
    private boolean ligada;
    private int canal;
    private int volume;

    public Televisao() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 0;
    }


    public void LigarDesligar() {
        ligada = !ligada;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }


    public int AlterarCanal(int canal) {
	if (ligada){
            if (canal == 1 || canal == 3 || canal == 5 || canal == 7 || canal == 11){
                this.canal = canal;
                return canal;
            }
            return -1;
        }
	return -2;
    }
    
    public void AumentarVolume(){
        if(ligada== true && volume<100){		
            volume ++;
        }
    }
    
    public void DiminuirVolume(){
        if(ligada== true && volume > 0){
            volume --;
        }
    }

    
}
