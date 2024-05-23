package Command.impl;

import Command.api.Command;
import Command.api.CommandHandler;

public class CreateUserCommand implements Command {

    private String id;
    private String name;
    private String surname;
    private String password;
    private String email;

    private CreateUserCommand(String id, String name, String surname, String password, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format(
                "id:%s, name:%s, surname:%s, password:%s, email:%s",
                id, name, surname, password, email
        );
    }

    @Override
    public CommandHandler<CreateUserCommand, Void> getCommandHandler() {
        return new CreateUserCommandHandler();
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private String id;
        private String name;
        private String surname;
        private String password;
        private String email;

        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder password(String password){
            this.password = password;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public CreateUserCommand build(){
            return new CreateUserCommand(id, name, surname, password, email);
        }
    }
}
