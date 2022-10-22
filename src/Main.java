import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        var tesla = new Sedan(342, "Tesla", "Model 3", 3000.4);
        System.out.println(tesla);
        var bd1 = new BigDecimal("4.2535");
        var bd2 = new BigDecimal("-45.67");
        System.out.println(roundedHundredth(bd1));
        System.out.println(roundedTenthReversed(bd2));
    }

    public static double roundedHundredth(BigDecimal bigDecimal){
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double roundedTenthReversed(BigDecimal bigDecimal){
        return bigDecimal.setScale(1, RoundingMode.HALF_UP).doubleValue() * -1;
    }
}