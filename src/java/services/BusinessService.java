package services;

import Util.Brand;
import Util.Category;
import Util.DBUtil;
import Util.PageBean;
import java.util.Map;

public class BusinessService {

    private DBUtil db = new DBUtil();

    public boolean checkLogin(String BuID, String BuPwd) {
        String sql = "select * from businessman where BuID = ? and BuPwd = ?";
        Map map = db.getMap(sql, new String[]{BuID, BuPwd});
        if (map == null) {
            return false;
        } else {
            return true;
        }
    }

     public boolean checkLogin2(String BuNo, String BuPwd) {
        String sql = "select * from businessman where BuNo = ? and BuPwd = ?";
        Map map = db.getMap(sql, new String[]{BuNo, BuPwd});
        if (map == null) {
            return false;
        } else {
            return true;
        }
    }
     
    public PageBean Pricelist(String Name1, String Name2, int curPage) {
        String sql = null;
        if (Name1 == null || Name1.equals("")) {
            if (Name2 == null || Name2.equals("")) {
                sql = "select * from updateprice order by NowDate desc";
                return db.getPageBean(sql, new String[]{}, curPage);
            }
            else{
                sql = "select * from updateprice where BuName like ? order by NowDate desc";
                return db.getPageBean(sql, new String[]{"%" + Name2 + "%"}, curPage);
            }
        }
        else{
            if (Name2 == null || Name2.equals("")) {
                sql = "select * from updateprice where HaName like ? order by NowDate desc";
                return db.getPageBean(sql, new String[]{"%" + Name1 + "%"}, curPage);
            }
            else{
                sql = "select * from updateprice where HaName like ? and BuName like ? order by NowDate desc";
                return db.getPageBean(sql, new String[]{"%" + Name1 + "%","%" + Name2 + "%"}, curPage);
            }
        }
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

    public Map getById(String HaNo) {
        String sql = "select * from hardware where HaNo = ?";
        return db.getMap(sql, new String[]{HaNo});
    }
    
    public int add(Map parameters) {
        int result = 0;
        String THaNo = (String) parameters.get("THaNo");
        String THaName = (String) parameters.get("THaName");
        String TBuNo = (String) parameters.get("TBuNo");
        String TBuName = (String) parameters.get("TBuName");
        Double TNowPrice = (Double) parameters.get("TNowPrice");
        String sql = "insert into updateprice values(?,?,?,?,?,now())";
        result = db.updateprice(sql,THaNo,THaName,TBuNo,TBuName,TNowPrice);
        return result;
    }
}
