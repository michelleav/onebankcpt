package nl.onebank.dto

import nl.onebank.onebankcpt.entity.Transfer
import java.util.*

data class TransferDto (val senderIBAN:String, val receiverIBAN:String, val amount:Double)
{
    fun toEntity(): Transfer {
        return Transfer(null, senderIBAN, receiverIBAN, amount, Date())
    }
}