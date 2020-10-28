/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.wrappers.Limelight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Limelight unit test
 */
public class LimelightUnitTest {

    @Test
    public void testConstructors(){
        
        Limelight tester = new Limelight("name");

        assertEquals("X offset test", 0, tester.getXOffset(), 0.001);
        
    }
}
