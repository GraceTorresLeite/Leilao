package junit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import junit.leilao.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario>{
	
	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario usuario = new Usuario(rs.getString("nome"));
		usuario.setId(rs.getInt("id"));
		return usuario;
	}

}
