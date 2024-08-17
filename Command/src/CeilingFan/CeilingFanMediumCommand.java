package CeilingFan;

import java.io.FileWriter;
import java.io.IOException;

import Command.ICommand;

public class CeilingFanMediumCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("CeilingFanMediumCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}