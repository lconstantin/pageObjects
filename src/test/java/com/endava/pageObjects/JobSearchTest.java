package com.endava.pageObjects;

import com.endava.pageObjects.pageObjects.JobDetailPage;
import com.endava.pageObjects.pageObjects.JobListPage;
import com.endava.pageObjects.pageObjects.Locations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by lconstantin on 8/1/2016.
 */
public class JobSearchTest extends TestBaseClass {
    @Test
    public void searchExistingSearch(){
        JobListPage jobListPage = homePage.searchJob("Testing", Locations.BUCHAREST);
       Integer totalJobsNumber = jobListPage.getTotalJobs();
        System.out.println("Total jobs: " + totalJobsNumber);
        assertTrue(totalJobsNumber > 0);

        Integer displayedJobs = jobListPage.getDisplayedJobsNumber();
        System.out.println("Displayed jobs: " + displayedJobs);
        assertEquals(new Integer(10), displayedJobs);

        JobDetailPage jobDetailPage = jobListPage.clickJob("Automation Tester (Java)");
        System.out.println("Total displays: " + jobDetailPage.getTotalView());
    }
}
