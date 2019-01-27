package zolzack;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/resources/spring/context-common.xml",
									"file:src/resources/spring/context-properties.xml",
									"file:src/resources/spring/context-sqlMap.xml"})

@PropertySource("file:src/resources/properties/db.properties")
public class TestField  {

	@Autowired
	private DataSource datasource;
	
	@Test
	public void textConnection() {
		try(Connection conn = datasource.getConnection()) {
			
			System.out.println(conn);
			System.out.println("성공");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
