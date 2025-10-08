package adv.kiraly.hml.worker.model;

public class WorkerModel {
    private String nome;
    
    public WorkerModel(String nome) {
        this.nome = nome;
    }

    public WorkerModel() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

}
