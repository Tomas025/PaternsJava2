import CeilingFan.CeilingFan;
import CeilingFan.CeilingFanHighCommand;
import Command.ICommand;
import Command.MacroCommand;
import GarageDoor.GarageDoor;
import GarageDoor.GarageDoorUpCommand;
import Hottub.Hottub;
import Hottub.HottubCirculateCommand;
import Hottub.HottubJetsOnCommand;
import Light.Light;
import Light.LightOnCommand;
import SecurityControl.SecurityControl;
import SecurityControl.SecurityControlArmCommand;
import Sound.Sound;
import Sound.SoundSetCdCommand;
import Sound.SoundSetVolumeCommand;
import TV.TV;
import TV.TVOnCommand;
import TV.TVSetVolumeCommand;

public class App {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Hottub hottub = new Hottub();
        Light livingRoomLight = new Light();
        SecurityControl securityControl = new SecurityControl();
        Sound sound = new Sound();
        TV tv = new TV();

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        HottubJetsOnCommand hottubJetsOn = new HottubJetsOnCommand(hottub);
        HottubCirculateCommand hottubCirculate = new HottubCirculateCommand(hottub);
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        SecurityControlArmCommand securityControlArm = new SecurityControlArmCommand(securityControl);
        SoundSetCdCommand soundOnWithCD = new SoundSetCdCommand(sound);
        SoundSetVolumeCommand soundSetVolume100 = new SoundSetVolumeCommand(sound, 100);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVSetVolumeCommand tvSetVolume100 = new TVSetVolumeCommand(tv, 100);

        MacroCommand macroCommand = new MacroCommand(new ICommand[] { ceilingFanHigh, garageDoorUp, hottubJetsOn,
                hottubCirculate, lightOn, securityControlArm, soundOnWithCD, soundSetVolume100, tvOn, tvSetVolume100 });

        System.out.println("Executing commands...\n");
        remote.setCommand(macroCommand);
        remote.pressButton();

        System.out.println("\nRecovering after failure...\n");
        remote.load();
    }
}