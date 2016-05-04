package me.puras.boot.config;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.sql.DataSource;

/**
 * Created by puras on 16/5/3.
 */
@Deprecated
public class DataSourceConfig {
    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    @Value("${db.driver}")
    private String driver;
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    public DataSource dataSource() {
        DruidXADataSource dataSource = new DruidXADataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url.trim());
        dataSource.setUsername(username.trim());
        dataSource.setPassword(password.trim());
//        dataSource.setInitialSize(1); // 连接池启动时创建的初始化连接数量（默认值为0）
//        dataSource.setMaxActive(20); // 连接池中可同时连接的最大的连接数
////        dataSource.setMaxIdle(12); // 连接池中最大的空闲的连接数，超过的空闲连接将被释放，如果设置为负数表示不限
//        dataSource.setMinIdle(1); // 连接池中最小的空闲的连接数，低于这个数量会被创建新的连接
//        dataSource.setMaxWait(60000); // 最大等待时间，当没有可用连接时，连接池等待连接释放的最大时间，超过该时间限制会抛出异常，如果设置-1表示无限等待
//        dataSource.setRemoveAbandonedTimeout(180); // 超过时间限制，回收没有用(废弃)的连接
//        dataSource.setRemoveAbandoned(true); // 超过removeAbandonedTimeout时间后，是否进 行没用连接（废弃）的回收
//        dataSource.setTestOnBorrow(true);
//        dataSource.setTestOnReturn(true);
//        dataSource.setTestWhileIdle(true);
//        // 自动提交事务.如果设置为false 那么在别的jar里面如果有sql语句的执行会入不了库
//        // 之前设置为false的时候,在spring oauth里面token生产之后不会入库.
//        dataSource.setDefaultAutoCommit(true);
//        dataSource.setValidationQuery("SELECT 1");
//        dataSource.setTimeBetweenEvictionRunsMillis(1000 * 60 * 10); // 检查无效连接的时间间隔 设为10分钟
        return dataSource;
    }
}
