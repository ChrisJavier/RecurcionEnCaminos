package caminos;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicios {

	
	
	private static int [][] caminos = {{0, 5, 0, 5, 7},
			{0, 0, 4, 0, 0},
			{0, 0, 0, 8, 2},
			{0, 0, 0, 0, 6},
			{0, 3, 0, 0, 0}};
	private static int [][] Camino;
	private static int suma=0;
	public static void main (String args[]){

		
		int FilA=0,ColA=0;
		int cont=1;
		String CaminoIn,CaminoFn,Tokens;
		
		
		Camino=caminos;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Programa de Caminos");
		imprimirArray(caminos);
		
		System.out.println("Ingrese el camino de Inicio-->");
		CaminoIn= entrada.next();
		
		FilA=IdentificadorCaminos(CaminoIn);
	
		System.out.println("Ingrese el camino Final -->");
		CaminoFn=entrada.next();

			ColA=IdentificadorCaminos(CaminoFn);	
	
		for(int i=0;i<Camino.length;i++){
			
			if(Camino[FilA][i]!=0){
				System.out.println("El camino "+cont+"="+EncontrarCaminos(FilA, ColA,FilA, ColA));
				cont++;
				suma=0;
				Camino[FilA][i]=0;
			}
			if(ColA==i)
				break;
		}
			

	}
	
	
	public static int EncontrarCaminos(int filA,int colA, int filB, int colB){

		for(int i=filA; i<filA+1;i++){
			
				for(int j=0; j<Camino.length;j++){
				
					if(colB==j)
						return suma+=Camino[filA][j];
					
					if(Camino[i][j]!=0){
						suma+=Camino[i][j];
						EncontrarCaminos(j, 0,filB, colB);
						return suma;
					
					}
			}
		}
	return suma;	
	}
		

	public static int IdentificadorCaminos(String Camino){
		
	
		switch(Camino.toUpperCase()){
		
		case "A":
			return 0;
		
		case "B":
			return 1;
		
		case "C":
			return 2;
		
		case "D":
			return 3;
		
		case "E":
			return 4;
		
		default:
			return -1;
		
		}
		
		
	}


	

	public static void imprimirArray(String[][] a){

		for(int i=0; i<a.length; i++){

			for(int j=0; j<a[0].length; j++){

				System.out.print(a[i][j]+" ");

			}

			System.out.println(" ");

		}


	}
	
	public static void imprimirArray(int[][] a){

		for(int i=0; i<a.length; i++){

			for(int j=0; j<a[0].length; j++){

				System.out.print(a[i][j]+" ");

			}

			System.out.println(" ");

		}


	}
	



}
