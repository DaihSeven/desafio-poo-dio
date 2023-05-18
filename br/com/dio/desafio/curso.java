package br.com.dio.desafio;

public class curso {
   private String titulo;
   private String descricao;
   private int cargaHoraria;

    public curso() {

    }
   public String getTitulo() {
       return titulo;
   }
   public void setTitulo(String titulo) {
       this.titulo = titulo;
   }
   
   public String getDescricao() {
    return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

public int getCargaHoraria() {
    return cargaHoraria;
}
public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
}
@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}
    
}
