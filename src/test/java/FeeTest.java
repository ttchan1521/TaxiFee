import org.junit.Assert;
import org.junit.Test;

public class FeeTest {
    @Test
    public void phanHoach1() {
        Assert.assertEquals(0, Fee.calculateFee(-1, true));
    }

    @Test
    public void phanHoach2() {
        Assert.assertEquals(14000, Fee.calculateFee(0.5, false));
    }

    @Test
    public void phanHoach3() {
        Assert.assertEquals(294264, Fee.calculateFee(20, true));
    }

    @Test
    public void phanHoach4() {
        Assert.assertEquals(421760, Fee.calculateFee(26, false));
    }

    @Test
    public void bang1() {
        Assert.assertEquals(0, Fee.calculateFee(-2, true));
    }

    @Test
    public void bang2() {
        Assert.assertEquals(12600, Fee.calculateFee(0.7, true));
    }

    @Test
    public void bang3() {
        Assert.assertEquals(308934, Fee.calculateFee(21, true));
    }

    @Test
    public void bang4() {
        Assert.assertEquals(391554, Fee.calculateFee(27, true));
    }

    @Test
    public void bang5() {
        Assert.assertEquals(0, Fee.calculateFee(-3, false));
    }

    @Test
    public void bang6() {
        Assert.assertEquals(14000, Fee.calculateFee(0.1, false));
    }

    @Test
    public void bang7() {
        Assert.assertEquals(245460, Fee.calculateFee(15, false));
    }

    @Test
    public void bang8() {
        Assert.assertEquals(474960, Fee.calculateFee(30, false));
    }
}
