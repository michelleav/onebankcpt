package nl.onebank.onebankcpt.repository

import nl.onebank.onebankcpt.entity.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<Account, Long> {
}