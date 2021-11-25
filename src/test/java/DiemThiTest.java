import org.junit.Assert;
import org.junit.Test;

public class DiemThiTest {

    @Test
    public void testcase1() {
        DiemThi diemThi = new DiemThi();
        String expected = "Đỗ";
        String actual = diemThi.ketQua(9, 9, 10);
        Assert.assertEquals(expected, actual);
    }
}
