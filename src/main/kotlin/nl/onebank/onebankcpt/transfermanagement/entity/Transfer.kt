package nl.onebank.onebankcpt.accountmanagement.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
data class Transfer (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var senderIBAN: String,
        var receiverIBAN: String,
        var amount: Double,
        var creationDate: Date,
){}