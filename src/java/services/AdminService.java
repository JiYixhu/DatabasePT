package services;

import Util.Brand;
import Util.Category;
import java.io.File;
import java.util.Map;
import Util.DBUtil;
import Util.PageBean;

public class AdminService {

    private DBUtil db = new DBUtil();

    //验证登录信息
    public boolean checkLogin(String MaID, String MaPwd) {
        String sql = "select * from manager where MaID = ? and MaPwd = ?";
        //String sql = "select * from manager where MaID='" + MaID + "' and MaPwd='" + MaPwd + "'";
        Map map = db.getMap(sql, new String[]{MaID, MaPwd});
        if (map == null) {
            return false;
        } else {
            return true;
        }
    }
//添加硬件信息

    public int add(Map file, Map parameters) {
        int result = 0;
        String HaNo = (String) parameters.get("HaNo");
        String HaName = (String) parameters.get("HaName");
        String HaCate = (String) parameters.get("HaCate");
        String HaBrand = (String) parameters.get("HaBrand");
        String HaPrice = (String) parameters.get("HaPrice");
        String HaPara = (String) parameters.get("HaPara");
        String HaPic = (String) file.get("HaPic");
        String sql = "insert into hardware values(?,?,?,?,?,?,?,now())";
        result = db.update(sql, new String[]{HaNo, HaName, HaCate, HaBrand, HaPrice, HaPara, HaPic});
        return result;
    }

    public Category SearchCate() {
        String sql = "select * from catagory";
        return db.getCategory(sql, new String[]{});
    }

    public Brand SearchBrand() {
        String sql = "select * from brand";
        return db.getBrand(sql, new String[]{});
    }

    public PageBean Halist(String cate, String brand, String name, int curPage) {
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

    public PageBean Calist(int curPage) {
        String sql = "select * from catagory";
        return db.getPageBean(sql, new String[]{}, curPage);
    }

    public PageBean Brlist(int curPage) {
        String sql = "select * from brand";
        return db.getPageBean(sql, new String[]{}, curPage);
    }

    public PageBean PriceList(int curPage, String HaNo) {
        String sql = "select * from updateprice where HaNo= ? order by NowDate desc";
        return db.getPageBean(sql, new String[]{HaNo}, curPage);
    }

    public Map getById(String HaNo) {
        String sql = "select * from hardware where HaNo = ?";
        return db.getMap(sql, new String[]{HaNo});
    }

    public int uploadHa(String realPath, Map file, Map parameters) {
        int result = 0;
        File f = new File(realPath);
        f.delete();
        String sql = "update files set fsize = ?, hits = ?, filePath = ?, fileName = ? where id = ?";
        result = db.update(sql, new String[]{(String) file.get("size"), "0", (String) file.get("filePath"), (String) file.get("fileName"), (String) parameters.get("id")});
        return result;
    }

    public int updateInfo(Map parameters) {
        String id = (String) parameters.get("id");
        String type = (String) parameters.get("type");
        String description = (String) parameters.get("description");
        String name = (String) parameters.get("name");
        String sql = "update files set instruction = ?, lastModified = now(), ftype = ?, detail = ? where id = ?";
        return db.update(sql, new String[]{name, type, description, id});
    }

    public int deleteHa(Map parameters) {
        String HaNo = (String) parameters.get("HaNo");
        String sql = "delete from hardware where HaNo = ?";
        return db.update(sql, new String[]{HaNo});
    }

    public int addBrand(Map parameters) {
        String HaBrandNo = (String) parameters.get("HaBrandNo");
        String HaBrand = (String) parameters.get("HaBrand");
        String sql = "insert into brand values(?,?)";
        return db.update(sql, new String[]{HaBrandNo, HaBrand});
    }

    public int addCate(Map parameters) {
        String HaCateNo = (String) parameters.get("HaCateNo");
        String HaCate = (String) parameters.get("HaCate");
        String sql = "insert into catagory values(?,?)";
        return db.update(sql, new String[]{HaCateNo, HaCate});
    }

    public int deleteBrand(Map parameters) {
        String HaBrandNo = (String) parameters.get("HaBrandNo");
        String sql = "delete from brand where HaBrandNo = ?";
        return db.update(sql, new String[]{HaBrandNo});
    }

    public int deleteCate(Map parameters) {
        String HaCateNo = (String) parameters.get("HaCateNo");
        String sql = "delete from catagory where HaCateNo = ?";
        return db.update(sql, new String[]{HaCateNo});
    }
}
