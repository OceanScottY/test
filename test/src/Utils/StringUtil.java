package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Scott
 * 2018-5-16
 */
public class StringUtil {

    public static String replaceBlank(String str){
        String dest = "";
        if(str != null){
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

    public static void main(String[] args) {
        String str = "{\"type\":\"22\",\"state\":\"0\",\"errormessage\":\"\",\"fs\":[{\"id\":\"99\",\"fs_name\":\"\",\"fs_type\":\"\",\"fs_error\":[{\"file_name\":\"/temp\",\"errorType\":\"panjue\",\"errorCode\":\"5\",\"time\":\"Sat May 12 17:36:22 2018\\n\",\"detail\":\"{\\n    \\\"func\\\": \\\"proxy_getattr\\\",\\n    \\\"path\\\": \\\"\\\\/dir1\\\",\\n    \\\"err_fs\\\": \\\"1\\\",\\n    \\\"error\\\": \\\"The majority does not exist\\\",\\n    \\\"errorType\\\": \\\"1\\\",\\n    \\\"errorCode\\\": \\\"0\\\",\\n    \\\"Timestamp\\\": \\\"Sat May 12 17:36:22 2018\\\\n\\\"\\n}\",\"repair\":\"1\",\"repair_fs\":\"100\",\"repair_file\":\"/temp\"}]}]}";
        System.out.println("原字符串是：");
        System.out.println(str);
        System.out.println("去除特殊字符后，字符串是：");
        str = str.replaceAll("\\r|\\n"," ");
        System.out.println(str);
    }

}
