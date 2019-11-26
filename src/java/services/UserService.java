package services;

import Util.Brand;
import Util.Category;
import Util.DBUtil;
import Util.PageBean;
import java.util.Map;

public class UserService {

    private DBUtil db = new DBUtil();

    public boolean checkLogin(String UserID, String UserPwd) {
        String sql = "select * from usertable where UsID = ? and UsPwd = ?";
        Map map = db.getMap(sql, new String[]{UserID, UserPwd});
        if (map == null) {
            return false;
        } else {
            return true;
        }
    }

    public int register(Map parameters) {
        int result = 0;
        String UsID = (String) parameters.get("username");
        String UsPwd = (String) parameters.get("pwd2");
        String UsTel = (String) parameters.get("tel");
        String sql = "insert into usertable values(?,?,?)";
        result = db.update(sql, new String[]{ UsID, UsPwd, UsTel});
        return result;
    }

    public Map getById(String HaNo) {
        String sql = "select * from hardware where HaNo = ?";
        return db.getMap(sql, new String[]{HaNo});
    }

     public Category SearchCate() {
        String sql = "select * from catagory";
        return db.getCategory(sql, new String[]{});
    }

    public Brand SearchBrand() {
        String sql = "select * from brand";
        return db.getBrand(sql, new String[]{});
    }

    public PageBean Searchlist(String cate, String brand, String name, int curPage) {
        String sql = null;
        if (cate == null || cate.equals("")) {//类别为空
            if (brand == null || brand.equals("")) {//品牌也为空
                if (name == null || name.equals("")) {//关键字也为空
                    sql = "select * from hardware";
                    return db.getPageBean(sql, new String[]{}, curPage);
                } else {   //关键字不为空
                    sql = "select * from hardware where HaName like ?";
                    return db.getPageBean(sql, new String[]{"%" + name + "%"}, curPage);
                }
            } else {    //品牌不为空
                if (name == null || name.equals("")) {//关键字为空
                    sql = "select * from hardware where HaBrand = ?";
                    return db.getPageBean(sql, new String[]{brand}, curPage);
                } else {   //关键字不为空
                    sql = "select * from hardware where HaBrand = ? and HaName like ?";
                    return db.getPageBean(sql, new String[]{brand, "%" + name + "%"}, curPage);
                }
            }
        } else if (brand == null || brand.equals("")) {//类别不为空，品牌为空
            if (name == null || name.equals("")) {  //关键字为空
                sql = "select * from hardware where HaCate = ?";
                return db.getPageBean(sql, new String[]{cate}, curPage);
            } else {    //关键字不为空
                sql = "select * from hardware where HaCate = ? and HaName like ?";
                return db.getPageBean(sql, new String[]{cate, "%" + name + "%"}, curPage);
            }
        } else {                           //类别品牌都不为空
            if (name == null || name.equals("")) {//关键字为空
                sql = "select * from hardware where HaCate = ? and HaBrand = ?";
                return db.getPageBean(sql, new String[]{cate, brand}, curPage);
            } else {    //关键字不为空
                sql = "select * from hardware where HaCate = ? and HaBrand = ? and HaName like ?";
                return db.getPageBean(sql, new String[]{cate, brand, "%" + name + "%"}, curPage);
            }
        }
    }
}
