package Model;

import java.util.Date;

public class SavingGoal {

    String desc, alias;
    double valor;
    Date data;

    public SavingGoal() {
    }

    public SavingGoal(String desc, double valor, Date data, String alias) {
        this.desc = desc;
        this.valor = valor;
        this.data = data;
        this.alias = alias;
    }
}
