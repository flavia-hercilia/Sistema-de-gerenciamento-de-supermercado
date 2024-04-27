// Implementação do Repositório de Funcionários

// import java.util.Dictionary;
// import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

public class RepositorioArrayFuncionarios implements IRepositorioFuncionarios {
    
    public Map<String, Funcionario> funcionarios;

    public RepositorioArrayFuncionarios() {
        this.funcionarios = new HashMap<>();
    }

    @Override
    public void inserir(Funcionario funcionario) {
        funcionarios.put(funcionario.getCPF(), funcionario);
    }

    @Override
    public boolean buscarPorCPF(String cpfConsulta) {
        if(cpfConsulta.length() != 11 || funcionarios.containsKey(cpfConsulta) == false){
            return false;
        }else{

            return true;
        }
    }

    @Override
    public void remover(String cpf) {
        funcionarios.remove(cpf);
    }
}