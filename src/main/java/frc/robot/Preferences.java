package frc.robot;

import frc.utility.preferences.NomadDoublePreference;
import frc.utility.preferences.NomadPreference;

/**
 * The Preferences class provides a convenient place for us to hold robot-wide numerical or boolean
 * preferences.  This class should not be used for any other purpose.  All preferences should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Preferences {
    public static NomadDoublePreference drivekP = new NomadDoublePreference("drivekP", 0.1);
    
    public Preferences(){
        NomadPreference.usePreferences();
    }
}
