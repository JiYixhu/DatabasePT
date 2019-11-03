package services;

import Util.DBUtil;
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
        result = db.update(sql, new String[]{HaNo, HaName, BuNo,BuName,NowPrice});
        return result;
    }
}
