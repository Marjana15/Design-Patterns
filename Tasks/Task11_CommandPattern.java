interface FileSystemReceiver {
    void openFile();
    void writeFile();

}

class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening a file in Unix.");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing to a file in Unix.");
    }

}


interface Command {
    void execute();
}


class OpenFileCommand implements Command {
    private FileSystemReceiver receiver;

    public OpenFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.openFile();
    }
}


class WriteFileCommand implements Command {
    private FileSystemReceiver receiver;

    public WriteFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.writeFile();
    }
}


class FileInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

public class Task11_CommandPattern 
{
    public static void main(String[] args) {
        FileSystemReceiver receiver = new UnixFileSystemReceiver();

        Command openFile = new OpenFileCommand(receiver);
        Command writeFile = new WriteFileCommand(receiver);
    
        FileInvoker fileInvoker = new FileInvoker();

        fileInvoker.setCommand(openFile);
        fileInvoker.executeCommand();

        fileInvoker.setCommand(writeFile);
        fileInvoker.executeCommand();

    
    }
}
