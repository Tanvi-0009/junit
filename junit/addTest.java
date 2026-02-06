package junit;

import org.junit.Assert;
import org.junit.Test;

public class addTest {

    @Test
    public void test1forAdd() {
        add add_var = new add();

        Assert.assertEquals(7, add_var.addnumbers(4, 3));
        Assert.assertEquals(-7, add_var.addnumbers(-4, -3));
        Assert.assertEquals(201, add_var.addnumbers(201, 0));
    }
}