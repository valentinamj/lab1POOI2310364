package poo1;

public class Actividad3e7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		int x=1, y=2, z=3;
		
		if(++x > y++ || x-- > 0)
			z++;
		else
			z--;
		System.out.println(x+" "+y+" "+z);

		// La respuesta es: 1 3 4 

	}

}
