
public class Ejercicio1 {

	public static String s;

	public static String Retorno (String[] args) {
			s = null;
			if (s.length() <= 2) {
	            return s;
	        }
	        char[] ch = s.toCharArray();
	        for (int i = 1; i < ch.length - 1; i++) {
	            ch[i] = '*';
	        }
	        return new String(ch);
	
	}

	public static String sustituir(String palabra) {

		return palabra;
	}

}
