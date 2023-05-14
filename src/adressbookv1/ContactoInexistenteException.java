package adressbookv1;


public class ContactoInexistenteException extends Exception{
    private String key;

    public ContactoInexistenteException(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Nenhum contato encontrado para a chave " + key;
    }
}
