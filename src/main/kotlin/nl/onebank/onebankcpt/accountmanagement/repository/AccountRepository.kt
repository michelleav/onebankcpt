package nl.onebank.onebankcpt.accountmanagement.repository

import nl.onebank.onebankcpt.accountmanagement.entity.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<Account, Long> {
}