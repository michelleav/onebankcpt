package nl.onebank.onebankcpt.accountmanagement.service

import nl.onebank.onebankcpt.accountmanagement.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val accountRepository: AccountRepository) {
}