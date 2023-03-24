package punto2;

public class Punto2 {
	public static void main(String[] args) {
	    String str = "Hello World!";
	    for (int i = 0; i < 4; i++)           //El error del código es el ; en la linea del for, si se le quita ya imprime los 4 "Hello World!"
	    
	        System.out.println(str);
	        str += "!";
	}

}
