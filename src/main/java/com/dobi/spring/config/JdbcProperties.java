package com.dobi.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 对应JdbcConfig1-方式2
 */
@ConfigurationProperties(prefix = "jdbc")  //配置属性,在appplication.properties中读取

//@Data  //lombok里面的，帮我们自动生成get set hashcode  toString 构造函数 方法
public class JdbcProperties {


    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public JdbcProperties() {
    }

    public JdbcProperties(String url, String driverClassName, String username, String password) {
        this.url = url;
        this.driverClassName = driverClassName;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JdbcProperties that = (JdbcProperties) o;

        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (driverClassName != null ? !driverClassName.equals(that.driverClassName) : that.driverClassName != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        return password != null ? password.equals(that.password) : that.password == null;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (driverClassName != null ? driverClassName.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
