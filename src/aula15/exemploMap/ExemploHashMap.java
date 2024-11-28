package aula15.exemploMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class ExemploHashMap {
	public static void main(String[] args) {
		SortedMap<String,String> capitais = new TreeMap<>();

		capitais.put("RS","Porto Alegre");
		capitais.put("RJ","Rio de Janeiro");
		capitais.put("SP","São Paulo");
		capitais.put("SC","Florianópolis");
		capitais.put("PR","Curitiba");
		System.out.println(capitais);
		capitais.put("RS","Rio Grande");
		System.out.println(capitais);
		System.out.println(capitais.keySet());
		System.out.println(capitais.values());
		for(String uf : capitais.keySet())
			System.out.print(uf+" ");
		capitais.remove("RJ");
		System.out.println("\n"+capitais);
		capitais.remove("PR","Curitiba");
		System.out.println(capitais);
	}
}
