package clean.code.Spring.Boot.model;

public class Transaction {
    private Long id;

    private Double amount;

    public Transaction(Double amount, String reason, Long userId) {
        this.amount = amount;
        this.reason = reason;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private String reason;
    private Long userId;
}
