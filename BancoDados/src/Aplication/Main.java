package Aplication;

import EntidadesModel.Cliente;
import EntidadesModel.Funcionario;
import RegraDao.ClienteDAO;
import RegraDao.FuncionarioDAO;

public class Main {
	
	public static void main(String[] args) {
		
		ClienteDAO clienteDao = new ClienteDAO();
		FuncionarioDAO fumDao = new FuncionarioDAO();
		
		Funcionario fumm = new Funcionario();
		Cliente cli = new Cliente();
		
		//cli.informacaoCliente();
		//cli.setNomeCliente("pedro"); // add cliente individual
		//fumm.informacaoFuncionario();
		
		//clienteDao.save(cli); //salvando os dados no bd
		//fumDao.save(fumm); // salvando os dados no bd
		
		
		
		//Cliente cli2 = new Cliente();
		//cli2.setNomeCliente("ramos");
		
		//cli2.setIdCliente(1);
		//clienteDao.update(cli2);
		
		/*
		Funcionario fun2 = new Funcionario();
		fun2.setNomeFuncionario("barbosa");
		fun2.setIdFuncionario(2);
		fumDao.update(fun2);
		
		*/
		
		
		//clienteDao.deleteById(1);
		
		fumDao.deleteByIdF(1);
		
		//visualização registro do bd
		
		for( Funcionario f: fumDao.getFuncionario()) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("id: " + f.getIdFuncionario());
			System.out.println("Nome funcionario: " + f.getNomeFuncionario());
			System.out.println("fucao: " + f.getFuncao());
			System.out.println("salario: " + f.getSalario());
			System.out.println("cpf:  " + f.getCpf());
			System.out.println("endereço: " + f.getEndereco());
			
		}
		/*
		for( Cliente c: clienteDao.getCleinte()) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("id: " + c.getIdCliente());
			System.out.println("Nome funcionario: " + c.getNomeCliente());
			System.out.println("cpf:  " + c.getCpf());
			System.out.println("endereço: " + c.getEndereco());
			
		}
		*/
		
		
		
	}
}
