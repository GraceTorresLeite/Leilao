package init;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.dao.LanceDao;
import junit.dao.LeilaoDao;
import junit.dao.UsuarioDao;

public class Init {
	
public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml")) {
			
			UsuarioDao tabelaUsuarios = (UsuarioDao) ctx.getBean("usuarioDao");
			LanceDao tabelaLances = (LanceDao) ctx.getBean("lanceDao");
			LeilaoDao tabelaLeiloes = (LeilaoDao) ctx.getBean("leilaoDao");
			
			tabelaUsuarios.criaTabela();
			tabelaLeiloes.criaTabela();
			tabelaLances.criaTabela();
			
		}

	}

}
