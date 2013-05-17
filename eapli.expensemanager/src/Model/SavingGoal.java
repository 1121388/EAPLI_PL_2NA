package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class SavingGoal implements Serializable {

    @Id
    String descricao; 
    String Aalias;
    double valor;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date Ddata;

    public SavingGoal(String desc, double valor, Date data, String alias) {
        this.descricao = desc;
        this.valor = valor;
        this.Ddata = data;
        this.Aalias = alias;
    }

    public SavingGoal() {
    }
}
