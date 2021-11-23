/*
 * DBConnection.java
 * @author  johnericx or Eric P Lozarita
 * Created on September 7, 2007, 10:40 PM
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 *
 *
 */
package dbconn;

import java.sql.*;

/**
 *
 * @author johnericx or Eric P Lozarita
 */
public class DBConnection {

    /**
     * Local Host DBConnection
     */
    private static String dbDriver = "com.mysql.jdbc.Driver";
    private static String jdbcUrl = "jdbc:mysql://localhost:3306/dbpersonprofiles";
    public static Connection conn;
    private static String mySqlUsername = "root";   //Default username value:
    private static String mySqlPassword = "";  //Default password value

    /**
     * @param aDbDriver the dbDriver to set
     */
    public static void setDbDriver(String aDbDriver) {
        dbDriver = aDbDriver;
    }

    /**
     * @param aJdbcUrl the jdbcUrl to set
     */
    public static void setJdbcUrl(String aJdbcUrl) {
        jdbcUrl = aJdbcUrl;
    }

    /**
     * @return the mySqlUsername
     */
    public static String getMySqlUsername() {
        return mySqlUsername;
    }

    /**
     * @param aMySqlUsername the mySqlUsername to set
     */
    public static void setMySqlUsername(String aMySqlUsername) {
        mySqlUsername = aMySqlUsername;
    }

    /**
     * @return the mySqlPassword
     */
    public static String getMySqlPassword() {
        return mySqlPassword;
    }

    /**
     * @param aMySqlPassword the mySqlPassword to set
     */
    public static void setMySqlPassword(String aMySqlPassword) {
        mySqlPassword = aMySqlPassword;
    }

    private static String getDbDriver() {
        return dbDriver;
    }

    private static String getJdbcUrl() {
        return jdbcUrl;
    }

    private String getUsername() {
        return getMySqlUsername();
    }

    private void setUsername(String val) {
        this.setMySqlUsername(val);
    }

    private String getPassword() {
        return getMySqlPassword();
    }

    private void setPassword(String val) {
        this.setMySqlPassword(val);
    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection aval) {
        conn = aval;
    }
    
    public static void main(String[] args){
        DBConnection db = new DBConnection();
        db.getConnectToDbHost();
        System.out.println("Database Connected!");
    }

 
   /**
     *
     * Get connect to db host <br/> by using getter and setter <br/> Uses MySql
     * JDBC Connection Pool
     *
     */
    public void getConnectToDbHost() {
        try {
            //Mysql JDBC
            if (getConn() == null || getConn().isClosed()) {
                try {
                    Class.forName(getDbDriver()).newInstance();
                    setConn(DriverManager.getConnection(getJdbcUrl(), getUsername(), getPassword()));
//                    conn.close();
                    //System.out.println("Connected .... ko");
                } catch (Exception e) {
                    System.err.println(e);
                }
            } else {
                //System.out.println("Connection still open...");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     *
     * Get connect to db host <br/> by return type
     *
     */
    public Connection getConnection() {
        try {
            if (getConn() == null || getConn().isClosed()) {
                try {
                    Class.forName(getDbDriver());
                    setConn(DriverManager.getConnection(getJdbcUrl(), getUsername(), getPassword()));
                    System.out.println("Connected .... ");
                } catch (Exception e) {
                    //System.err.println(e);
                }
            } else {
                //System.out.println("Connection still open...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return getConn();
    }
}
