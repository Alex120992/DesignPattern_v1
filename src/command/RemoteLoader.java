package command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light lightInRoom = new Light();
        Tv onOrOffTV = new Tv();

        TVonWithChannel tVonWithChannel = new TVonWithChannel(onOrOffTV);
        TVoffWithChannel tVoffWithChannel = new TVoffWithChannel(onOrOffTV);

        LightOffCommand lightOffCommand = new LightOffCommand(lightInRoom);
        LightOnCommand lightOnCommand = new LightOnCommand(lightInRoom);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, tVonWithChannel,tVoffWithChannel);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
    }
}
