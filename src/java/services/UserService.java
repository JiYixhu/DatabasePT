package services;

import Util.DBUtil;
import java.util.Map;

public class UserService {

    private DBUtil db = new DBUtil();

    public boolean checkLogin(String UserID, String UserPwd) {
        String sql = "select * from usertable where UserID = ? and UserPwd = ?";
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
}
