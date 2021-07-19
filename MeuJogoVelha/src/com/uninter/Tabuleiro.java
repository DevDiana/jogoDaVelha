package com.uninter;

public class Tabuleiro {
	public int mat[][] = new int[3][3];
	//1 - X - Jogador humano
	//-1 - O - Computador
	//0 - Espaco vazio
	public boolean situacao() {
		// logica de verificar quem venceu ou se empatou ou se o jogo continua
		if(ganhou() == 0 ){
            System.out.println("----------------------");
            System.out.println("\nRodada "+rodada);
            System.out.println("É a vez do jogador " + vez() );
            
            if(vez()==1)
                jogador1.jogar(tabuleiro);
            else
                jogador2.jogar(tabuleiro);
            
            
            if(tabuleiro.tabuleiroCompleto()){
                System.out.println("Tabuleiro Completo. Jogo empatado");
                return false;
            }
            vez++;
            rodada++;

            return true;
        } else{
            if(ganhou() == -1 )
                System.out.println("Jogador 1 ganhou!");
            else
                System.out.println("Jogador 2 ganhou!");
            
            return false;
        }
	
	}
	
	public void visualizar() {
		
		for (int i = 0; i < mat.length; i++) {//linhas
			for (int j = 0; j < mat.length; j++) {//colunas
				if(mat[i][j]==1) {
					System.out.print("X ");
				}
				else if(mat[i][j]==-1) {
					System.out.print("O ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
	
	

}
