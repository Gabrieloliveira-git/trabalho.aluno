package facvest.aluno;

public class aluno {
	
			
				    private String nome;
				    private String matricula;
				    private String sexo;
				    private String dataNascimento;
				    private String curso;
				    private int anoInicio;
				    private double notaProva1;
				    private double notaProva2;
				    private double mediaTrabalhos;
				    
				    public String getNome() {
				        return nome;
				    }

				    public void setNome(String nome) {
				        this.nome = nome;
				    }

				    public String getMatricula() {
				        return matricula;
				    }

				    public void setMatricula(String matricula) {
				        this.matricula = matricula;
				    }

				    public String getSexo() {
				        return sexo;
				    }

				    public void setSexo(String sexo) {
				        this.sexo = sexo;
				    }

				    public String getDataNascimento() {
				        return dataNascimento;
				    }

				    public void setDataNascimento(String dataNascimento) {
				        this.dataNascimento = dataNascimento;
				    }

				    public String getCurso() {
				        return curso;
				    }

				    public void setCurso(String curso) {
				        this.curso = curso;
				    }

				    public int getAnoInicio() {
				        return anoInicio;
				    }

				    public void setAnoInicio(int anoInicio) {
				        this.anoInicio = anoInicio;
				    }

				    public double getNotaProva1() {
				        return notaProva1;
				    }

				    public void setNotaProva1(double notaProva1) {
				        this.notaProva1 = notaProva1;
				    }

				    public double getNotaProva2() {
				        return notaProva2;
				    }

				    public void setNotaProva2(double notaProva2) {
				        this.notaProva2 = notaProva2;
				    }

				    public double getMediaTrabalhos() {
				        return mediaTrabalhos;
				    }

				    public void setMediaTrabalhos(double mediaTrabalhos) {
				        this.mediaTrabalhos = mediaTrabalhos;
				    }

				   
				    public boolean estaAprovado() {
				       
				        double somaNotas = notaProva1 + notaProva2 + mediaTrabalhos;
				        
				        double mediaFinal = somaNotas / 3;

				      
				        return mediaFinal >= 6;
				    }
				    
				    public double calcularMedia() {
				        
				        double somaNotas = notaProva1 + notaProva2 + mediaTrabalhos;
				       
				        double mediaFinal = somaNotas / 3;

				        return mediaFinal;
				    }			
				    }	    
