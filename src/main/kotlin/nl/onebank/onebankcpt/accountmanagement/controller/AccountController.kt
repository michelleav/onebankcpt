package nl.onebank.onebankcpt.accountmanagement.controller

import nl.onebank.dto.AccountDto
import nl.onebank.onebankcpt.accountmanagement.entity.Account
import nl.onebank.onebankcpt.accountmanagement.producer.AccountProducer
import nl.onebank.onebankcpt.accountmanagement.service.AccountService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController(private val accountService: AccountService,
    private val accountProducer: AccountProducer) {

    @PostMapping("/obcpt/account")
    fun createAccount(@RequestBody accountDto: AccountDto) : Account {
        var account = accountService.createAccount(accountDto)
        accountProducer.sendNewAccountDtoMessage(accountDto)
        return account
    }
}