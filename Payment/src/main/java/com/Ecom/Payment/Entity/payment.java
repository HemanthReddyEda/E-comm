package com.Ecom.Payment.Entity;

import com.Ecom.Payment.config.Ordermodel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
@Entity
@Table(name="payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class payment {
    public Long amount;
    public String payment_method;
    public String payment_status;
    public String acc_no;
    public String ifsc_code;
    @Id
    public int transaction_id;
    public LocalTime payment_time;

    @PrePersist
    protected void onCreate() {
        if (payment_status == null) {
            payment_status = "pending";
        }
        if (payment_time == null) {
            payment_time = LocalTime.now();
        }
    }

    public void generateId() {
        if (this.transaction_id == 0) {
            this.transaction_id = Ordermodel.generateNumericID();
        }
    }
}
