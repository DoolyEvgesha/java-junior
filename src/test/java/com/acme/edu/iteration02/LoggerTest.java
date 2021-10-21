package com.acme.edu.iteration02;

import com.acme.edu.Logger;
import com.acme.edu.controller.ComplexController;
import com.acme.edu.dto.StatesDTO;
import com.acme.edu.SysoutCaptureAndAssertionAbility;
import com.acme.edu.flush.Flusher;
import com.acme.edu.message.ByteMessage;
import com.acme.edu.message.IntMessage;
import com.acme.edu.message.StringMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class LoggerTest implements SysoutCaptureAndAssertionAbility {
    private final ComplexController controller;

    public LoggerTest() {
        this.controller = new ComplexController();
    }

    //region given
    @Before
    public void setUpSystemOut() throws IOException {
        resetOut();
        captureSysout();
    }

    @After
    public void tearDown() {
        resetOut();
    }
    //endregion

    @Test
    public void shouldLogSequentIntegersAsSum() throws IOException {
        //region when
        controller.perform("str 1", 1, 2, "str 2", 0);
        //endregion

        //region then
        checkLog("str 1", "3", "str 2", "0");
        //endregion
    }

    @Test
    public void shouldLogCorrectlyIntegerOverflowWhenSequentIntegers() throws IOException {
        //region when
        controller.perform("str 1", 10, Integer.MAX_VALUE, "str 2", 0);
        //endregion

        //region then
        checkLog("str 1", Integer.toString(Integer.MAX_VALUE), "10", "str 2", "0");
        //endregion
    }

    @Test
    public void shouldLogCorrectlyByteOverflowWhenSequentBytes() throws IOException {
        //region when
        controller.perform("str 1", (byte) 10, Byte.MAX_VALUE, "str 2", 0);
        //endregion

        //region then
        checkLog("str 1", Byte.toString(Byte.MAX_VALUE), "10", "str 2", "0");
        //endregion
    }

    @Test
    public void shouldLogSameSubsequentStringsWithoutRepeat() throws IOException {
        //region when
        controller.perform("str 1", "str 2", "str 2", 0, "str 2", "str 3", "str 3", "str 3");
        //endregion

        //region then
        checkLog("str 1", "str 2 (x2)", "0", "str 2", "str 3 (x3)");
        //endregion
    }

    private void checkLog(String... valuesToCheck) {
        for (String valueToCheck : valuesToCheck) {
            assertSysoutContains(valueToCheck);
        }
    }
}