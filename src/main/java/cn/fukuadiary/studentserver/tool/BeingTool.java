package cn.fukuadiary.studentserver.tool;

/**
 * @ClassName BeingTool
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/5
 * @Version 1.0
 **/
public class BeingTool{


    // by Integer
    public static Boolean isZeroToInteger(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return true;
            }
        }
        return false;
    }

    //by String
    public static Boolean isEmptyToString(String... strs) {
        for (int i = 0; i < strs.length; i++) {
            if ("".equals(strs[i]) || strs[i] == null) {
                return true;
            }
        }
        return false;
    }
}
