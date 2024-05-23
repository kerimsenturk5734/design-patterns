package Command;

import Command.api.CommandExecutor;
import Command.impl.CreateUserCommand;

public class Run{
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();

        CreateUserCommand cmd = CreateUserCommand.builder()
                .id("123").email("asd@asd.com").name("Joe").surname("Doe").password("123").build();

        executor.setCommand(cmd);
        var r = executor.execute();
        System.out.println(r);
    }
}
