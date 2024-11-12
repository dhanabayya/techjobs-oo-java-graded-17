package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
   // public int id;
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
        assertEquals("Product tester",job.getName());
        assertEquals("ACME",job.getEmployer().toString());
        assertEquals("Desert",job.getLocation().toString());
        assertEquals("Quality control",job.getPositionType().toString());
        assertEquals("Persistence",job.getCoreCompetency().toString());
        assertTrue(job instanceof Job);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

    }
//    @Test
//    public void testToStringStartsAndEndsWithNewLine(){
//
//    }
}
