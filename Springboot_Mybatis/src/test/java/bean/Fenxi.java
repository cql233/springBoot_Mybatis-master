package bean;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 〈分析〉
 *
 * @author cql
 * @create 2021/3/9
 * @since 1.0.0
 */
@Data
public class Fenxi {
    String name;
    String allName;
    String time;
    BigDecimal dataAmount;
    BigDecimal ZhangDanAmount;
    BigDecimal ShouKuanAmount;
    BigDecimal resutlAmout;

    public Fenxi(String name, String allName, String time, BigDecimal dataAmount,
                 BigDecimal zhangDanAmount, BigDecimal shouKuanAmount,
                 BigDecimal resutlAmout) {
        this.name = name;
        this.allName = allName;
        this.time = time;
        this.dataAmount = dataAmount;
        ZhangDanAmount = zhangDanAmount;
        ShouKuanAmount = shouKuanAmount;
        this.resutlAmout = resutlAmout;
    }

}