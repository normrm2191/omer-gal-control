/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Add your docs here.
 */
public class GroupOfMotors {

    private TalonSRX[] talons;
    private PID_Parameters pid_parameters;

    //first port import must be the lead import
    public GroupOfMotors(String name, PID_Parameters parameters, int... ports) {
        pid_parameters = parameters;
        talons[0] = new TalonSRX(ports[0]);
        for (int i = 1; i < ports.length; i++) {
            talons[i] = new TalonSRX(ports[i]);
            talons[i].follow(talons[0]);
        }
        talons[0].config_kP(0, parameters.Get_KP());
        talons[0].config_kI(0, parameters.Get_KI());
        talons[0].config_kD(0, parameters.Get_KD());
        talons[0].config_kF(0, parameters.Get_KF());
    }

    public void SetVelocity(double value) {
        double get_AFF = pid_parameters.Get_AFF();
        talons[0].set(ControlMode.Velocity, value, get_AFF);
    }

    public void SetPower(double value){
        double get_AFF = pid_parameters.Get_AFF();
        talons[0].set(ControlMode.PercentOutput, value, get_AFF);
    }

    public void SetPIDParameters(double K_P, double K_I, double K_D, double K_F, double AFF){
        pid_parameters.Set_KP(K_P);
        pid_parameters.Set_KP(K_I);
        pid_parameters.Set_KP(K_D);
        pid_parameters.Set_KP(K_F);
        pid_parameters.Set_AFF(AFF);
    }

    public void Set_KP(double k_p) {
        pid_parameters.Set_KP(k_p);
    }
    public void Set_KI(double k_i) {
        pid_parameters.Set_KI(k_i);
    }
    public void Set_KD(double k_d) {
        pid_parameters.Set_KD(k_d);
    }
    public void Set_KF(double k_f) {
        pid_parameters.Set_KF(k_f);
    }
    public void Set_AFF(double aff) {
        pid_parameters.Set_AFF(aff);
    }

    public PID_Parameters GetPIDParameters(){
        return pid_parameters;
    }

    public double Get_KP() {
        return pid_parameters.Get_KP();
    }
    public double Get_KI() {
        return pid_parameters.Get_KI();
    }
    public double Get_KD() {
        return pid_parameters.Get_KD();
    }
    public double Get_KF() {
        return pid_parameters.Get_KF();
    }
    public double Get_AFF() {
        return pid_parameters.Get_AFF();
    }
}
