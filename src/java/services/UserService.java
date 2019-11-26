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
        result = db.update(sql, new String[]{UsID, UsPwd, UsTel});
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

    public PageBean Pricelist(String Name1, String Name2, int curPage) {
        String sql = null;
        if (Name1 == null || Name1.equals("")) {
            if (Name2 == null || Name2.equals("")) {
                sql = "select * from updateprice order by NowDate desc";
                return db.getPageBean(sql, new String[]{}, curPage);
            } else {
                sql = "select * from updateprice where BuName like ? order by NowDate desc";
                return db.getPageBean(sql, new String[]{"%" + Name2 + "%"}, curPage);
            }
        } else {
            if (Name2 == null || Name2.equals("")) {
                sql = "select * from updateprice where HaName like ? order by NowDate desc";
                return db.getPageBean(sql, new String[]{"%" + Name1 + "%"}, curPage);
            } else {
                sql = "select * from updateprice where HaName like ? and BuName like ? order by NowDate desc";
                return db.getPageBean(sql, new String[]{"%" + Name1 + "%", "%" + Name2 + "%"}, curPage);
            }
        }
    }
    public PageBean Bulist(String Number, String Name, int curPage) {
        String sql = null;
        if (Number == null) {
            if (Name == null) {
                sql = "select * from businessman";
                return db.getPageBean(sql, new String[]{}, curPage);
            } else {
                sql = "select * from businessman where BuName like ?";
                return db.getPageBean(sql, new String[]{"%" + Name + "%"}, curPage);
            }
        }
        else{
            if (Name == null) {
                sql = "select * from businessman where BuNo like ?";
                return db.getPageBean(sql, new String[]{"%" + Number + "%"}, curPage);
            }
            else{
                sql = "select * from businessman where BuNo like ? and BuName like ?";
                return db.getPageBean(sql, new String[]{"%" + Number + "%","%" + Name + "%"}, curPage);
            }
        }
    }

    public PageBean Weeklist(int curPage, String HaNo) {
        String sql = "select * from updateprice where HaNo= ? and DATEDIFF(NowDate,now())<=0 AND DATEDIFF(NowDate,now())>-7 order by NowDate desc";
        return db.getPageBean(sql, new String[]{HaNo}, curPage);
    }
}
