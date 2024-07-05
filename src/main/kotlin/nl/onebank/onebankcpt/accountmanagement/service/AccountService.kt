package nl.onebank.onebankcpt.accountmanagement.service

import nl.onebank.dto.AccountDto
import nl.onebank.onebankcpt.accountmanagement.entity.Account
import nl.onebank.onebankcpt.accountmanagement.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val accountRepository: AccountRepository) {
    fun createAccount(accountDto: AccountDto): Account {
        var account = accountDto.toEntity()
        accountRepository.save(account)
        return account
    }
}