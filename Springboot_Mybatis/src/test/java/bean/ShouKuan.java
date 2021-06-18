package bean;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 〈收款〉
 *
 * @author cql
 * @create 2021/3/9
 * @since 1.0.0
 */
@Data
public class ShouKuan {
    String info;
    BigDecimal amount;

    public ShouKuan(String info, BigDecimal amount) {
        this.info = info;
        this.amount = amount;
    }
}