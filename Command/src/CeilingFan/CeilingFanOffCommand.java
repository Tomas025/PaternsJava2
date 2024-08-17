package CeilingFan;

import java.io.FileWriter;
import java.io.IOException;

import Command.ICommand;

public class CeilingFanOffCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("CeilingFanOffCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}