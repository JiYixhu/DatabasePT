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

    public Map getByHaNoBuNo(String HaNo, String BuNo) {
        String sql = "select * from updateprice where HaNo = ? and BuNo = ?";
        return db.getMap(sql, new String[]{HaNo, BuNo});
    }

    public int updateinfo(Map parameters) {
        String HaNo = (String) parameters.get("HaNo");
        //String HaName(String) parameters.get("HaName");
        String BuNo = (String) parameters.get("BuNo");
        //String BuName(String) parameters.get("BuName");
        String NowPrice = (String) parameters.get("NowPrice");
        String sql = "update updateprice set NowPrice = ?, NowDate = now() where HaNo = ? and BuNo = ?";
        return db.update(sql, new String[]{NowPrice, HaNo, BuNo});
    }

    public int addinfo(Map parameters) {
        int result = 0;
        String HaNo = (String) parameters.get("HaNo");
        String HaName = (String) parameters.get("HaName");
        String BuNo = (String) parameters.get("BuNo");
        String BuName = (String) parameters.get("BuName");
        String NowPrice = (String) parameters.get("NowPrice");
        String sql = "insert into updateprice values(?,?,?,?,?,now())";
        result = db.update(sql, new String[]{HaNo, HaName, BuNo, BuName, NowPrice});
        return result;
    }
}
