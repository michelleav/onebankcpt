package nl.onebank.onebankcpt.service

import nl.onebank.onebankcpt.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val accountRepository: AccountRepository) {
}