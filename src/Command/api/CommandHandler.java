package Command.api;

public interface CommandHandler<C extends Command, R> {
    R handle(C cmd);
}
