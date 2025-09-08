package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        LightOnCommand lightOn = new LightOnCommand(new Light());

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
