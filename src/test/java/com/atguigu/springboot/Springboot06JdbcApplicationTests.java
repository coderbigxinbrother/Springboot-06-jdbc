package com.atguigu.springboot;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06JdbcApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() throws SQLException {
		//org.apache.tomcat.jdbc.pool.DataSource
		System.out.println(dataSource.getClass());

		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();

	}
}
