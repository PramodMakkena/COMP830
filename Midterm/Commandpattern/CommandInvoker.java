package commandpattern;

import java.util.Arrays;
import java.util.Stack;

public class CommandInvoker {
	private Stack<CommandInterface> cmd = new Stack<CommandInterface>();
	
	public void execute() {
		if(!cmd.isEmpty()) {
			cmd.peek().execute();
		}
	}
	
	public void undo() {
		if(!cmd.isEmpty()){
			cmd.peek().undo();
			cmd.pop();
		}
	}
	
	public void setCommand(CommandInterface c) {
		cmd.push(c);
	}
}