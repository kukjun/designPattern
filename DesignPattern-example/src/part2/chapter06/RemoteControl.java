package part2.chapter06;

import part2.chapter06.offer.Command;
import part2.chapter06.offer.NoCommand;

import java.util.Arrays;
import java.util.Stack;

public class RemoteControl {

  public Command[] onCommands;
  public Command[] offCommands;
  public Command undoCommand;
  public Stack<Command> history;

  public RemoteControl() {
    onCommands = new Command[7];
    offCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
    history = new Stack<>();

  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
    history.add(onCommands[slot]);
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
    history.add(offCommands[slot]);
  }

  public void undoButtonWasPushed() {
    undoCommand.undo();
  }

  public void historyButtonPushed() {
    history.pop().undo();
  }
  @Override
  public String toString() {
    return "RemoteControl{" +
        "onCommands=" + Arrays.toString(onCommands) +
        ", offCommands=" + Arrays.toString(offCommands) +
        ", undoCommand=" + undoCommand +
        '}';
  }


  public int getCommandLength() {
    return onCommands.length;
  }

}
