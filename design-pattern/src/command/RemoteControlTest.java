package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(new LightOnCommand(new Light()));
        remote.buttonWasPressed();

        remote.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
        remote.buttonWasPressed();
    }
}
