package com.yjz.site.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
@MapperScan("com.yjz.site.dao")
public class DataSourceConfig {
    //jdbc.driver=com.mysql.jdbc.Driver
    //jdbc.url=jdbc:mysql://localhost:3306/yjzapp?useUnicode=true&characterEncoding=utf8&useSSL=false
    //jdbc.user=root
    //jdbc.password=8812

    @Value("${jdbc.driver}")
    private String jdbcDrvier;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.user}")
    private String jdbcUser;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createComboPooledDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDrvier);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUser);
        dataSource.setPassword(jdbcPassword);
        dataSource.setAutoCommitOnClose(false);

        return dataSource;
    }
}
