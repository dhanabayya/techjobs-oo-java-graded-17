package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    public int id;
    Job job1=new Job();
    Job job2=new Job();
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        assertNotEquals(job1.getId(),job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.getName(),true);
        assertEquals(job.getEmployer().toString(),"ACME");
        assertEquals(job.getLocation().toString(),"Desert");
        assertEquals(job.getPositionType().toString(),"Quality control");
        assertEquals(job.getCoreCompetency().toString(),"Persistence");
    }
}
