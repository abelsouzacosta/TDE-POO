package domain.entities;

import java.util.Date;

public class Loan {
    private CollectionItem item; // This can represent either a Book or a Movie
    private String cpf;   // CPF of the person taking the loan
    private Date loanDate;

    public Loan(CollectionItem item, String cpf, Date loanDate) {
        this.item = item;
        this.cpf = cpf;
        this.loanDate = loanDate;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(CollectionItem item) {
        this.item = item;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
}