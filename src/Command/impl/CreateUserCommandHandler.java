package Command.impl;

import Command.api.CommandHandler;

public class CreateUserCommandHandler implements CommandHandler<CreateUserCommand, Void> {

    @Override
    public Void handle(CreateUserCommand cmd) {
        System.out.println(cmd);
        System.out.println("CreateUserCommand handled");
        return null;
    }
}
