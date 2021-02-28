package Exceptii;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OperatiuniTest {

    @Test(expected = CuvantCautarePreaScurtException.class)
    public void cautareCuvantCu2Litere() throws CuvantCautarePreaScurtException {
        List<String> list = new ArrayList<String>();
        Operatiuni.searchWord(list, "aa");
    }

    @Test(expected = CuvantCautarePreaScurtException.class)
    public void cautareCuvantCu3Litere() throws CuvantCautarePreaScurtException {
        List<String> list = new ArrayList<String>();
        Operatiuni.searchWord(list, "aaa");
    }

    @Test
    public void cautareCuvantBun() throws CuvantCautarePreaScurtException {
        List<String> list = new ArrayList<String>();
        list.add("aaaa");
        String cuvant = Operatiuni.searchWord(list, "aaaa");
        Assert.assertEquals("bbb", cuvant);
    }
}