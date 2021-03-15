package Singleton;

public class SingletonID {
    private static SingletonID instance;

    public synchronized static SingletonID getInstance() {
        if (instance == null) {
            instance = new SingletonID();
        }
        return instance;
    }

    private int numero = loadNumber();

    private SingletonID() {
    }

    public synchronized int getNextSerial() {
        int novoNumero = ++numero;
        Files file = new Files();
        file.writefile(Integer.toString(novoNumero));
        return novoNumero;
    }

    private synchronized int loadNumber() {
        Files file = new Files();
        Integer numero = 1;
        try {
            numero = Integer.parseInt(file.readfile());
        } catch (Exception e) {
            file.createfile();
            file.writefile(Integer.toString(numero));
        }
        return numero;
    }

}
