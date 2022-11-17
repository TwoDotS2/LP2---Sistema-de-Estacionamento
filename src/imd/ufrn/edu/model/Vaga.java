package imd.ufrn.edu.model;

import java.util.UUID;

public class Vaga {

    private static UUID uuid;
    private String id;

    private Veiculo veiculo;


    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }


}
