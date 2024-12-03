package com.softuni.exercise.billsPaymentSystem.entities;

import com.softuni.exercise.billsPaymentSystem.enums.CardType;
import jakarta.persistence.*;

@Entity
@Table(name = "credit_cards")
public class CreditCard extends BillingDetail {
    private CardType cardType;
    private Integer expirationMonth;
    private Integer expirationYear;

    public CreditCard() {}

    @Enumerated(value = EnumType.STRING)
    @Column(name = "credit_card_type", nullable = false)
    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }


    @Column(name = "expiration_month", nullable = false)
    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    @Column(name = "expiration_year", nullable = false)
    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }
}
