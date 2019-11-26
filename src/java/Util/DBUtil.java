
package Util;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtil {
    private String driver;
    private String url;
    private String username;
    private String password;
    private int PageSize;
    
    private Connection connection;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int PageSize) {
        this.PageSize = PageSize;
    }
    
    public DBUtil(){
        driver = "com.mysql.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/ithardware?zeroDateTimeBehavior=convertToNull";
        username="root";
        password="123456";
        PageSize = 10;
    }
    
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
        }
    }
    
    private Connection getConnection(){
        try {
            Class.forName(driver);
            connection=(Connection)DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    private PreparedStatement getPreparedStatement(String sql){
        try {
            pstmt=(PreparedStatement)getConnection().prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pstmt;
    }
    
    private void setParams(String sql,String[] params){
        pstmt=this.getPreparedStatement(sql);
        if(params!=null){
            for (int i = 0; i < params.length; i++) {
                try {
                    pstmt.setString(i+1, params[i]);
                } catch (SQLException ex) {
                    Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public List getList(String sql,String[] params){
        List list=new ArrayList();
        try {
            this.setParams(sql, params);
            rs=pstmt.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            while(rs.next()){
                Map m=new HashMap();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    String colName=rsmd.getColumnName(i);
                    m.put(colName, rs.getString(colName));
                }
                list.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            close();
        }
        return list;
    }
    
    public Map getMap(String sql, String[] params) {
       
        List list = getList(sql, params);
        System.out.println(sql);
        if (list.isEmpty()) {
            System.out.println("list is null");
            return null;
        } else {
            for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
            return (Map) list.get(0);
        }
    }

    public int update(String sql, String[] params) {
        int recNo = 0;//表示受影响的记录行数
        try {
            setParams(sql, params);
            recNo = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return recNo;
    }
    
    public int updateprice(String sql,String THaNo,String THaName,String TBuNo,String TBuName,double TNowPrice){
        int recNo = 0;//表示受影响的记录行数
        pstmt=this.getPreparedStatement(sql);
        try {
            pstmt.setString(1, THaNo);
            pstmt.setString(2, THaName);
            pstmt.setString(3, TBuNo);
            pstmt.setString(4, TBuName);
            pstmt.setDouble(5, TNowPrice);
            recNo = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return recNo;
    }
    
    //执行数据库查询操作时，返回结果的记录总数
    private int getTotalRows(String sql, String[] params) {
        int totalRows = 0;
        sql = sql.toLowerCase();
        String countSql = "";
        if (sql.indexOf("group") >= 0) {//indexOf返回字符串首次出现的位置
            countSql = "select count(*) from (" + sql + ") as tempNum";
        } else {
            countSql = "select count(*) as tempNum " + sql.substring(sql.indexOf("from"));
        }
        String count = (String) getMap(countSql, params).get("tempNum");
        totalRows = Integer.parseInt(count);
        return totalRows;
    }
//分页显示查询结果时，将当前页中的所有信息封装到PageBean中
    public PageBean getPageBean(String sql, String[] params, int curpage) {
        String newsql = sql + " limit " + (curpage - 1) * PageSize + "," + PageSize;//limit限制检索条数
        List data = this.getList(newsql, params);
        System.out.println(sql);
        PageBean pb = new PageBean();
        pb.setCurpage(curpage);
        pb.setPageSize(PageSize);
        pb.setTotalRows(getTotalRows(sql, params));
        pb.setData(data);
        return pb;
    }

    public Category getCategory(String sql, String[] params) {
        String newsql=sql;
        List data = this.getList(newsql, params);
        Category cate=new Category();
        cate.setData(data);
        return cate;
    }

    public Brand getBrand(String sql, String[] params) {
        String newsql=sql;
        List data = this.getList(newsql, params);
        Brand brand=new Brand();
        brand.setData(data);
        return brand;
    }
}
