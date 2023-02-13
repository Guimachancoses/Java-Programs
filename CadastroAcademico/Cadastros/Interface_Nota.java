package CadastroAcademico.Cadastros;

public interface Interface_Nota {
    
    public void CadastraNota(int mat);
    
    public void ConsultaNota();
    
    public boolean EditaNota(String matricula);
    
    public boolean ExcluiNota(String matricula);
 }