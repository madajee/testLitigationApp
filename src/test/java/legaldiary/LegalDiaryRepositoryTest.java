package legalDiary;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class LegalDiaryRepositoryTest {

	@Autowired
    LegalDiaryRepository  repository;

   @Test
    public void testLegalDiary() {
    	LegalDiary legalDiary = new LegalDiary();
    	legalDiary.setCaseDesc("Test Case Desc");
    	
    	assertNull(legalDiary.getCaseID());
    	legalDiary =  repository.save(legalDiary);
 
        assertNotNull(legalDiary.getCaseID());
        //assertEquals(todo.getTitle(), "title1");
        //assertTrue(todo.getId() > 0);
    }

}