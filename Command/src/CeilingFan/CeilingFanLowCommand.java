package CeilingFan;

import java.io.FileWriter;
import java.io.IOException;

import Command.ICommand;

public class CeilingFanLowCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.low();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("CeilingFanLowCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}