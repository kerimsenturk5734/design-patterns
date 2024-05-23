package Command.api;

import java.util.logging.Logger;

public class CommandExecutor {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    private Command  command;

    public CommandExecutor(){}

    public CommandExecutor(Command command) {this.command = command;}

    public Command getCommand() {return command;}

    public void setCommand(Command command) {this.command = command;}

    public Object execute(){
        if(command != null){
            var handler = this.getCommand().getCommandHandler();
            return handler.handle(command);
        }
        logger.warning("No command executed because command is null");

        return null;
    }
}
