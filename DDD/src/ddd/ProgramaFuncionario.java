package ddd;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.setNome("Leandro");
		func1.setSalario(2500);
		System.out.println("Nome: " + func1.getNome());
		
		Funcionario func2 = new Funcionario();
		func2.setNome("Fernando");
		System.out.println("Nome: " + func2.getNome());
		func2.setSalario(2000);
		
		//atributos encapsulados
		System.out.println(func1);
		System.out.println(func2);
		
		double retorno1 = func1.aumentarSalario(20);
		func1.setSalario(retorno1);
		
		double retorno2 = func2.aumentarSalario(10);
		func2.setSalario(retorno2);
		
		System.out.println("Func1: " + func1.getSalario());
		System.out.println("Func2: " + func2.getSalario());
		
		
	}

}
