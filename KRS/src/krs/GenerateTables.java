/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package krs;

import java.sql.Connection;
import java.sql.SQLException;
import javax.security.auth.login.Configuration;
import javax.sql.DataSource;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author agoes
 */
public class GenerateTables {

    public static void main(String[] args) throws SQLException {
        AbstractApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:appContext.xml");
        DataSource dataSource = (DataSource) appContext.getBean("dataSource");
        AnnotationConfiguration cfg = new AnnotationConfiguration().configure("hibernate.cfg.xml");
        Connection conn = dataSource.getConnection();
        new SchemaExport(cfg, conn).create(true, true);
        
        System.exit(0);
    }
}
