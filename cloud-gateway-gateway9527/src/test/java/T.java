import java.time.ZonedDateTime;

/**
 * @author qfang
 * @date 2023/7/4 - 20:40
 */
public class T {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        // 2023-07-04T20:41:49.956+08:00[Asia/Shanghai]
    }
}
