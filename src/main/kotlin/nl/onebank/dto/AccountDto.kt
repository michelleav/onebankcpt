package nl.onebank.dto

import nl.onebank.onebankcpt.accountmanagement.entity.Account
import nl.onebank.onebankcpt.accountmanagement.entity.Transfer
import java.util.*

class AccountDto (var firstName: String, var lastName: String, var address: String,
                  var IBAN: String, var currency: String, var balance: Double){
    fun toEntity(): Account {
        return Account(null, firstName, lastName, address, IBAN, currency, balance, Date())
    }
}


