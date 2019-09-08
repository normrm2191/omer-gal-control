/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class PID_Parameters {

    private double K_P;
    private double K_I;
    private double K_D;
    private double K_F;
    private double AFF;

    public PID_Parameters(double k_p, double k_i, double k_d, double k_f, double aff) {
    K_P = k_p;
    K_I = k_i;
    K_D = k_d;
    K_F = k_f;
    AFF = aff;
    }

    public void Set_KP(double k_p) {
        K_P = k_p;
    }
    public void Set_KI(double k_i) {
        K_I = k_i;
    }
    public void Set_KD(double k_d) {
        K_D = k_d;
    }
    public void Set_KF(double k_f) {
        K_F = k_f;
    }
    public void Set_AFF(double aff) {
        AFF = aff;
    }

    public double Get_KP() {
        return K_P;
    }
    public double Get_KI() {
        return K_I;
    }
    public double Get_KD() {
        return K_D;
    }
    public double Get_KF() {
        return K_F;
    }
    public double Get_AFF() {
        return AFF;
    }
}
