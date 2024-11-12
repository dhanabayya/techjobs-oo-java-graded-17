package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    // public int id;
    Job job1 = new Job();
    Job job2 = new Job();

    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
        assertTrue(job instanceof Job);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(true, job.toString().startsWith(System.lineSeparator()));
        assertEquals(true, job.toString().endsWith(System.lineSeparator()));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true, job.toString().contains("ID: "));
        assertEquals(true, job.toString().contains("Name: "));
        assertEquals(true, job.toString().contains("Employer: "));
        assertEquals(true, job.toString().contains("Location: "));
        assertEquals(true, job.toString().contains("Position Type: "));
        assertEquals(true, job.toString().contains("Core Competency: "));
        assertEquals(true, job.toString().contains("" + job.getId()));
        assertEquals(true, job.toString().contains(job.getName()));
        assertEquals(true, job.toString().contains(job.getEmployer().getValue()));
        assertEquals(true, job.toString().contains(job.getLocation().getValue()));
        assertEquals(true, job.toString().contains(job.getPositionType().getValue()));
        assertEquals(true, job.toString().contains(job.getCoreCompetency().getValue()));
    }

    @Test
    public void testToStringHandlesEmptyField() {

    }
}
