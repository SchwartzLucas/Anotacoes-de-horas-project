package Clientes;
public class Clientes {
    private static int proximoID = 1;

    private int ID;
    private String NomeCliente;
    private String Telefone;

    public Clientes(String nomeCliente){
        this.ID = proximoID;
        proximoID++;
        this.NomeCliente = nomeCliente;
    }

    public Clientes(String nomeCliente, String telefone){
        this.ID = proximoID;
        proximoID++;
        this.NomeCliente = nomeCliente;
        this.Telefone = telefone;
    }


    
}
