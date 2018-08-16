import com.company.NumberUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestNumberUtils {

    @Test
    public void testFiveMultipleOfFive() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.multipleOfFive(5));
    }
    @Test
    public void testFiveNotMultipleOfThree() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertFalse(NUtils.multipleOfThree(5));
    }
    @Test
    public void testThreeMultipleOfThree() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.multipleOfThree(3));
    }
    @Test
    public void testThreeNotMultipleOfFive() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertFalse(NUtils.multipleOfFive(3));
    }
    @Test
    public void testFifteenMultipleOfFiveAndThree() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.multipleOfFiveAndThree(15));
    }
    @Test
    public void testFifteenMultipleOfFive() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.multipleOfFive(15));
    }
    @Test
    public void testFifteenMultipleOfThree() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.multipleOfThree(15));
    }
    @Test
    public void testOneNotMultipleOfFive() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertFalse(NUtils.multipleOfFive(1));
    }
    @Test
    public void testOneNotMultipleOfThree() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertFalse(NUtils.multipleOfThree(1));
    }
    @Test
    public void testOneNotMultipleOfFiveAndThree() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertFalse(NUtils.multipleOfFiveAndThree(1));
    }
    @Test
    public void testMultipleOfThreeIsLinio() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.getConvertedString(3).equals("Linio"));
    }
    @Test
    public void testMultipleOfFiveIsIT() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.getConvertedString(5).equals("IT"));
    }
    @Test
    public void testMultipleOfFiveAndThreeIsLinianos() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.getConvertedString(15).equals("Linianos"));
    }
    @Test
    public void testNotMultipleOfFiveOrThreeIsNumber() {
        NumberUtils NUtils = new NumberUtils();
        Assert.assertTrue(NUtils.getConvertedString(1).equals("1"));
    }
}