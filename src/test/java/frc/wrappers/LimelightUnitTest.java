/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.wrappers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Add your docs here.
 */
public class LimelightUnitTest {

    @Test
    public void test1(){
        Limelight tester = new Limelight();

        assertEquals(0, tester.getXOffset(), "assertion");
    }
}
