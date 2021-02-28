package Exceptii;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {
    @Test
    public void testeazaAdunareNrPozitive() {
        int result = MarhUtils.sum(2, 4);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testeazaAdunareNrNegative() {
        int result = MarhUtils.sum(-2, -10);
        Assert.assertEquals(-12, result);
    }
    @Test
    public void testeazaScaderenrPozitive(){
        int result = MarhUtils.scadere(3,2);
        Assert.assertEquals(1, result);
    }
}
