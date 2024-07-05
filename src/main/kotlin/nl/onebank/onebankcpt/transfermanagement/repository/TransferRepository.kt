package nl.onebank.onebankcpt.transfermanagement.repository

import nl.onebank.onebankcpt.accountmanagement.entity.Transfer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferRepository : JpaRepository<Transfer, Long> {
}