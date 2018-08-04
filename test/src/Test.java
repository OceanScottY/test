import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args){
        Random r = new Random();
//        System.out.println(r.nextInt(5));
//1525487620246
//1525487702141
//1525487757163

//        System.out.println(new Date().getTime());
//
//        System.out.println(new Date().getTime()/(1000*60*60*24*365));
      /*  Logger logger  = LoggerFactory.getLogger("log4j.appender.stdout");

        logger.info("This is a info test");
        logger.warn("This is a warn test");
        logger.error("This is a error test");
        logger.debug("This is a debug test");*/

      /*  List<Entry> list = new ArrayList<Entry>();
        list.add(new Entry("id","1"));
        list.add(new Entry("type", "2"));
        System.out.println(list.toString());*/

        String str = "{\"type\":\"22\",\"state\":\"0\",\"errormessage\":\"\",\"fs\":[{\"id\":\"99\",\"fs_name\":\"\",\"fs_type\":\"\",\"fs_error\":[{\"file_name\":\"/temp\",\"errorType\":\"panjue\",\"errorCode\":\"5\",\"time\":\"Sat May 12 17:36:22 2018\\n\",\"detail\":\"{\\n    \\\"func\\\": \\\"proxy_getattr\\\",\\n    \\\"path\\\": \\\"\\\\/dir1\\\",\\n    \\\"err_fs\\\": \\\"1\\\",\\n    \\\"error\\\": \\\"The majority does not exist\\\",\\n    \\\"errorType\\\": \\\"1\\\",\\n    \\\"errorCode\\\": \\\"0\\\",\\n    \\\"Timestamp\\\": \\\"Sat May 12 17:36:22 2018\\\\n\\\"\\n}\",\"repair\":\"1\",\"repair_fs\":\"100\",\"repair_file\":\"/temp\"}]}]}";
        System.out.println(str);


    }
}
