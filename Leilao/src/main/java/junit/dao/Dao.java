package junit.dao;

import javax.sql.DataSource;

public interface Dao {
	
	public void setDataSource(DataSource ds);
	public void limpa();

}
