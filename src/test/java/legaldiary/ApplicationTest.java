package legalDiary;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.junit.Test;
import org.junit.Assert;

import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ApplicationTest {

	@Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testContext() {
        Assert.assertNotNull(applicationContext);
    }

}