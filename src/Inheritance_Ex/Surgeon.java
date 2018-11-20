package Inheritance_Ex;

/**
 * @author Weichen Wang
 * @date 2018/10/31 - 下午12:11
 */
public class Surgeon extends Doctor {

    // Overrides the inherited treatPatient() method
    @Override
    public void treatPatient() {
        super.treatPatient();
        // perform surgery
    }

    // Add one new method
    public void makeIncison() {
        // make incision
    }
}
