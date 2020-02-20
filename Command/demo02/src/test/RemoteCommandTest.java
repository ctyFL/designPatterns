package test;

import command.Command;
import command.FanOffCommand;
import command.FanOnCommand;
import command.FanSpeedHighCommand;
import command.FanSpeedLowCommand;
import command.FanSpeedMediumCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import invoker.RemoteControlWithUndo;
import receiver.Fan;
import receiver.Light;
import receiver.LivingRoomFan;
import receiver.LivingRoomLight;

public class RemoteCommandTest {

	public static void main(String[] args) {
		Light light = new LivingRoomLight();
		Fan fan = new LivingRoomFan();
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		Command fanOn = new FanOnCommand(fan);
		Command fanOff = new FanOffCommand(fan);
		Command fanHigh = new FanSpeedHighCommand(fan);
		Command fanMedium = new FanSpeedMediumCommand(fan);
		Command fanLow = new FanSpeedLowCommand(fan);
		
		RemoteControlWithUndo remote = new RemoteControlWithUndo();
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, fanOn, fanOff);
		remote.setGearCommand(0, fanLow);
		remote.setGearCommand(1, fanMedium);
		remote.setGearCommand(2, fanHigh);
		
		remote.pressButtonOn(0);
		remote.pressButtonOff(0);
		remote.pressButtonUndo();
		
		System.out.println("");
		
		remote.pressButtonOn(1);
		remote.pressButtonOff(1);
		remote.pressButtonGear(2);
		remote.pressButtonUndo();
		remote.pressButtonGear(0);
		remote.pressButtonGear(1);
		remote.pressButtonUndo();
	}
	
}
