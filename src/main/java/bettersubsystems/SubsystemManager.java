package bettersubsystems;

import java.util.ArrayList;

import bettersubsystems.subsystems.BaseSubsystem;

public class SubsystemManager{

    private ArrayList<BaseSubsystem> looperSubsystems;


    public SubsystemManager(){}


    public void addSubsystem(BaseSubsystem baseSubsystem){
        looperSubsystems.add(baseSubsystem);    
    }
    

    
}