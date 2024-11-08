package entities;

public class Distributor {
    private String operationState;
    private Double invoicing;

    public Distributor(String operationState, Double invoicing) {
        this.operationState = operationState;
        this.invoicing = invoicing;
    }
    
    public String getOperationState() {
        return operationState;
    }
    
    public Double getInvoicing() {
        return invoicing;
    }
    
    public void setOperationState(String operationState) {
        this.operationState = operationState;
    }
    
    public void setInvoicing(Double invoicing) {
        this.invoicing = invoicing;
    }

    @Override
    public String toString() {
        return "[" + operationState + " - R$" + invoicing + "]";
    }
}
