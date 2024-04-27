// Interface para Repositório de Funcionários
public interface IRepositorioFuncionarios {
    void inserir(Funcionario funcionario);
    void remover(String cpf);
    
    boolean buscarPorCPF(String cpfConsulta);
    
}