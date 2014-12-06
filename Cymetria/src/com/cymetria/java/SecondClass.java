package com.cymetria.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass {
	public void main(String[] args) throws IOException{
		/*
		 * Segunda clase, condicionales compuestos
		 */

		
		// El br (BufferReader) que usamos acá es para poder leer lo que inserta el usuario en consola 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;

		int b; 

		String c;

		System.out.println("whats ur age"); 
		String answer;
		answer=br.readLine();
		a = Integer.parseInt(answer);

		System.out.println("what gnere are u");
		c=br.readLine();

		System.out.println("how far fo u live");
		//String answer;
		answer=br.readLine();
		b = Integer.parseInt(answer);


		boolean olderthan24=a>24;

		boolean iswoman=c.equals("f");

		boolean range=b<10;

		if(olderthan24&&iswoman&&range){
			System.out.println ("u can enter first party");
		}else{
			System.out.println ("sorry u cant get into 1 party");
		}

		boolean olderthan15=a>15;
		iswoman = c.equals("f") || c.equals("m");
		range = b<100;

		if(olderthan15&&iswoman&&range){
			System.out.println("welcome to second hell");
		}else{
			System.out.println("gtfo form second party");
		}
		boolean youngerthan40=a<40;
		iswoman = c.equals("m");
		range = b>=15;

		if(youngerthan40&&iswoman&&range){
			System.out.println("enter the third party"); 
		}else{
			System.out.println("go away from third party");
		}


		/*
		 * Segunda clase, ciclos, for
		 */

		int[]telefonos;
		//System.out.println("how many ppl r in the room");
		//String answer =br.readLine();
		//int ppl;
		//ppl=Integer.parseInt(answer);
		telefonos=new int[6];
		telefonos [0]=3445343;
		telefonos [1]=1234235;
		telefonos [2]=5432211;
		telefonos [3]=1234255555;
		telefonos [4]=5555666;
		telefonos [5]=756745745;


		System.out.println("what number");
		answer =br.readLine();
		int index=Integer.parseInt(answer);
		System.out.println(telefonos[index]);


		for(int i=0;i<6;i++){
			System.out.println(telefonos[i]+" telefono "+i+" has this price");
		}


		System.out.println("how many ppl inr in the room");
		answer=br.readLine();
		int replie=Integer.parseInt(answer);
		String [] raw;
		raw=new String[replie];
		for(int r=0;r<replie;r++){
			System.out.println("pls gimme the name of dat dude "+r);
			raw [r]=br.readLine();
		}	

		for(int r=0;r<replie;r++){
			System.out.println(raw[r]+"person " +r);
		}



		for(int r=10;r>3;r--){
			System.out.println(r);	
		}	
	}
}
