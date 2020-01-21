package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }


    @Test
    public void returnsBenzoIfCucumber() throws Exception {
        assertThat(queryProcessor.process("cucumber"), is("benzo"));
    }

    @Test
    public void returnsBenzoIsADrug() throws Exception {
        assertThat(queryProcessor.process("benzo"), is("is a drug, whoops"));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void whatIsTest() throws Exception {
        assertThat(queryProcessor.process("what is 30 plus 20"), containsString("50"));
    }
}
