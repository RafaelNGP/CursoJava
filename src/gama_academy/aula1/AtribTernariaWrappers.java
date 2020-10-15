package gama_academy.aula1;

public class AtribTernariaWrappers {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Integer objNum1 = new Integer(2);
		Integer objNum2 = 2;

		int priNum1 = 2;
		int priNum2 = 2;

		String val1 = priNum1 == priNum2 ? "priNum1 igual ao priNum2" : "priNum1 diferente do priNum2";
		String val2 = objNum1 == objNum2 ? "objNum1 igual ao objNum2" : "objNum1 diferente do objNum2";
		String val3 = objNum1.equals(objNum2) ? "objNum1 igual ao objNum2" : "objNum1 diferente do objNum2";

		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
	}
}